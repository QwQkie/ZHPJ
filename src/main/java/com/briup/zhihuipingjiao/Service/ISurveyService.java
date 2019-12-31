package com.briup.zhihuipingjiao.Service;

import com.briup.zhihuipingjiao.bean.Survey;
import com.briup.zhihuipingjiao.bean.ex.QqnEX;

import java.util.List;

public interface ISurveyService {
    void saveOrUpdate(Survey survey) throws  RuntimeException;
    Survey selectSurvey(int id) throws RuntimeException;
}
