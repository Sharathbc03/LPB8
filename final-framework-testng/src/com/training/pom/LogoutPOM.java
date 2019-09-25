package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOM {
	public LogoutPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement Dropdown;
	
	@FindBy(id="logout_button")
	private WebElement logout;
	
	public void clickDropdown() {
		this.Dropdown.click();
		}
	public void clickLogout() {
		this.logout.click();
		}
	
	
	
	
	
	
	
}

