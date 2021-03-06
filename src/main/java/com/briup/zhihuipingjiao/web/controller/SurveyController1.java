package com.briup.zhihuipingjiao.web.controller;

import com.briup.zhihuipingjiao.bean.Survey;
import com.briup.zhihuipingjiao.service.ISurveyService;
import com.briup.zhihuipingjiao.util.Message;
import com.briup.zhihuipingjiao.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "课调监控")
@RequestMapping("service1")
public class SurveyController1 {
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
