package com.doms.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManagement {
	
	public WebDriver driver = null;
	public LoginPage loginpgobj;
	public RegisterPage registerpgobj;
	public WelcomePage welcomepgobj;
	
	
	//Initialization
	public PageManagement(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public LoginPage initloginpgobj()
	{
		loginpgobj = new LoginPage(driver);
		return loginpgobj;
	}
	
	public RegisterPage initregisterpgobj()
	{
		registerpgobj = new RegisterPage(driver);
		return this.registerpgobj;
	}
	
	public WelcomePage initwelcomepgobj() {
		welcomepgobj = new WelcomePage(driver);
		return this.welcomepgobj ;
	}
	
}
