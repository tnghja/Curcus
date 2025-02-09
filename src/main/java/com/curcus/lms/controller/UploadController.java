package com.curcus.lms.controller;

import com.cloudinary.api.exceptions.ApiException;
import com.curcus.lms.exception.ApplicationException;
import com.curcus.lms.exception.InvalidFileTypeException;
import com.curcus.lms.service.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/api/upload")
public class UploadController {

    @Autowired
    private CloudinaryService cloudinaryService;

    @PostMapping
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {

            String url = cloudinaryService.uploadFile(file);
            return ResponseEntity.ok(url);
    }

    @PostMapping("/video")
    public ResponseEntity<String> uploadVideo(@RequestParam("file") MultipartFile file) throws InvalidFileTypeException, IOException {
        try {
            String url = cloudinaryService.uploadVideo(file);
            return ResponseEntity.ok(url);
        } catch (Exception e) {
           throw e;
        }

    }
}
