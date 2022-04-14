package com.lagouu.Control;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVo;
import com.lagou.domain.ResponseResult;
import com.lagou.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // responsebody +  controller
@RequestMapping("/course")
public class CourseControl {

    @Autowired
    private CourseService courseService;
    @RequestMapping("/findByCondition")
    public ResponseResult findByCondition(@RequestBody CourseVo courseVo){
        // 解析前台 发来的 json 字符串 进行 解析 封装为 courseVo 对象
        List<Course> list = courseService.findByCondition(courseVo);
        //  不能 直接返回 只有 一个 东西
                ResponseResult qq = new ResponseResult(true, 200, "响应成功", list);
        return qq;
    }
    @RequestMapping("/findCourseById")
    public ResponseResult findCourseById(Integer id){
        CourseVo courseById = courseService.findCourseById(id);
        ResponseResult rr = new ResponseResult(true, 200, "根据id查询课程信xi成功", courseById);
        return rr;
    }
}
