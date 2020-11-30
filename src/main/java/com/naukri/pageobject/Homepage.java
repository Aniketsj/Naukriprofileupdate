package com.naukri.pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class Homepage extends Baseclass{
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[contains(@class,'rghtSec fr menu logged')]//li[2]//a//div[2]")
	WebElement mousehoveronmynaukri;
	
	@FindBy(xpath="//a[contains(text(),'Edit Profile')]")
	WebElement EditProfile;

	@FindBy(xpath="//div[@id='lazyResumeHead']//div//div//div//div//span[2]")
	WebElement editresume;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement saveclick;
	
	@FindBy(id="attachCV")
	WebElement updateresume;
	
	public void mousehoveronmynaukri()
	{
		Actions action=new Actions(driver);
		action.moveToElement(mousehoveronmynaukri).build().perform();
		EditProfile.click();
		updateresume.sendKeys("D:\\e\\Naukriupdateprofile\\Testdata\\Resume_QA -Test Engineer.pdf");
		System.out.println("test");
		}
	
}
