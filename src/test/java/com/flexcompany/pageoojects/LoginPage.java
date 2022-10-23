package com.flexcompany.pageoojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
public WebDriver ldriver;

public LoginPage(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
 
@FindBy(id="Email")
@CacheLookup
WebElement txtEmail;

@FindBy(id="Password")
@CacheLookup
WebElement txtPassword;

@FindBy(xpath="//button[@class='button-1 login-button']")
@CacheLookup
WebElement btnLogin;

@FindBy(xpath="//a[@class='ico-logout']")
@CacheLookup
WebElement btnLogout;

public void setUserName(String Uname)
{
	txtEmail.sendKeys(Uname);
	
}

public void setPasswrd(String Upassword)
{
	txtPassword.sendKeys(Upassword);
	
}
public void clickLogot()
{
	btnLogout.click();
	
}

public void clickLogin()
{
	btnLogin.click();
	
}





}
