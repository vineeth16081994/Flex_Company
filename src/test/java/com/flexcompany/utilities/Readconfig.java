package com.flexcompany.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
Properties pro;
	
	public Readconfig()
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getApplicationURL()
	{
		String url=pro.getProperty("baseUrl");
		return url;
	}
	
	public String getUseremail()
	{
	String username=pro.getProperty("userNmae");
	return username;
	}
	
	public String getPassword()
	{
	String password=pro.getProperty("password");
	return password;
	}
	
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public String getExplorerPath()
	{
	String chromepath=pro.getProperty("iepath");
	return chromepath;
	}

}