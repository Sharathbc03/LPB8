package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM {

private WebDriver driver; 
	
	public RegisterPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//identify all elements for the TC here
	
	@FindBy(id="qf_5875a3")
	private WebElement whatdoyouwanttodo; 
	
	@FindBy(id="registration_firstname")
	private WebElement Firstname;
	
	@FindBy(id="registration_lastname")
	private WebElement  Lastname;
	
	@FindBy(id="registration_email")
	private WebElement email;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="pass1")
	private WebElement  pass1;
	
	@FindBy(id="pass2")
	private WebElement pass2;
	
	
	@FindBy(id="registration_submit")
	private WebElement RegBtn;
	
	public void clickRegBtn() {
		this.RegBtn.click(); 
	}
}
