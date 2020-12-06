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

import com.qz.djmall.product.entity.PmsSpuDescEntity;
import com.qz.djmall.product.service.PmsSpuDescService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * spu信息介绍
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-11-25 20:56:09
 */
@RestController
@RequestMapping("product/pmsspudesc")
public class PmsSpuDescController {
    @Autowired
    private PmsSpuDescService pmsSpuDescService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:pmsspudesc:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSpuDescService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{spuId}")
    //@RequiresPermissions("product:pmsspudesc:info")
    public R info(@PathVariable("spuId") Long spuId){
		PmsSpuDescEntity pmsSpuDesc = pmsSpuDescService.getById(spuId);

        return R.ok().put("pmsSpuDesc", pmsSpuDesc);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:pmsspudesc:save")
    public R save(@RequestBody PmsSpuDescEntity pmsSpuDesc){
		pmsSpuDescService.save(pmsSpuDesc);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:pmsspudesc:update")
    public R update(@RequestBody PmsSpuDescEntity pmsSpuDesc){
		pmsSpuDescService.updateById(pmsSpuDesc);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:pmsspudesc:delete")
    public R delete(@RequestBody Long[] spuIds){
		pmsSpuDescService.removeByIds(Arrays.asList(spuIds));

        return R.ok();
    }

}
