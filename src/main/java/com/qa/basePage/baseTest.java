package com.qa.basePage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.Pages.homePage;

public class baseTest {

	
	public WebDriver driver;
	public basePage basepage;
	public homePage homepage;
	
	@BeforeTest
	public void setup() {
		basepage = new basePage();
		driver = basepage.setup_Driver("chrome");
		homepage = new homePage(driver);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		
}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}