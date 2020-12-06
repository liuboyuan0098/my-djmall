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

import com.qz.djmall.user.entity.UmsUserStatisticsEntity;
import com.qz.djmall.user.service.UmsUserStatisticsService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 统计信息表
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 11:42:13
 */
@RestController
@RequestMapping("user/umsuserstatistics")
public class UmsUserStatisticsController {
    @Autowired
    private UmsUserStatisticsService umsUserStatisticsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("user:umsuserstatistics:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsUserStatisticsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("user:umsuserstatistics:info")
    public R info(@PathVariable("id") Long id){
		UmsUserStatisticsEntity umsUserStatistics = umsUserStatisticsService.getById(id);

        return R.ok().put("umsUserStatistics", umsUserStatistics);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("user:umsuserstatistics:save")
    public R save(@RequestBody UmsUserStatisticsEntity umsUserStatistics){
		umsUserStatisticsService.save(umsUserStatistics);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("user:umsuserstatistics:update")
    public R update(@RequestBody UmsUserStatisticsEntity umsUserStatistics){
		umsUserStatisticsService.updateById(umsUserStatistics);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("user:umsuserstatistics:delete")
    public R delete(@RequestBody Long[] ids){
		umsUserStatisticsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
