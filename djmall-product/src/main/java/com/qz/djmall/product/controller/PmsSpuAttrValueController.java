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

import com.qz.djmall.product.entity.PmsSpuAttrValueEntity;
import com.qz.djmall.product.service.PmsSpuAttrValueService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * spu属性值
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-11-25 20:56:09
 */
@RestController
@RequestMapping("product/pmsspuattrvalue")
public class PmsSpuAttrValueController {
    @Autowired
    private PmsSpuAttrValueService pmsSpuAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:pmsspuattrvalue:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSpuAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:pmsspuattrvalue:info")
    public R info(@PathVariable("id") Long id){
		PmsSpuAttrValueEntity pmsSpuAttrValue = pmsSpuAttrValueService.getById(id);

        return R.ok().put("pmsSpuAttrValue", pmsSpuAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:pmsspuattrvalue:save")
    public R save(@RequestBody PmsSpuAttrValueEntity pmsSpuAttrValue){
		pmsSpuAttrValueService.save(pmsSpuAttrValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:pmsspuattrvalue:update")
    public R update(@RequestBody PmsSpuAttrValueEntity pmsSpuAttrValue){
		pmsSpuAttrValueService.updateById(pmsSpuAttrValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:pmsspuattrvalue:delete")
    public R delete(@RequestBody Long[] ids){
		pmsSpuAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
