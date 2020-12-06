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

import com.qz.djmall.user.entity.UmsUserLoginLogEntity;
import com.qz.djmall.user.service.UmsUserLoginLogService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 用户登陆记录表
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 11:42:13
 */
@RestController
@RequestMapping("user/umsuserloginlog")
public class UmsUserLoginLogController {
    @Autowired
    private UmsUserLoginLogService umsUserLoginLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("user:umsuserloginlog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsUserLoginLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("user:umsuserloginlog:info")
    public R info(@PathVariable("id") Long id){
		UmsUserLoginLogEntity umsUserLoginLog = umsUserLoginLogService.getById(id);

        return R.ok().put("umsUserLoginLog", umsUserLoginLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("user:umsuserloginlog:save")
    public R save(@RequestBody UmsUserLoginLogEntity umsUserLoginLog){
		umsUserLoginLogService.save(umsUserLoginLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("user:umsuserloginlog:update")
    public R update(@RequestBody UmsUserLoginLogEntity umsUserLoginLog){
		umsUserLoginLogService.updateById(umsUserLoginLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("user:umsuserloginlog:delete")
    public R delete(@RequestBody Long[] ids){
		umsUserLoginLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
