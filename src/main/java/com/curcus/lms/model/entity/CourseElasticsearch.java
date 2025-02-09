//package com.curcus.lms.model.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;
//import org.springframework.data.elasticsearch.annotations.Field;
//import org.springframework.data.elasticsearch.annotations.FieldType;
//
//import java.time.LocalDateTime;
//import java.util.Set;
//
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Document(indexName = "courses")
//public class CourseElasticsearch {
//
//    @Id
//    private Long courseId;
//
////    @Field(type = FieldType.Text)
////    private String courseThumbnail;
//
//    @Field(type = FieldType.Text)
//    private String title;
//
//
//}
//
//// Similarly, create Elasticsearch entities for Enrollment, Section, etc.
