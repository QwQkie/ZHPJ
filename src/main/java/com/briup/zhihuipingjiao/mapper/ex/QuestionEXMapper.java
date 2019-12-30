package com.briup.zhihuipingjiao.mapper.ex;

import com.briup.zhihuipingjiao.bean.Options;
import com.briup.zhihuipingjiao.bean.ex.QuestionEX;

import java.util.List;

public interface QuestionEXMapper {
    List<QuestionEX> findAll();
    List<QuestionEX> search(String key);
    void add(QuestionEX questionEX);
}
