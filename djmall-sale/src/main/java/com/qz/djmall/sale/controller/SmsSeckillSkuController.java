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

import com.qz.djmall.sale.entity.SmsSeckillSkuEntity;
import com.qz.djmall.sale.service.SmsSeckillSkuService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 秒杀活动商品关联
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 17:00:56
 */
@RestController
@RequestMapping("sale/smsseckillsku")
public class SmsSeckillSkuController {
    @Autowired
    private SmsSeckillSkuService smsSeckillSkuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("sale:smsseckillsku:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsSeckillSkuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("sale:smsseckillsku:info")
    public R info(@PathVariable("id") Long id){
		SmsSeckillSkuEntity smsSeckillSku = smsSeckillSkuService.getById(id);

        return R.ok().put("smsSeckillSku", smsSeckillSku);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("sale:smsseckillsku:save")
    public R save(@RequestBody SmsSeckillSkuEntity smsSeckillSku){
		smsSeckillSkuService.save(smsSeckillSku);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("sale:smsseckillsku:update")
    public R update(@RequestBody SmsSeckillSkuEntity smsSeckillSku){
		smsSeckillSkuService.updateById(smsSeckillSku);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("sale:smsseckillsku:delete")
    public R delete(@RequestBody Long[] ids){
		smsSeckillSkuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
