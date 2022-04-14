package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVo;

import java.util.List;

public interface CourseService {
    public List<Course> findByCondition(CourseVo courseVo);
    CourseVo findCourseById(Integer id);

}
