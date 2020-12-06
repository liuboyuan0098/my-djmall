package com.qz.djmall.ware.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qz.djmall.ware.entity.WmsWareEntity;
import com.qz.djmall.ware.service.WmsWareService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 仓库信息
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 16:58:56
 */
@RestController
@RequestMapping("ware/wmsware")
public class WmsWareController {
    @Autowired
    private WmsWareService wmsWareService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ware:wmsware:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wmsWareService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("ware:wmsware:info")
    public R info(@PathVariable("id") Long id){
		WmsWareEntity wmsWare = wmsWareService.getById(id);

        return R.ok().put("wmsWare", wmsWare);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ware:wmsware:save")
    public R save(@RequestBody WmsWareEntity wmsWare){
		wmsWareService.save(wmsWare);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ware:wmsware:update")
    public R update(@RequestBody WmsWareEntity wmsWare){
		wmsWareService.updateById(wmsWare);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ware:wmsware:delete")
    public R delete(@RequestBody Long[] ids){
		wmsWareService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
