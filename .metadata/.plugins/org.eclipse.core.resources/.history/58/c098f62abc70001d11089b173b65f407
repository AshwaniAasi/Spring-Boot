package com.restbook.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	public final String UPLOAD_Dir="D:\\Eclipse-Workspace\\Spring-Boot\\bootrestbook\\src\\main\\resources\\static\\image";
	public boolean uploadFile(MultipartFile file)	{
		boolean f=false;
		try 		{
			/*
			//read
			InputStream inputStream = file.getInputStream();
			byte data[] =new byte[inputStream.available()];
			inputStream.read(data);
			
			//write
			FileOutputStream fos=new FileOutputStream(UPLOAD_Dir+File.separator+file.getOriginalFilename());
			fos.write(data);
			fos.flush();
			fos.close();
			*/
			
			// the alternate of above line 
			Files.copy(file.getInputStream(), Paths.get(UPLOAD_Dir+File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
		
			f=true;
		} 
		catch (Exception e) 		{
			e.printStackTrace();			
		}
		
		return f;
	}
}
