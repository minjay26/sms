package org.minjay.sms.service;

import org.minjay.sms.data.domain.Course;
import org.minjay.sms.data.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by minjay on 2017/1/18.
 */
@Service
public class CourseServiceImpl extends EntityServiceSupport<Course,Integer,CourseRepository> implements CourseService{

    @Autowired
    public CourseServiceImpl(CourseRepository repository) {
        super(repository);
    }
}
