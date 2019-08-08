package com.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Baseclass()
	{
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("D:\\e\\Naukriupdateprofile\\src\\main\\java\\com\\properties\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialize()
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\e\\Naukriupdateprofile\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browsername.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\e\\Naukriupdateprofile\\drivers\\geckodriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		String url=prop.getProperty("url");
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		
		
	}

}
