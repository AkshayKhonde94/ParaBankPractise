package com.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.basePage.basePage;

public class HomePage extends basePage{
	
	public WebDriver driver;
	private By aboutUsLink = By.linkText("About Us");
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage dovisit() {
		return new HomePage(driver);
		
	}
	
	
	

	public boolean aboutUsLinkAvailability() {
		return driver.findElement(aboutUsLink).isDisplayed();
	}
}
