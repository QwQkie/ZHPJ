package com.briup.zhihuipingjiao.bean.ex;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class QuestionnrEX {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

}
