package com.briup.zhihuipingjiao.web.controller;

import com.briup.zhihuipingjiao.bean.Clazz;
import com.briup.zhihuipingjiao.bean.ex.ClazzEX;
import com.briup.zhihuipingjiao.service.IClazzService;
import com.briup.zhihuipingjiao.util.Message;
import com.briup.zhihuipingjiao.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Class")
@Api(description = "班级管理")
public class ClazzController {
    @Autowired
    private IClazzService clazzService;

    @ApiOperation(value = "查询所有班级")
    @GetMapping("/selectClass")
    public Message selectAllEX(){
        List<ClazzEX> list = clazzService.findAllEX();
        return MessageUtil.success(list);
    }
    @ApiOperation(value = "添加班级信息")
    @PostMapping("/saveClass")
    public Message saveClass(Clazz clazz){

        clazzService.save(clazz);
        return MessageUtil.success();
    }

    @ApiOperation(value = "根据ID删除数据")
    @PostMapping("/deleteById")
    public Message deleteById(int id){
        clazzService.deleteById(id);
        return MessageUtil.success();
    }

    @GetMapping("/deleteBatch")
    @ApiOperation(value = "批量删除数据")
    public Message deleteBatch(int[] ids){
        for (int id : ids){
            clazzService.deleteById(id);
        }
        return MessageUtil.success();
    }

    @ApiOperation(value = "关键字搜索")
    @GetMapping("/serch")
    public Message serch(String key,String word){
        clazzService.searchEx(key, word);
        return MessageUtil.success();
    }
}
