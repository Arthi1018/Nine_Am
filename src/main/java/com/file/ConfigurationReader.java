package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;
	
public ConfigurationReader() throws IOException {
		
	File f=new File("C:\\Users\\welcome\\eclipse-workspace\\Students\\9am_Maven\\credentials.properties");
	
	FileInputStream fis=new FileInputStream(f);
	
	p=new Properties();
	
	p.load(fis);
}

	public String getUsername() {
    String user = p.getProperty("username");
    return user;
	}
	
	public String getPassword() {
    String pass = p.getProperty("password");
    return pass;
	}
}
