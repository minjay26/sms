package org.minjay.sms.controller;


import org.minjay.sms.data.domain.Course;
import org.minjay.sms.service.CourseService;
import org.minjay.sms.util.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by minjay on 2017/1/18.
 */
@Controller
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public ResponseEntity<List<Course>> list(){
        List<Course> courses = CollectionUtils.toList(courseService.getAll());
        return new ResponseEntity<List<Course>>(courses, HttpStatus.OK);
    }
}
