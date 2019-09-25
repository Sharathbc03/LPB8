package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RegisterPOM;
import com.training.pom.SearchPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Week1TestCase1 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private SearchPOM SearchPOMobj;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test(priority=0)
	public void validLoginTest() {
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		
		loginPOM.sendUserName("sharath");
		loginPOM.sendPassword("abc@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("Login");
	}
	@Test(priority=1)
	public void validSearchTest() throws Exception {
		SearchPOMobj=new SearchPOM(driver);
		SearchPOMobj.clickcoursecatalog();
		Thread.sleep(1000);
		SearchPOMobj.searchcourse("abcd");
		SearchPOMobj.submitsearch();
		screenShot.captureScreenShot("Search");
		SearchPOMobj.subscribe();
		String msg=SearchPOMobj.getalertmsg();
		System.out.println(msg);
		screenShot.captureScreenShot("Subscribed");
	}
}

// here call those methods.