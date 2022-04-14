package com.lagou.dao;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVo;

import java.util.List;

public interface CourseMapper {
   public List<Course> findCourseByCondition(CourseVo courseVo);
   public CourseVo findCourseById(Integer id);
}
