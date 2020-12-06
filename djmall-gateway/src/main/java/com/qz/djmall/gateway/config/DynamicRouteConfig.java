package com.qz.djmall.gateway.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Executor;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.event.RefreshRoutesEvent;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionWriter;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;

/**
 * 监听路由配置，重新加载路由到网关gateway中，并且使新的路由配置生效
 * @author Administrator
 *
 */
@Component
public class DynamicRouteConfig implements ApplicationEventPublisherAware{
private static final Logger log = LoggerFactory.getLogger(DynamicRouteConfig.class);

	/**
     * nacos 配置中心地址
     */
    @Value("${spring.cloud.nacos.config.server-addr}")
    private String serverAddr;
    
    /**
     * nacos 中路由配置的dataId
     */
    @Value("${nacos.gateway.route.config.data-id}")
    private String dataId;
    
    /**
     * nacos 中路由配置的group
     */
    @Value("${nacos.gateway.route.config.group}")
    private String group;
    
    /**
     * nacos 中路由配置的命名空间id
     */
    @Value("${spring.cloud.nacos.config.namespace}")
    private String namespace;
 
    @Autowired
    private RouteDefinitionWriter routeDefinitionWriter;
 
    private ApplicationEventPublisher applicationEventPublisher;
 
    private static final List<String> ROUTE_LIST = new ArrayList<>();
 
    @PostConstruct
    public void dynamicRouteByNacosListener() {
        try {
        	Properties properties = new Properties();
            properties.setProperty("serverAddr",serverAddr);
            properties.setProperty("namespace",namespace);
            
            /**
             * 通过上面的properties（nacos配置中心的地址和现在要使用的命名空间）
             * 可以确定configService是操作“c001:8848”里面“fadec0d0-927d-4303-b22e-e4387cb997bc”
             * 实际就是操作网关命名空间的configService对象
             */
            ConfigService configService = NacosFactory.createConfigService(properties);
 
            /**
             *  程序首次启动, 并加载初始化路由配置
             *  configService根据dataid和group找到自己的命名空间中的配置
             */
            String initConfigInfo = configService.getConfig(dataId, group, 5000);
            this.addAndPublishBatchRoute(initConfigInfo);
 
            /**
             * 添加监听路由变化
             * 通过指定dataId, group，可以监听当前命名空间下的某一个配置
             * 
             * 就当前情况来说，监听的是api-route.json的变化
             */
            configService.addListener(dataId, group, new Listener() {
            	/**
            	 * 如果路由配置api-route.json发生变化
            	 * 就会走这个receiveConfigInfo方法
            	 */
                @Override
                public void receiveConfigInfo(String configInfo) {
                    clearRoute();//先把之前网关gateway加载路由信息清空
                    try {
                    	//读取最新的api-route.json的路由信息，把这些路由信息重新加到网关gateway
                        List<RouteDefinition> gatewayRouteDefinitions = JSONObject.parseArray(configInfo, RouteDefinition.class);
                        for (RouteDefinition routeDefinition : gatewayRouteDefinitions) {
                            addRoute(routeDefinition);
                        }
                        publish();//网关gateway通过代码添加了路由信息之后，需要发布一下
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
 
                @Override
                public Executor getExecutor() {
                    return null;
                }
            });
        } catch (NacosException e) {
            e.printStackTrace();
        }
    }
 
 
    private void publish() {
        this.applicationEventPublisher.publishEvent(new RefreshRoutesEvent(this.routeDefinitionWriter));
    }
 
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
 
    /**
     * 在网关gateway上
     * 批量 添加及发布 路由
     *
     * @param configInfo 配置文件字符串, 必须为json array格式
     */
    private void addAndPublishBatchRoute(String configInfo) {
        try {
            clearRoute();
            List<RouteDefinition> gatewayRouteDefinitions = JSONObject.parseArray(configInfo, RouteDefinition.class);
            for (RouteDefinition routeDefinition : gatewayRouteDefinitions) {
                addRoute(routeDefinition);
            }
            publish();
            log.info("Dynamic config gateway route finished. {}", JSON.toJSONString(gatewayRouteDefinitions));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /**
     * 在网关gateway上
     * 清除路由信息
     */
    private void clearRoute() {
        for (String id : ROUTE_LIST) {
            this.routeDefinitionWriter.delete(Mono.just(id)).subscribe();
        }
        ROUTE_LIST.clear();
    }
 
    /**
     * 在网关gateway上
     * 添加路由
     *
     * @param definition
     */
    private void addRoute(RouteDefinition definition) {
        try {
            routeDefinitionWriter.save(Mono.just(definition)).subscribe();
            ROUTE_LIST.add(definition.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

