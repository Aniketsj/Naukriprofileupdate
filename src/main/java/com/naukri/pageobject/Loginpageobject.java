package com.naukri.pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.baseclass.Baseclass;

public class Loginpageobject extends Baseclass{
	
	
	
	public Loginpageobject()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login_Layer")
	WebElement Loginclick;
	
	@FindBy(id="usernameField")
	WebElement emailid;
	
	@FindBy(id="passwordField")
	WebElement password;
	
	
	@FindBy(xpath="//button[contains(@class,'waves-effect')]")
	WebElement clickonlogin;
	
	
	public Homepage Logincall(String user, String pass) throws InterruptedException
	{
		//Loginclick.click();
//		Set<String> s1=driver.getWindowHandles();
//		Iterator<String>it=s1.iterator();
//		
//		String parent=it.next();
//		
//		String child=it.next();
//		driver.switchTo().window(child);
//		Thread.sleep(200);
		
		emailid.sendKeys(user);
		password.sendKeys(pass);
		clickonlogin.click();
		return new Homepage();
	}
	
	
	
	

}
