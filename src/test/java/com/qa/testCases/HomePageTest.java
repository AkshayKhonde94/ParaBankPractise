package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.basePage.baseTest;

public class HomePageTest extends baseTest{

	@Test
	public void aboutUsLinkExistsTest() {
		Assert.assertTrue(homepage.aboutUsLinkExistsTest());
	}
	
	@Test
	public void servicesLinkExistsTest() {
		Assert.assertTrue(homepage.ServicesLinkExistsTest());
	}
	
	@Test
	public void productsLinkExistsTest() {
		Assert.assertTrue(homepage.LocationsLinkExistsTest());
	}
	
	
	@Test
	public void ProductsLinkExistsTest() {
		Assert.assertTrue(homepage.ProductsLinkExistsTest());
	}
	
	@Test
	public void ForgetLoginLinkExistsTest() {
		Assert.assertTrue(homepage.ForgetLoginLinkExistsTest());
	}
	
	@Test
	public void RegisterLinkExistsTest() {
		Assert.assertTrue(homepage.RegisterLinkExistsTest());
	}
	
	@Test
	public void pageTitleTest() {
		Assert.assertEquals(homepage.getPageTitle(), "ParaBank | Welcome | Online Banking");
	}
	
	
	
}
