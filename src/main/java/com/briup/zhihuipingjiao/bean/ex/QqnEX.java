package com.briup.zhihuipingjiao.bean.ex;


import com.briup.zhihuipingjiao.bean.Question;

import java.util.List;

public class QqnEX {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    private Integer questionId;

    private Integer questionnaireId;

    private List<QuestionEX> question;

    public List<QuestionEX> getQuestion() {
        return question;
    }

    public void setQuestion(List<QuestionEX> question) {
        this.question = question;
    }

}
