//package com.curcus.lms.model.entity;
//
//import lombok.*;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;
//import org.springframework.data.elasticsearch.annotations.Field;
//import org.springframework.data.elasticsearch.annotations.FieldType;
//
//import java.util.Date;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Document(indexName = "enrollments")
//public class EnrollmentElasticsearch {
//
//    @Id
//    private String id;
//
//    @Field(type = FieldType.Long)
//    private long enrollmentId;
//
//    @Field(type = FieldType.Object)
//    private Student student;
//
//    @Field(type = FieldType.Object)
//    private Course course;
//
//    @Field(type = FieldType.Date)
//    private Date enrollmentDate;
//
//    @Field(type = FieldType.Boolean)
//    private Boolean isComplete;
//}
