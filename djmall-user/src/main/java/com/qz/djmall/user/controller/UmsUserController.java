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

import com.qz.djmall.user.entity.UmsUserEntity;
import com.qz.djmall.user.service.UmsUserService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 用户表
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 11:42:13
 */
@RestController
@RequestMapping("user/umsuser")
public class UmsUserController {
    @Autowired
    private UmsUserService umsUserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("user:umsuser:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsUserService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("user:umsuser:info")
    public R info(@PathVariable("id") Long id){
		UmsUserEntity umsUser = umsUserService.getById(id);

        return R.ok().put("umsUser", umsUser);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("user:umsuser:save")
    public R save(@RequestBody UmsUserEntity umsUser){
		umsUserService.save(umsUser);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("user:umsuser:update")
    public R update(@RequestBody UmsUserEntity umsUser){
		umsUserService.updateById(umsUser);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("user:umsuser:delete")
    public R delete(@RequestBody Long[] ids){
		umsUserService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
