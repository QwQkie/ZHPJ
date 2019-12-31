package com.briup.zhihuipingjiao.service;

import com.briup.zhihuipingjiao.bean.Survey;

public interface ISurveyService {
    void saveOrUpdate(Survey survey) throws  RuntimeException;
    Survey selectSurvey(int id) throws RuntimeException;
}
