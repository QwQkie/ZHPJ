package com.briup.zhihuipingjiao.service.impl;

import com.briup.zhihuipingjiao.bean.Options;
import com.briup.zhihuipingjiao.bean.OptionsExample;
import com.briup.zhihuipingjiao.bean.Question;
import com.briup.zhihuipingjiao.bean.ex.OptionsEX;
import com.briup.zhihuipingjiao.bean.ex.QuestionEX;
import com.briup.zhihuipingjiao.mapper.OptionsMapper;
import com.briup.zhihuipingjiao.mapper.QuestionMapper;
import com.briup.zhihuipingjiao.mapper.ex.OptionsEXMapper;
import com.briup.zhihuipingjiao.mapper.ex.QuestionEXMapper;
import com.briup.zhihuipingjiao.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements IQuestionService {
    @Autowired
    private QuestionEXMapper questionEXMapper;
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private  OptionsMapper optionsMapper;
    @Override
    public List<QuestionEX> findAll() throws RuntimeException {
        return questionEXMapper.findAll();
    }

    @Override
    public List<QuestionEX> search(String key) throws RuntimeException {
        key=key==null?"":key;
        if(key==null || "".equals(key)){
            return findAll();
        }else {
            key="%"+key+"%";
         return   questionEXMapper.search(key);
        }

    }

    @Override
    public void saveOrUpdate(Question question) throws RuntimeException {
        if(question.getId()==null) {
            questionMapper.insert(question);
        }else {
            questionMapper.updateByPrimaryKey(question);
        }

    }

    @Override
    public void delete(int id) throws RuntimeException {
        OptionsExample example=new OptionsExample();
        example.createCriteria().andQuestionIdEqualTo(id);
        optionsMapper.deleteByExample(example);
        questionMapper.deleteByPrimaryKey(id);

    }

}
