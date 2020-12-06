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

import com.qz.djmall.user.entity.UmsUserLevelEntity;
import com.qz.djmall.user.service.UmsUserLevelService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 会员等级表
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 11:42:13
 */
@RestController
@RequestMapping("user/umsuserlevel")
public class UmsUserLevelController {
    @Autowired
    private UmsUserLevelService umsUserLevelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("user:umsuserlevel:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsUserLevelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("user:umsuserlevel:info")
    public R info(@PathVariable("id") Long id){
		UmsUserLevelEntity umsUserLevel = umsUserLevelService.getById(id);

        return R.ok().put("umsUserLevel", umsUserLevel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("user:umsuserlevel:save")
    public R save(@RequestBody UmsUserLevelEntity umsUserLevel){
		umsUserLevelService.save(umsUserLevel);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("user:umsuserlevel:update")
    public R update(@RequestBody UmsUserLevelEntity umsUserLevel){
		umsUserLevelService.updateById(umsUserLevel);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("user:umsuserlevel:delete")
    public R delete(@RequestBody Long[] ids){
		umsUserLevelService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
