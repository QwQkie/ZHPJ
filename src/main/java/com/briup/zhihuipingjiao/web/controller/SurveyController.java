package com.briup.zhihuipingjiao.web.controller;

import com.briup.zhihuipingjiao.bean.Survey;
import com.briup.zhihuipingjiao.bean.ex.SurveyEX;
import com.briup.zhihuipingjiao.service.ISurveyService;
import com.briup.zhihuipingjiao.util.Message;
import com.briup.zhihuipingjiao.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/survey")
@Api(description = "课调管理")
public class SurveyController {

    @Autowired
    private ISurveyService iSurveyService;
    @GetMapping("/findAll")
    @ApiOperation(value = "查询所有课调")
    public Message findAll(){
        List<SurveyEX> list = iSurveyService.findAll();
        return MessageUtil.success(list);
    }
    @GetMapping("/show")
    @ApiOperation(value = "预览")
    public Message show(int id){
        SurveyEX show = iSurveyService.show(id);
        return MessageUtil.success(show);
    }
    @PostMapping("/add")
    @ApiOperation(value = "添加课调")
    public Message add(Survey survey){
        iSurveyService.saveOrUpdate1(survey);
        return MessageUtil.success();
    }
    @PostMapping("/update")
    @ApiOperation(value = "修改课调")
    @ApiImplicitParam(name = "id" ,value = "课调id",paramType = "query",dataType = "int",required = true)
    public Message update(Survey survey){
        iSurveyService.saveOrUpdate1(survey);
        return MessageUtil.success();
    }
    @GetMapping("/delete")
    @ApiOperation(value = "删除课调")
    @ApiImplicitParam(name = "id" ,value = "课调id",paramType = "query",dataType = "int",required = true)
    public Message delete(int id){
        iSurveyService.delete(id);
        return MessageUtil.success();
    }
    @GetMapping("/deleteBatch")
    @ApiOperation(value = "批量删除")
    public Message deleteBatch(int[] ids){
        for (int id : ids) {
            iSurveyService.delete(id);
        }
        return MessageUtil.success();
    }
}


