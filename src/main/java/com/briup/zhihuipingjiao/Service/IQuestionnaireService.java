package com.briup.zhihuipingjiao.service;

import com.briup.zhihuipingjiao.bean.Questionnaire;
import com.briup.zhihuipingjiao.bean.ex.QqnEX;
import com.briup.zhihuipingjiao.bean.ex.QuestionnrEX;

import java.util.List;

public interface IQuestionnaireService {
    List<Questionnaire> findAllquestionnaire() throws RuntimeException;
    List<QqnEX> selectQuest(int id) throws RuntimeException;
    void saveQuestipnnr(QuestionnrEX questionnrEX) throws RuntimeException;

    void insertQuestion(QqnEX qqnEX) throws RuntimeException;
}
