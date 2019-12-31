package com.briup.zhihuipingjiao.service.impl;

import com.briup.zhihuipingjiao.bean.Questionnaire;
import com.briup.zhihuipingjiao.bean.QuestionnaireExample;
import com.briup.zhihuipingjiao.bean.ex.QqnEX;
import com.briup.zhihuipingjiao.bean.ex.QuestionnrEX;
import com.briup.zhihuipingjiao.mapper.QuestionnaireMapper;
import com.briup.zhihuipingjiao.mapper.ex.QqnEXMapper;
import com.briup.zhihuipingjiao.mapper.ex.QuestionnrEXMapper;
import com.briup.zhihuipingjiao.service.IQuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService {

    @Autowired
    private QuestionnaireMapper questionnaireMapper;
    @Autowired
    private QqnEXMapper qqnEXMapper;
    @Autowired
    private QuestionnrEXMapper questionnrEXMapper;
    @Override
    public List<Questionnaire> findAllquestionnaire() throws RuntimeException {
        QuestionnaireExample questionnaireExample =
                new QuestionnaireExample();
        List<Questionnaire> list =
                questionnaireMapper.selectByExample(questionnaireExample);

        return list;
    }

    @Override
    public List<QqnEX> selectQuest(int id) throws RuntimeException {
        List<QqnEX> list = qqnEXMapper.selectById(id);
        return list;
    }

    @Override
    public void saveQuestipnnr(QuestionnrEX questionnrEX) throws RuntimeException {
        questionnrEXMapper.insertQuestionnr(questionnrEX);
    }

    @Override
    public void insertQuestion(QqnEX qqnEX) throws RuntimeException {
        qqnEXMapper.insertQuestion(qqnEX);
    }

}
