package com.example.demo.modAdmin.services;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.modAdmin.models.*;
public interface FileService {
	
	public File save(MultipartFile file);
	

}
