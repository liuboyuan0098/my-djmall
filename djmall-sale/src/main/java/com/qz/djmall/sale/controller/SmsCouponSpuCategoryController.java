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

import com.qz.djmall.sale.entity.SmsCouponSpuCategoryEntity;
import com.qz.djmall.sale.service.SmsCouponSpuCategoryService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 优惠券分类关联
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 17:00:55
 */
@RestController
@RequestMapping("sale/smscouponspucategory")
public class SmsCouponSpuCategoryController {
    @Autowired
    private SmsCouponSpuCategoryService smsCouponSpuCategoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("sale:smscouponspucategory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsCouponSpuCategoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("sale:smscouponspucategory:info")
    public R info(@PathVariable("id") Long id){
		SmsCouponSpuCategoryEntity smsCouponSpuCategory = smsCouponSpuCategoryService.getById(id);

        return R.ok().put("smsCouponSpuCategory", smsCouponSpuCategory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("sale:smscouponspucategory:save")
    public R save(@RequestBody SmsCouponSpuCategoryEntity smsCouponSpuCategory){
		smsCouponSpuCategoryService.save(smsCouponSpuCategory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("sale:smscouponspucategory:update")
    public R update(@RequestBody SmsCouponSpuCategoryEntity smsCouponSpuCategory){
		smsCouponSpuCategoryService.updateById(smsCouponSpuCategory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("sale:smscouponspucategory:delete")
    public R delete(@RequestBody Long[] ids){
		smsCouponSpuCategoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
