package com.briup.zhihuipingjiao.service.impl;

import com.briup.zhihuipingjiao.bean.Survey;
import com.briup.zhihuipingjiao.bean.ex.SurveyEX;
import com.briup.zhihuipingjiao.mapper.SurveyMapper;
import com.briup.zhihuipingjiao.mapper.ex.SurveyEXMapper;
import com.briup.zhihuipingjiao.service.ISurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SurveyServiceImpl implements ISurveyService {
    @Autowired
    private SurveyEXMapper surveyEXMapper;
    @Autowired
    private SurveyMapper surveyMapper;
    @Override
    public List<SurveyEX> findAll() throws RuntimeException {
        return surveyEXMapper.findAll();
    }

    @Override
    public SurveyEX show(int id) throws RuntimeException {
        return surveyEXMapper.show(id);
    }

    @Override
    public void saveOrUpdate1(Survey survey) throws RuntimeException {
        if(survey==null){
            throw new RuntimeException("参数为空");

        }if(survey.getId()==null){
            surveyMapper.insert(survey);
        }else {
            surveyMapper.updateByPrimaryKey(survey);
        }
    }

    @Override
    public void delete(int id) throws RuntimeException {
        surveyMapper.deleteByPrimaryKey(id);
    }


}
