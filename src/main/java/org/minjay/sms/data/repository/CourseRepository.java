package org.minjay.sms.data.repository;

import org.minjay.sms.data.domain.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by minjay on 2017/1/18.
 */
public interface CourseRepository extends PagingAndSortingRepository<Course,Integer> {
}
