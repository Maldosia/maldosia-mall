package com.maldosia.mall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.maldosia.mall.product.entity.AttrEntity;
import com.maldosia.mall.product.service.AttrAttrgroupRelationService;
import com.maldosia.mall.product.service.AttrService;
import com.maldosia.mall.product.service.CategoryService;
import com.maldosia.mall.product.vo.AttrGroupRelationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.maldosia.mall.product.entity.AttrGroupEntity;
import com.maldosia.mall.product.service.AttrGroupService;
import com.maldosia.mall.common.utils.PageUtils;
import com.maldosia.mall.common.utils.R;



/**
 * 属性分组
 *
 * @author maldosia
 * @email maldosiaWL@gmail.com
 * @date 2021-04-18 20:58:35
 */
@RestController
@RequestMapping("product/attrgroup")
public class AttrGroupController {
    @Autowired
    private AttrGroupService attrGroupService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private AttrService attrService;

    @Autowired
    private AttrAttrgroupRelationService attrAttrgroupRelationService;

    @PostMapping(value = "/attr/relation")
    public R addRelation(@RequestBody List<AttrGroupRelationVo> vos) {

        attrAttrgroupRelationService.saveBatch(vos);

        return R.ok();

    }

    /**
     * 获取属性分组没有关联的其他属性
     */
    @GetMapping(value = "/{attrgroupId}/noattr/relation")
    public R attrNoattrRelation(@RequestParam Map<String, Object> params,
                                @PathVariable("attrgroupId") Long attrgroupId) {

        // List<AttrEntity> entities = attrService.getRelationAttr(attrgroupId);

        PageUtils page = attrService.getNoRelationAttr(params,attrgroupId);

        return R.ok().put("page",page);
    }

    @PostMapping(value = "/attr/relation/delete")
    public R deleteRelation(@RequestBody AttrGroupRelationVo[] vos) {

        attrService.deleteRelation(vos);

        return R.ok();
    }

    @GetMapping("/{attrGroupId}/attr/relation")
    public R attrRelation(@PathVariable("attrGroupId") Long attrGroupId) {
        List<AttrEntity> entityList = attrService.getRelationAttr(attrGroupId);
        return R.ok().put("data",entityList);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = attrGroupService.queryPage(params);

        return R.ok().put("data", page);
    }

    /**
     * 列表
     */
    @RequestMapping("/list/{catelogId}")
    public R list(@RequestParam Map<String, Object> params,@PathVariable("catelogId") Long catelogId){
//        PageUtils page = attrGroupService.queryPage(params);

        PageUtils page = attrGroupService.queryPage(params,catelogId);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{attrGroupId}")
    public R info(@PathVariable("attrGroupId") Long attrGroupId){
		AttrGroupEntity attrGroup = attrGroupService.getById(attrGroupId);

        Long catelogId = attrGroup.getCatelogId();
        Long[] path = categoryService.findCatelogPath(catelogId);
        attrGroup.setCatelogPath(path);

        return R.ok().put("attrGroup", attrGroup);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AttrGroupEntity attrGroup){
		attrGroupService.save(attrGroup);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AttrGroupEntity attrGroup){
		attrGroupService.updateById(attrGroup);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] attrGroupIds){
		attrGroupService.removeByIds(Arrays.asList(attrGroupIds));

        return R.ok();
    }

}
