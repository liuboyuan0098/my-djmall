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

import com.qz.djmall.product.entity.PmsSpuEntity;
import com.qz.djmall.product.service.PmsSpuService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * spu信息
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-11-25 20:56:09
 */
@RestController
@RequestMapping("product/pmsspu")
public class PmsSpuController {
    @Autowired
    private PmsSpuService pmsSpuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:pmsspu:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSpuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:pmsspu:info")
    public R info(@PathVariable("id") Long id){
		PmsSpuEntity pmsSpu = pmsSpuService.getById(id);

        return R.ok().put("pmsSpu", pmsSpu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:pmsspu:save")
    public R save(@RequestBody PmsSpuEntity pmsSpu){
		pmsSpuService.save(pmsSpu);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:pmsspu:update")
    public R update(@RequestBody PmsSpuEntity pmsSpu){
		pmsSpuService.updateById(pmsSpu);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:pmsspu:delete")
    public R delete(@RequestBody Long[] ids){
		pmsSpuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
