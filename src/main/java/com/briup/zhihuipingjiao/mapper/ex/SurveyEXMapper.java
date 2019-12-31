package com.briup.zhihuipingjiao.mapper.ex;

import com.briup.zhihuipingjiao.bean.ex.SurveyEX;

import java.util.List;

public interface SurveyEXMapper {
    List<SurveyEX> findAll();
    SurveyEX show(int id);
}
