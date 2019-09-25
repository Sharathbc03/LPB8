package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CourseDescPOM {
	public CourseDescPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//a[@title='My courses']")
	private WebElement Mycourses;
	
	@FindBy(xpath="//a[contains(text(),'Agile')]")
	private WebElement Agile;
	
	@FindBy(id="toolimage_5774")
	private WebElement CourseDescp;
	
	public void clickmycourses() {
		this.Mycourses.click();
	}
	public void clickagile() {
		this.Agile.click();
	}
	public void clickcoursedescp() {
		this.CourseDescp.click();
	}
}
