package com.qz.djmall.sale.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qz.djmall.sale.entity.SmsCouponSpuEntity;
import com.qz.djmall.sale.service.SmsCouponSpuService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 优惠券与产品关联
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 17:00:56
 */
@RestController
@RequestMapping("sale/smscouponspu")
public class SmsCouponSpuController {
    @Autowired
    private SmsCouponSpuService smsCouponSpuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("sale:smscouponspu:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsCouponSpuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("sale:smscouponspu:info")
    public R info(@PathVariable("id") Long id){
		SmsCouponSpuEntity smsCouponSpu = smsCouponSpuService.getById(id);

        return R.ok().put("smsCouponSpu", smsCouponSpu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("sale:smscouponspu:save")
    public R save(@RequestBody SmsCouponSpuEntity smsCouponSpu){
		smsCouponSpuService.save(smsCouponSpu);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("sale:smscouponspu:update")
    public R update(@RequestBody SmsCouponSpuEntity smsCouponSpu){
		smsCouponSpuService.updateById(smsCouponSpu);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("sale:smscouponspu:delete")
    public R delete(@RequestBody Long[] ids){
		smsCouponSpuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
