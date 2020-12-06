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

import com.qz.djmall.user.entity.UmsUserAddressEntity;
import com.qz.djmall.user.service.UmsUserAddressService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 收货地址表
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 11:42:13
 */
@RestController
@RequestMapping("user/umsuseraddress")
public class UmsUserAddressController {
    @Autowired
    private UmsUserAddressService umsUserAddressService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("user:umsuseraddress:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsUserAddressService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("user:umsuseraddress:info")
    public R info(@PathVariable("id") Long id){
		UmsUserAddressEntity umsUserAddress = umsUserAddressService.getById(id);

        return R.ok().put("umsUserAddress", umsUserAddress);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("user:umsuseraddress:save")
    public R save(@RequestBody UmsUserAddressEntity umsUserAddress){
		umsUserAddressService.save(umsUserAddress);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("user:umsuseraddress:update")
    public R update(@RequestBody UmsUserAddressEntity umsUserAddress){
		umsUserAddressService.updateById(umsUserAddress);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("user:umsuseraddress:delete")
    public R delete(@RequestBody Long[] ids){
		umsUserAddressService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
