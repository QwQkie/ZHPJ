package com.briup.zhihuipingjiao.service;

import com.briup.zhihuipingjiao.bean.Options;
import com.briup.zhihuipingjiao.bean.Question;
import com.briup.zhihuipingjiao.bean.ex.OptionsEX;
import com.briup.zhihuipingjiao.bean.ex.QuestionEX;

import java.util.List;

public interface IQuestionService {
    List<QuestionEX> findAll() throws RuntimeException;
    List<QuestionEX> search(String key) throws  RuntimeException;
    void saveOrUpdate(Question question) throws RuntimeException;
    void delete(int id)throws RuntimeException;
}
