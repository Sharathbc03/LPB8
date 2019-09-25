package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPOM {
 
 //private WebDriver driver; 
	
	public SearchPOM(WebDriver driver) {
		//this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//identify all elements for the TC here
	
	@FindBy(xpath = "//a[contains(text(),'Course catalog')]")
	private WebElement coursecatalog;
	
	@FindBy(xpath = "//input[@name='search_term']")
	private WebElement Search;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitsearch;
	
	@FindBy(xpath="//a[@title='Subscribe']")
	private WebElement subscribe;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement alertmsg;
	
	public void clickcoursecatalog() {
		this.coursecatalog.click();
	}
	
	public void searchcourse(String Search) {
		this.Search.clear();
		this.Search.sendKeys(Search);
	}
	
	//div[@class='alert alert-info']
	
	public void submitsearch() {
		this.submitsearch.click(); 
	}
	public void subscribe() {
		this.subscribe.click(); 
	}
	
	public String getalertmsg() {
		return this.alertmsg.getText();
	}
}