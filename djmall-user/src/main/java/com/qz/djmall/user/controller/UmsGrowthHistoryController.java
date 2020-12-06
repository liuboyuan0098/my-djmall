package com.qz.djmall.user.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qz.djmall.user.entity.UmsGrowthHistoryEntity;
import com.qz.djmall.user.service.UmsGrowthHistoryService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 成长积分记录表
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 11:42:13
 */
@RestController
@RequestMapping("user/umsgrowthhistory")
public class UmsGrowthHistoryController {
    @Autowired
    private UmsGrowthHistoryService umsGrowthHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("user:umsgrowthhistory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsGrowthHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("user:umsgrowthhistory:info")
    public R info(@PathVariable("id") Long id){
		UmsGrowthHistoryEntity umsGrowthHistory = umsGrowthHistoryService.getById(id);

        return R.ok().put("umsGrowthHistory", umsGrowthHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("user:umsgrowthhistory:save")
    public R save(@RequestBody UmsGrowthHistoryEntity umsGrowthHistory){
		umsGrowthHistoryService.save(umsGrowthHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("user:umsgrowthhistory:update")
    public R update(@RequestBody UmsGrowthHistoryEntity umsGrowthHistory){
		umsGrowthHistoryService.updateById(umsGrowthHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("user:umsgrowthhistory:delete")
    public R delete(@RequestBody Long[] ids){
		umsGrowthHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
