package com.qz.djmall.user.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qz.djmall.user.entity.UmsIntegrationHistoryEntity;
import com.qz.djmall.user.service.UmsIntegrationHistoryService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 购物积分记录表
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 11:42:13
 */
@RestController
@RequestMapping("user/umsintegrationhistory")
public class UmsIntegrationHistoryController {
    @Autowired
    private UmsIntegrationHistoryService umsIntegrationHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("user:umsintegrationhistory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsIntegrationHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("user:umsintegrationhistory:info")
    public R info(@PathVariable("id") Long id){
		UmsIntegrationHistoryEntity umsIntegrationHistory = umsIntegrationHistoryService.getById(id);

        return R.ok().put("umsIntegrationHistory", umsIntegrationHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("user:umsintegrationhistory:save")
    public R save(@RequestBody UmsIntegrationHistoryEntity umsIntegrationHistory){
		umsIntegrationHistoryService.save(umsIntegrationHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("user:umsintegrationhistory:update")
    public R update(@RequestBody UmsIntegrationHistoryEntity umsIntegrationHistory){
		umsIntegrationHistoryService.updateById(umsIntegrationHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("user:umsintegrationhistory:delete")
    public R delete(@RequestBody Long[] ids){
		umsIntegrationHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
