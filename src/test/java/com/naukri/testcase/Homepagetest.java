package com.naukri.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Baseclass;
import com.naukri.pageobject.Homepage;
import com.naukri.pageobject.Loginpageobject;

public class Homepagetest extends Baseclass {
	
	Loginpageobject lp;
	Homepage hp;
	
	public Homepagetest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		Baseclass.initialize();
		lp=new Loginpageobject();
		hp=lp.Logincall(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test
	public void editprofile()
	{
		hp.mousehoveronmynaukri();
	}

}
