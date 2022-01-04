package com.project3.revtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.project3.revtech.service.StorageService;

@CrossOrigin
@RestController
@RequestMapping("/file")
public class StorageController {

 @Autowired
 private StorageService service;

 // http://localhost:7777/file/upload
 @PostMapping("/upload")
 public ResponseEntity<String> uploadFile(@RequestParam(value = "file")MultipartFile file) {
  return ResponseEntity.ok()
    .header("Content-type", "application/json")
    .body("\"" + service.uploadFile(file) + "\"");
 }


 @GetMapping("/download/{fileName}")
 public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable String fileName) {
  byte[] data = service.downloadFile(fileName);
  ByteArrayResource resource = new ByteArrayResource(data);
  return ResponseEntity.ok()
                .contentLength(data.length)
                .header("Content-type", "application/octet-stream")
                .header("Content-disposition", "attachment; filename=\"" + fileName + "\"")
                .body(resource);
 }

 @DeleteMapping("/delete/{fileName}")
    public ResponseEntity<String> deleteFile(@PathVariable String fileName) {
        return new ResponseEntity<>(service.deleteFile(fileName), HttpStatus.OK);
    }


}
