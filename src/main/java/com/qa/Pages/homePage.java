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
	private By LocationsLink = By.linkText("Locations");
	private By ProductsLink = By.linkText("Products");
	private By ServicesLink = By.linkText("Services");
	private By RegisterLink = By.linkText("Register");
	private By ForgetLoginLink = By.linkText("Forgot login info?");
	
	public boolean aboutUsLinkExistsTest() {
		
		return driver.findElement(aboutUsLink).isDisplayed();
		
	}
	

	
	
	
	public boolean ProductsLinkExistsTest() {
		
		return driver.findElement(ProductsLink).isDisplayed();
		
	}
	
	
	
	
	public boolean LocationsLinkExistsTest() {
		
		return driver.findElement(LocationsLink).isDisplayed();
		
	}

	
	
	
	public boolean ServicesLinkExistsTest() {
		
		return driver.findElement(ServicesLink).isDisplayed();
		
	}
	
	
	public boolean RegisterLinkExistsTest() {
		
		return driver.findElement(ServicesLink).isDisplayed();
		
	}
	public boolean ForgetLoginLinkExistsTest() {
		
		return driver.findElement(ForgetLoginLink).isDisplayed();
		
	}
	
	
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
	
	
}
