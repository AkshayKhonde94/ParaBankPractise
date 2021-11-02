package com.qa.basePage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.pages.HomePage;

public class baseTest {
	
	
	public WebDriver driver;
	public basePage basepage;
	public HomePage homepage;
	
	
	
	@BeforeTest
	public void setup() {
		basepage = new basePage();
		
		
		driver = basepage.setupWebdriver("chrome");
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		
}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	
}