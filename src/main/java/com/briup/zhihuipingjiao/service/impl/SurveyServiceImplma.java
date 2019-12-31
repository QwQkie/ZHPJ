package com.briup.zhihuipingjiao.service.impl;

import com.briup.zhihuipingjiao.bean.ex.SurveyEXma;
import com.briup.zhihuipingjiao.mapper.ex.SurveyEXmaMapper;
import com.briup.zhihuipingjiao.service.ISurveyServicema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SurveyServiceImplma implements ISurveyServicema {
    @Autowired
    private SurveyEXmaMapper surveyEXMapper;
    @Override
    public List<SurveyEXma> findAllmessage() throws RuntimeException {
        List<SurveyEXma> list = surveyEXMapper.findAll();
        return list;
    }
}
