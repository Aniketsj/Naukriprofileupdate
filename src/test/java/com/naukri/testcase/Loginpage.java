package com.naukri.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Baseclass;
import com.naukri.pageobject.Homepage;
import com.naukri.pageobject.Loginpageobject;

public class Loginpage extends Baseclass {
	
	Loginpageobject lp;
	Homepage hp;
	
	public Loginpage()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		Baseclass.initialize();
		lp=new Loginpageobject();
	}
	
	@Test(priority=1)
	public void logintest() throws InterruptedException
	{
		hp=lp.Logincall(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(3000);
		System.out.println("Test");
		hp.mousehoveronmynaukri();
	}
	


	@AfterMethod
	public void exit()
	{
		//driver.quit();
	}
}
