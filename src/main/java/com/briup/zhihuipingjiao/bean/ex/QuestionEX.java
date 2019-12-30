package com.briup.zhihuipingjiao.bean.ex;

import com.briup.zhihuipingjiao.bean.Options;

import java.util.List;

public class QuestionEX {
    private Integer id;


    private String name;

    private String type;
    private List<Options> options;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    



    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(List<Options> options) {
        this.options = options;
    }




}
