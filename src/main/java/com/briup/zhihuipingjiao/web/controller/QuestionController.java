package com.briup.zhihuipingjiao.web.controller;

import com.briup.zhihuipingjiao.bean.Options;
import com.briup.zhihuipingjiao.bean.Question;
import com.briup.zhihuipingjiao.bean.ex.OptionsEX;
import com.briup.zhihuipingjiao.bean.ex.QuestionEX;
import com.briup.zhihuipingjiao.service.IOptionsService;
import com.briup.zhihuipingjiao.service.IQuestionService;
import com.briup.zhihuipingjiao.util.Message;
import com.briup.zhihuipingjiao.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;

@RestController
@RequestMapping("/question")
@Api(description = "题库管理")
public class QuestionController {
    @Autowired
    private IQuestionService iQuestionService;
    @Autowired
    private IOptionsService iOptionsService;
    @GetMapping("/findAll")
    @ApiOperation(value ="查询所有题目" )
    public Message findAll(){
        List<QuestionEX> questions = iQuestionService.findAll();
        return MessageUtil.success(questions);
    }
    @GetMapping("/search")
    @ApiOperation(value = "搜索")
    public  Message search(String key){
        List<QuestionEX> list = iQuestionService.search(key);
        return MessageUtil.success(list);
    }
    @PostMapping ("/add")
    @ApiOperation(value = "添加题目")
    public Message add(Question question, @RequestBody List<Options> options){
        iQuestionService.saveOrUpdate(question);
        for (Options option : options) {
            option.setQuestionId(question.getId());
            iOptionsService.saveOrUpdate(option);
        }
        return MessageUtil.success();
    }
    @GetMapping("/delete")
    @ApiOperation(value = "根据id删除")
    public Message delete(int id){
        iQuestionService.delete(id);
        return MessageUtil.success();
    }
    @GetMapping("/deleteBush")
    @ApiOperation(value = "批量删除")
    public Message deleteBush(int[] ids){
        for (int id : ids) {
            iQuestionService.delete(id);
        }
        return MessageUtil.success();
    }
    @PostMapping("/update")
    @ApiOperation(value = "修改题目")
    public Message update(Question question, @RequestBody List<Options> options){
        iQuestionService.saveOrUpdate(question);
        for (Options option : options) {
            option.setQuestionId(question.getId());

            iOptionsService.saveOrUpdate(option);
        }
        return MessageUtil.success();
    }
}
