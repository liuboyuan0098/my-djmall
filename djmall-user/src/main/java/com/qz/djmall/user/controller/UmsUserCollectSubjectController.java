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

import com.qz.djmall.user.entity.UmsUserCollectSubjectEntity;
import com.qz.djmall.user.service.UmsUserCollectSubjectService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 关注活动表
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 11:42:13
 */
@RestController
@RequestMapping("user/umsusercollectsubject")
public class UmsUserCollectSubjectController {
    @Autowired
    private UmsUserCollectSubjectService umsUserCollectSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("user:umsusercollectsubject:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsUserCollectSubjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("user:umsusercollectsubject:info")
    public R info(@PathVariable("id") Long id){
		UmsUserCollectSubjectEntity umsUserCollectSubject = umsUserCollectSubjectService.getById(id);

        return R.ok().put("umsUserCollectSubject", umsUserCollectSubject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("user:umsusercollectsubject:save")
    public R save(@RequestBody UmsUserCollectSubjectEntity umsUserCollectSubject){
		umsUserCollectSubjectService.save(umsUserCollectSubject);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("user:umsusercollectsubject:update")
    public R update(@RequestBody UmsUserCollectSubjectEntity umsUserCollectSubject){
		umsUserCollectSubjectService.updateById(umsUserCollectSubject);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("user:umsusercollectsubject:delete")
    public R delete(@RequestBody Long[] ids){
		umsUserCollectSubjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
