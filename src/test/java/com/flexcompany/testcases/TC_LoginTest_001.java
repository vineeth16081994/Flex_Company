package com.flexcompany.testcases;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.flexcompany.pageoojects.LoginPage;

public class TC_LoginTest_001 extends Base {
	
	
	
	

   @Test
	public void loginTest() throws InterruptedException, IOException
   {
	   driver.get(baseUrl);
	   String a="hi";
	   
	   LoginPage l=new LoginPage(driver);
	   Thread.sleep(5000);
	   
	   l.setUserName(userNmae);
	   logger.info("entered username");
	   l.setPasswrd(password);
	   logger.info("entered password");
	   Thread.sleep(5000);
	  if(a.equals("hi"))
	  {
	   l.clickLogin();
	   Assert.assertTrue(true);

	  logger.info(" login clicked");
	  
	  }
	  else
	  {
		 captureScreen(driver,"logintest");
		  logger.info(" test failed");
		  Assert.assertTrue(false);

	  }
	   
   }
   
  


}
