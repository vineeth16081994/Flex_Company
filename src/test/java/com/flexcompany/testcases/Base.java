package com.flexcompany.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.flexcompany.utilities.Readconfig;

public class Base 
{
	Readconfig read=new Readconfig();
	public String baseUrl=read.getApplicationURL();
	public String userNmae=read.getUseremail();
	public String password=read.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br)
	{
		logger=Logger.getLogger("Flex-Company");
		 PropertyConfigurator.configure("log4j.properties");
		if(br.equals("chrome"))
		{
		 System.setProperty("webdriver.chrome.driver",read.getChromePath());
		 driver = new ChromeDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.edge.driver",read.getExplorerPath());
			 driver = new EdgeDriver();
		}
		 
	}
	 @AfterClass
	   public void tearDown()
	   {
		   driver.quit();
	   }
	 public void captureScreen(WebDriver driver, String tname) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshot taken");
		}
	   
}
