//package com.curcus.lms.service.impl;
//
//import com.curcus.lms.model.entity.CourseElasticsearch;
//import com.curcus.lms.model.response.CourseSearchResult;
//import com.curcus.lms.repository.CourseElasticsearchRepository;
//import com.curcus.lms.repository.CourseRepository;
//import com.curcus.lms.service.CourseSearchService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class CourseSearchServiceImpl implements CourseSearchService {
//
//    @Autowired
//    private CourseElasticsearchRepository courseElasticsearchRepository;
//
//    @Autowired
//    private CourseRepository courseRepository;
//
//    public List<CourseSearchResult> searchCourses(String keyword) {
//        // Search in Elasticsearch
//        List<CourseElasticsearch> esCourses = courseElasticsearchRepository.findByTitleContaining(keyword);
//
//        // Map Elasticsearch results to CourseSearchResult
//        return esCourses.stream()
//                .map(course -> new CourseSearchResult(course.getCourseId(), course.getTitle()))
//                .collect(Collectors.toList());
//    }
//}
