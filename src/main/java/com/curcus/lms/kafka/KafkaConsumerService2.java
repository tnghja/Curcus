//package com.curcus.lms.kafka;
//
//import com.curcus.lms.exception.InvalidFileTypeException;
//import com.curcus.lms.model.request.FileCreateRequest;
//import com.curcus.lms.service.CloudinaryService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//
//@Service
//public class KafkaConsumerService2 {
//
//    @Autowired
//    private CloudinaryService cloudinaryService;
//
//    @KafkaListener(topics = "file-uploads", groupId = "curcus", containerFactory = "kafkaListenerContainerFactory")
//    public void listen(FileCreateRequest fileCreateRequest) {
//        processFile(fileCreateRequest);
//    }
//
//    private void processFile(FileCreateRequest fileCreateRequest) {
//        Long contentId = fileCreateRequest.getContentId();
//        byte[] fileData = fileCreateRequest.getFile();
//
//        MultipartFile file = new CustomMultipartFile("file", "file", "txt", fileData);
//        String contentType = file.getContentType();
//
//        String url;
//
//        try {
//            switch (contentType) {
//                case "txt":
//                    System.out.println("Processing file in Service 2...");
//                    url = cloudinaryService.uploadFile(file);
//                    break;
//                default:
//                    throw new InvalidFileTypeException("Unsupported file type: " + contentType);
//            }
//        } catch (IOException e) {
//            System.out.println("Cloudinary server error");
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(url);
//    }
//}
