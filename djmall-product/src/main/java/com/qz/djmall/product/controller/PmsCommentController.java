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

import com.qz.djmall.product.entity.PmsCommentEntity;
import com.qz.djmall.product.service.PmsCommentService;
import com.qz.common.utils.PageUtils;
import com.qz.common.utils.R;



/**
 * 商品评价
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-11-25 20:56:09
 */
@RestController
@RequestMapping("product/pmscomment")
public class PmsCommentController {
    @Autowired
    private PmsCommentService pmsCommentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:pmscomment:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsCommentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:pmscomment:info")
    public R info(@PathVariable("id") Long id){
		PmsCommentEntity pmsComment = pmsCommentService.getById(id);

        return R.ok().put("pmsComment", pmsComment);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:pmscomment:save")
    public R save(@RequestBody PmsCommentEntity pmsComment){
		pmsCommentService.save(pmsComment);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:pmscomment:update")
    public R update(@RequestBody PmsCommentEntity pmsComment){
		pmsCommentService.updateById(pmsComment);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:pmscomment:delete")
    public R delete(@RequestBody Long[] ids){
		pmsCommentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
