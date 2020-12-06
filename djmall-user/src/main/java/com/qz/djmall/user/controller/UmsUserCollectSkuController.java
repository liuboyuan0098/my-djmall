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

import com.qz.djmall.user.entity.UmsUserCollectSkuEntity;
import com.qz.djmall.user.service.UmsUserCollectSkuService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 关注商品表
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 11:42:13
 */
@RestController
@RequestMapping("user/umsusercollectsku")
public class UmsUserCollectSkuController {
    @Autowired
    private UmsUserCollectSkuService umsUserCollectSkuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("user:umsusercollectsku:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsUserCollectSkuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("user:umsusercollectsku:info")
    public R info(@PathVariable("id") Long id){
		UmsUserCollectSkuEntity umsUserCollectSku = umsUserCollectSkuService.getById(id);

        return R.ok().put("umsUserCollectSku", umsUserCollectSku);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("user:umsusercollectsku:save")
    public R save(@RequestBody UmsUserCollectSkuEntity umsUserCollectSku){
		umsUserCollectSkuService.save(umsUserCollectSku);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("user:umsusercollectsku:update")
    public R update(@RequestBody UmsUserCollectSkuEntity umsUserCollectSku){
		umsUserCollectSkuService.updateById(umsUserCollectSku);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("user:umsusercollectsku:delete")
    public R delete(@RequestBody Long[] ids){
		umsUserCollectSkuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
