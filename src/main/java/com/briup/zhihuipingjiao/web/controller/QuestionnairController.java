package com.briup.zhihuipingjiao.web.controller;

import com.briup.zhihuipingjiao.bean.Qqn;
import com.briup.zhihuipingjiao.bean.Question;
import com.briup.zhihuipingjiao.bean.Questionnaire;
import com.briup.zhihuipingjiao.bean.ex.QqnEX;
import com.briup.zhihuipingjiao.bean.ex.QuestionnrEX;
import com.briup.zhihuipingjiao.service.IQuestionnaireService;
import com.briup.zhihuipingjiao.util.Message;
import com.briup.zhihuipingjiao.util.MessageUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@Api(description = "问卷管理")
public class QuestionnairController {

    @Autowired
    private IQuestionnaireService iQuestionnaireService;

    @GetMapping("/findAllqn")
    public Message findAllqn(){
        List<Questionnaire> list = iQuestionnaireService.findAllquestionnaire();
        return MessageUtil.success(list);
    }

    @GetMapping("/selectQuestion")
    public  Message selectQuestion(int id){
        List<QqnEX> list = iQuestionnaireService.selectQuest(id);
        return MessageUtil.success(list);
    }

    @PostMapping("/saveQuestionnr")
    public Message saveQuestionnr(QuestionnrEX questionnrEX,int[] ids){
        iQuestionnaireService.saveQuestipnnr(questionnrEX);
        QqnEX qqn = new QqnEX();
        for(int id:ids){
            qqn.setQuestionId(id);
            qqn.setQuestionnaireId(questionnrEX.getId());
            iQuestionnaireService.insertQuestion(qqn);
        }
       return MessageUtil.success();

    }
}
