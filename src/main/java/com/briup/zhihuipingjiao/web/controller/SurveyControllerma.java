package com.briup.zhihuipingjiao.web.controller;

import com.briup.zhihuipingjiao.bean.ex.SurveyEXma;
import com.briup.zhihuipingjiao.service.ISurveyServicema;
import com.briup.zhihuipingjiao.util.Message;
import com.briup.zhihuipingjiao.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SurveyControllerma {
    @Autowired
    private ISurveyServicema surveyService;

    @GetMapping("/findAllmessage")
    public Message findAllmessage() {
        List<SurveyEXma> list = surveyService.findAllmessage();
        return MessageUtil.success(list);
    }
}
