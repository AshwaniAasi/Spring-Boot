package com.restbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.restbook.helper.FileUploadHelper;

@RestController
public class FileUploadController {
	
	@Autowired
	private FileUploadHelper fileUploadHelper;
	
	@PostMapping("/upload-file")
	public ResponseEntity<String> uploadFile(@RequestParam("image") MultipartFile file)	{
		
		System.out.println(file.getSize());
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getResource());
		
		//validation
		try 	{
			if(file.isEmpty())	{
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must contain flle");
			}
			if( ! file.getContentType().equals("image/jpeg"))			{
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only JPEG file are allowed");
			}
			//file upload code...
			boolean f  = fileUploadHelper.uploadFile(file);
			
			if(f)	{
				return ResponseEntity.ok("File uploaded");
			}
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
		} 
		catch (Exception e) 	{
			e.printStackTrace();
		}
		
		return ResponseEntity.ok("Working");
	}
}
