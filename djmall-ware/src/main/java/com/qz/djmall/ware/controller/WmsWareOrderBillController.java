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

import com.qz.djmall.ware.entity.WmsWareOrderBillEntity;
import com.qz.djmall.ware.service.WmsWareOrderBillService;
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
@RequestMapping("ware/wmswareorderbill")
public class WmsWareOrderBillController {
    @Autowired
    private WmsWareOrderBillService wmsWareOrderBillService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ware:wmswareorderbill:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wmsWareOrderBillService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("ware:wmswareorderbill:info")
    public R info(@PathVariable("id") Long id){
		WmsWareOrderBillEntity wmsWareOrderBill = wmsWareOrderBillService.getById(id);

        return R.ok().put("wmsWareOrderBill", wmsWareOrderBill);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ware:wmswareorderbill:save")
    public R save(@RequestBody WmsWareOrderBillEntity wmsWareOrderBill){
		wmsWareOrderBillService.save(wmsWareOrderBill);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ware:wmswareorderbill:update")
    public R update(@RequestBody WmsWareOrderBillEntity wmsWareOrderBill){
		wmsWareOrderBillService.updateById(wmsWareOrderBill);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ware:wmswareorderbill:delete")
    public R delete(@RequestBody Long[] ids){
		wmsWareOrderBillService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
