package com.briup.zhihuipingjiao.mapper.ex;

import com.briup.zhihuipingjiao.bean.ex.QqnEX;

import java.util.List;

public interface QqnEXMapper {
    List<QqnEX> selectById(int id);
    void insertQuestion(QqnEX qqnEX);
}
