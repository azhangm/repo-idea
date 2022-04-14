package com.lagou.service.impl;

import com.lagou.dao.CourseMapper;
import com.lagou.domain.Course;
import com.lagou.domain.CourseVo;
import com.lagou.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> findByCondition(CourseVo courseVo) {
        List<Course> l = courseMapper.findCourseByCondition(courseVo);
        return  l;
    }

    @Override
    public CourseVo findCourseById(Integer id) {
       return courseMapper.findCourseById(id);
    }
}
