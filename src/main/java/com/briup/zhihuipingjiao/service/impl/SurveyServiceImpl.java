package com.briup.zhihuipingjiao.service.impl;

import com.briup.zhihuipingjiao.service.ISurveyService;
import com.briup.zhihuipingjiao.bean.Survey;
import com.briup.zhihuipingjiao.mapper.SurveyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyServiceImpl implements ISurveyService {
@Autowired
    private SurveyMapper surveyMapper;


    @Override
    public void saveOrUpdate(Survey survey) throws RuntimeException {
        if(survey==null){
            throw new RuntimeException("参数空");
        }
        if(survey.getId()==null){
            surveyMapper.insert(survey);
        }else{
            surveyMapper.updateByPrimaryKey(survey);
        }
    }

    @Override
    public Survey selectSurvey(int id) throws RuntimeException {
        Survey survey = surveyMapper.selectByPrimaryKey(id);
        return survey;
    }
}
