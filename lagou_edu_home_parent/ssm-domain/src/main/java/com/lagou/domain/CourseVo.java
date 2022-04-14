package com.lagou.domain;

import org.apache.ibatis.annotations.Param;

/*
*
* 表现型 接受参数 vo  表示 view object  表现层接收前台参数
*
* */
public class CourseVo {
    private String courseName;
    private Integer status;

    public CourseVo() {
    }

    public CourseVo( String courseName,Integer status) {
        this.courseName = courseName;
        this.status = status;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
