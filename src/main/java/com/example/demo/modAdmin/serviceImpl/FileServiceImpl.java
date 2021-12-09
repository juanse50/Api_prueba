package com.example.demo.modAdmin.serviceImpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.modAdmin.models.File;
import com.example.demo.modAdmin.repository.FileRepository;
import com.example.demo.modAdmin.services.*;

@Service
public class FileServiceImpl implements FileService{
	
	@Autowired
	private FileRepository repo;

	@Override
	public File save(MultipartFile file) {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		
		try {
			if(fileName.contains("..")) {
				return null;
				
			}
			File dbFile= new File();
			dbFile.setFileName(fileName);
			dbFile.setFileType(file.getContentType());
			dbFile.setData(file.getBytes());
			return repo.save(dbFile);
		}catch(IOException e) {
			return null;
		}
		
	}

}
