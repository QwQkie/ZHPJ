package com.briup.zhihuipingjiao.bean.ex;

import com.briup.zhihuipingjiao.bean.*;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

public class SurveyEX {
    private Integer id;
    private String status;
    private Integer code;
    private Date surveyday;
    private String departmentName;
    private String courseName;
    private String clazzName;
    private String teacherName;
    private String questionnaireName;
    private Questionnaire questionnaire;
    private List<QqnEX> qqn;
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getQuestionnaireName() {
        return questionnaireName;
    }

    public void setQuestionnaireName(String questionnaireName) {
        this.questionnaireName = questionnaireName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Date getSurveyday() {
        return surveyday;
    }
    public void setSurveyday(Date surveyday) {
        this.surveyday = surveyday;
    }

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    public List<QqnEX> getQqn() {
        return qqn;
    }

    public void setQqn(List<QqnEX> qqn) {
        this.qqn = qqn;
    }
}
