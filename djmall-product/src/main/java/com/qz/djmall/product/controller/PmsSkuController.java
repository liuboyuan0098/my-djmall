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

import com.qz.djmall.product.entity.PmsSkuEntity;
import com.qz.djmall.product.service.PmsSkuService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * sku信息
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-11-25 20:56:09
 */
@RestController
@RequestMapping("product/pmssku")
public class PmsSkuController {
    @Autowired
    private PmsSkuService pmsSkuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:pmssku:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSkuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:pmssku:info")
    public R info(@PathVariable("id") Long id){
		PmsSkuEntity pmsSku = pmsSkuService.getById(id);

        return R.ok().put("pmsSku", pmsSku);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:pmssku:save")
    public R save(@RequestBody PmsSkuEntity pmsSku){
		pmsSkuService.save(pmsSku);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:pmssku:update")
    public R update(@RequestBody PmsSkuEntity pmsSku){
		pmsSkuService.updateById(pmsSku);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:pmssku:delete")
    public R delete(@RequestBody Long[] ids){
		pmsSkuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
