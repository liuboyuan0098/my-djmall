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

import com.qz.djmall.ware.entity.WmsWareOrderBillDetailEntity;
import com.qz.djmall.ware.service.WmsWareOrderBillDetailService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 库存工作单
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 16:58:56
 */
@RestController
@RequestMapping("ware/wmswareorderbilldetail")
public class WmsWareOrderBillDetailController {
    @Autowired
    private WmsWareOrderBillDetailService wmsWareOrderBillDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ware:wmswareorderbilldetail:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wmsWareOrderBillDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("ware:wmswareorderbilldetail:info")
    public R info(@PathVariable("id") Long id){
		WmsWareOrderBillDetailEntity wmsWareOrderBillDetail = wmsWareOrderBillDetailService.getById(id);

        return R.ok().put("wmsWareOrderBillDetail", wmsWareOrderBillDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ware:wmswareorderbilldetail:save")
    public R save(@RequestBody WmsWareOrderBillDetailEntity wmsWareOrderBillDetail){
		wmsWareOrderBillDetailService.save(wmsWareOrderBillDetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ware:wmswareorderbilldetail:update")
    public R update(@RequestBody WmsWareOrderBillDetailEntity wmsWareOrderBillDetail){
		wmsWareOrderBillDetailService.updateById(wmsWareOrderBillDetail);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ware:wmswareorderbilldetail:delete")
    public R delete(@RequestBody Long[] ids){
		wmsWareOrderBillDetailService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
