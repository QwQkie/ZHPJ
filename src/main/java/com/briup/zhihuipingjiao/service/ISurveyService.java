package com.briup.zhihuipingjiao.service;

import com.briup.zhihuipingjiao.bean.Survey;
import com.briup.zhihuipingjiao.bean.ex.SurveyEX;

import java.util.List;

public interface ISurveyService {
    List<SurveyEX> findAll() throws RuntimeException;
    SurveyEX show(int id) throws RuntimeException;
    void saveOrUpdate1(Survey survey) throws RuntimeException;
    void delete(int id)throws RuntimeException;
    void saveOrUpdate(Survey survey) throws  RuntimeException;
    Survey selectSurvey(int id) throws RuntimeException;




}
