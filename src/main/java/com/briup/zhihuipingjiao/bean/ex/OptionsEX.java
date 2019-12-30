package com.briup.zhihuipingjiao.bean.ex;

import com.briup.zhihuipingjiao.bean.Question;

import java.util.List;

public class OptionsEX {
    private Integer id;
    private String label;
    private String name;
    private Integer score;
    private List<Question> questions;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }


}
