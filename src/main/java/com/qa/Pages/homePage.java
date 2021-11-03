package com.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.basePage.basePage;

public class homePage extends basePage{

	public WebDriver driver;
	
	public homePage(WebDriver driver) {
		this.driver = driver;
	}



	private By aboutUsLink = By.linkText("About Us");
	
	
	
	public boolean aboutUsLinkTest() {
		
		return driver.findElement(aboutUsLink).isDisplayed();
		
	}
	
private By ServicesLink = By.linkText("Services");
	
	
	
	public boolean ServicesLinkLinkTest() {
		
		return driver.findElement(ServicesLink).isDisplayed();
		
	}
	
	
	
	
}
