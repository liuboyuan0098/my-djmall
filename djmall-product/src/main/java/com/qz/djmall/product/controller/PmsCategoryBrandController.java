package com.qz.djmall.product.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qz.djmall.product.entity.PmsCategoryBrandEntity;
import com.qz.djmall.product.service.PmsCategoryBrandService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 品牌分类关联
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-11-25 20:56:09
 */
@RestController
@RequestMapping("product/pmscategorybrand")
public class PmsCategoryBrandController {
    @Autowired
    private PmsCategoryBrandService pmsCategoryBrandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:pmscategorybrand:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsCategoryBrandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:pmscategorybrand:info")
    public R info(@PathVariable("id") Long id){
		PmsCategoryBrandEntity pmsCategoryBrand = pmsCategoryBrandService.getById(id);

        return R.ok().put("pmsCategoryBrand", pmsCategoryBrand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:pmscategorybrand:save")
    public R save(@RequestBody PmsCategoryBrandEntity pmsCategoryBrand){
		pmsCategoryBrandService.save(pmsCategoryBrand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:pmscategorybrand:update")
    public R update(@RequestBody PmsCategoryBrandEntity pmsCategoryBrand){
		pmsCategoryBrandService.updateById(pmsCategoryBrand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:pmscategorybrand:delete")
    public R delete(@RequestBody Long[] ids){
		pmsCategoryBrandService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
