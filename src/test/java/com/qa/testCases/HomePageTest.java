package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.basePage.baseTest;


public class HomePageTest extends baseTest{
	
	
	
	@Test(priority=1)
	public void aboutUsLinkTest() {
	homepage = homepage.dovisit();
	System.out.println(homepage);	
	}
	
	
	
}
