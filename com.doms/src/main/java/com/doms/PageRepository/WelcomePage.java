package com.doms.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//Initialization 
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(id = "name")
	private WebElement name;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "mobile")
	private WebElement mobile;
	
	@FindBy(partialLinkText = "Contact Us")
	private WebElement contactUs;
	
	@FindBy(name="dob")
	private WebElement dob;
	
	@FindBy(id="female")
	private WebElement gender;
	
	@FindBy(id="goa")
	private WebElement places;
	
	@FindBy(name="country1")
	private WebElement country;
	
	@FindBy(id="feedback")
	private WebElement feedback;
	
	@FindBy(name="photo")
	private WebElement photo;
	
	@FindBy(xpath="//input[contains(@type,'file')]")
	private WebElement file;
	
	@FindBy(id="reg")
	private WebElement register;
	
	//Utilization
	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getContactUs() {
		return contactUs;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getPlaces() {
		return places;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getFeedback() {
		return feedback;
	}

	public WebElement getPhoto() {
		return photo;
	}

	public WebElement getFile() {
		return file;
	}

	public WebElement getRegister() {
		return register;
	}
	
	
}
