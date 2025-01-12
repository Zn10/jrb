package com.zn.jrb.core.controller.admin;

import com.zn.common.exception.Assert;
import com.zn.common.result.R;
import com.zn.common.result.ResponseEnum;
import com.zn.jrb.core.pojo.entity.IntegralGrade;
import com.zn.jrb.core.service.IntegralGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName: AdminIntegralGradeController
 * Package: com.zn.jrb.core.controller.admin
 * Description: 积分等级管理
 * Created on 2025/1/12-12:30
 *
 * @author zhaonian
 */
@Api(tags = "积分等级管理")
@CrossOrigin
@RestController
@RequestMapping("/admin/core/integralGrade")
@Slf4j
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService integralGradeService;

    @ApiOperation("更新积分等级")
    @PutMapping("/update")
    public R updateById(@ApiParam(value = "积分等级对象", required = true) @RequestBody IntegralGrade integralGrade) {
        log.info("更新积分等级{},", integralGrade);
        boolean result = integralGradeService.updateById(integralGrade);
        if (result) {
            return R.ok().message("修改成功");
        } else {
            return R.error().message("修改失败");
        }
    }

    @ApiOperation("根据id获取积分等级")
    @GetMapping("/get/{id}")
    public R getById(@ApiParam(value = "数据id", required = true, example = "1") @PathVariable Long id) {
        log.info("根据id获取积分等级{}", id);
        IntegralGrade integralGrade = integralGradeService.getById(id);
        if (integralGrade != null) {
            return R.ok().data("record", integralGrade);
        } else {
            return R.error().message("数据不存在");
        }
    }

    @ApiOperation("新增积分等级")
    @PostMapping("/save")
    public R save(@ApiParam(value = "积分等级对象", required = true) @RequestBody IntegralGrade integralGrade) {
        log.info("新增积分等级{}", integralGrade);
        Assert.notNull(integralGrade.getBorrowAmount(), ResponseEnum.BORROW_AMOUNT_NULL_ERROR);
        boolean result = integralGradeService.save(integralGrade);
        if (result) {
            return R.ok().message("保存成功");
        } else {
            return R.error().message("保存失败");
        }
    }

    @ApiOperation(value = "根据id删除积分等级", notes = "逻辑删除")
    @DeleteMapping("/remove/{id}")
    public R removeById(@ApiParam(value = "数据id", required = true, example = "1") @PathVariable Long id) {
        log.info("根据id删除积分等级{}", id);
        boolean result = integralGradeService.removeById(id);
        if (result) {
            return R.ok().message("删除成功");
        } else {
            return R.error().message("删除失败");
        }
    }

    @ApiOperation("积分等级列表")
    @GetMapping("/list")
    public R listAll() {
        log.info("积分等级列表");
        List<IntegralGrade> list = integralGradeService.list();
        return R.ok().data("list", list);
    }
}
