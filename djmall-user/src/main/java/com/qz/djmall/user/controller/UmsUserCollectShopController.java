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

import com.qz.djmall.user.entity.UmsUserCollectShopEntity;
import com.qz.djmall.user.service.UmsUserCollectShopService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 关注店铺表
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 11:42:13
 */
@RestController
@RequestMapping("user/umsusercollectshop")
public class UmsUserCollectShopController {
    @Autowired
    private UmsUserCollectShopService umsUserCollectShopService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("user:umsusercollectshop:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsUserCollectShopService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("user:umsusercollectshop:info")
    public R info(@PathVariable("id") Long id){
		UmsUserCollectShopEntity umsUserCollectShop = umsUserCollectShopService.getById(id);

        return R.ok().put("umsUserCollectShop", umsUserCollectShop);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("user:umsusercollectshop:save")
    public R save(@RequestBody UmsUserCollectShopEntity umsUserCollectShop){
		umsUserCollectShopService.save(umsUserCollectShop);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("user:umsusercollectshop:update")
    public R update(@RequestBody UmsUserCollectShopEntity umsUserCollectShop){
		umsUserCollectShopService.updateById(umsUserCollectShop);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("user:umsusercollectshop:delete")
    public R delete(@RequestBody Long[] ids){
		umsUserCollectShopService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
