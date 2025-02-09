package com.curcus.lms.service;

import com.curcus.lms.model.response.CourseSearchResult;

import java.util.List;

public interface CourseSearchService {
     List<CourseSearchResult> searchCourses(String courseName);
}
