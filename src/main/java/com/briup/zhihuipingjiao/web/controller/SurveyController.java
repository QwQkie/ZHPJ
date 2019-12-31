package com.briup.zhihuipingjiao.web.controller;

import com.briup.zhihuipingjiao.Service.ISurveyService;
import com.briup.zhihuipingjiao.bean.Survey;
import com.briup.zhihuipingjiao.bean.ex.QqnEX;
import com.briup.zhihuipingjiao.util.Message;
import com.briup.zhihuipingjiao.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/survey")
@Api(description = "课调管理")
public class SurveyController {
    @Autowired
    private ISurveyService iSurveyService;

    @GetMapping("/StartOrEnd")
    @ApiOperation("zenggai")
    public Message saveOrUpdate(Survey survey){
        iSurveyService.saveOrUpdate(survey);
        return  MessageUtil.success();

    }
    @GetMapping("/selectJindu")
    public  Message selectJindu(int id){
       Survey survey = iSurveyService.selectSurvey(id);
        return MessageUtil.success(survey);
    }
}
