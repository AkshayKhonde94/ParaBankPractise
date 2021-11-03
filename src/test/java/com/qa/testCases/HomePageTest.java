package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.basePage.baseTest;

public class HomePageTest extends baseTest{

	@Test
	public void aboutUsLinkExistsTest() {
		Assert.assertTrue(homepage.aboutUsLinkTest());
	}
	
	@Test
	public void servicesLinkExistsTest() {
		Assert.assertTrue(homepage.aboutUsLinkTest());
	}
	
	
	
	
}
