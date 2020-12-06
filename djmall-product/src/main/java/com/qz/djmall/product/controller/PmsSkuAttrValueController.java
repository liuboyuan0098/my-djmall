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

import com.qz.djmall.product.entity.PmsSkuAttrValueEntity;
import com.qz.djmall.product.service.PmsSkuAttrValueService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * sku销售属性&值
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-11-25 20:56:08
 */
@RestController
@RequestMapping("product/pmsskuattrvalue")
public class PmsSkuAttrValueController {
    @Autowired
    private PmsSkuAttrValueService pmsSkuAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:pmsskuattrvalue:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSkuAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:pmsskuattrvalue:info")
    public R info(@PathVariable("id") Long id){
		PmsSkuAttrValueEntity pmsSkuAttrValue = pmsSkuAttrValueService.getById(id);

        return R.ok().put("pmsSkuAttrValue", pmsSkuAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:pmsskuattrvalue:save")
    public R save(@RequestBody PmsSkuAttrValueEntity pmsSkuAttrValue){
		pmsSkuAttrValueService.save(pmsSkuAttrValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:pmsskuattrvalue:update")
    public R update(@RequestBody PmsSkuAttrValueEntity pmsSkuAttrValue){
		pmsSkuAttrValueService.updateById(pmsSkuAttrValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:pmsskuattrvalue:delete")
    public R delete(@RequestBody Long[] ids){
		pmsSkuAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
