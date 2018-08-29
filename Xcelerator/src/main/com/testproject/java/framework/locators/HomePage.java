package main.com.testproject.java.framework.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HomePage {
	public WebDriver WebBrowser(String Browser)
	{
		WebDriver driver = null;
		if(Browser=="Chrome")
		{
			System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		}
		if(Browser=="Firefox")
		{
			System.setProperty("webdriver.gecko.driver", "C:/Program Files/chromedriver_win32/chromedriver.exe");
		
		driver = new FirefoxDriver();
		}
		if(Browser=="InternetExplorer")
		{
			System.setProperty("webdriver.ie.driver", "C:/Users/Administrator/Downloads/IEDriverServer_Win32_3.12.0/IEDriverServer.exe");
		
			
			//
		driver = new InternetExplorerDriver();
		}
//		WebDriver drivIE = new InternetExplorerDriver();
//		WebDriver driveFox = new FirefoxDriver();
		 
		//driver.get("https://xcelerator.ninja");
		
		return driver;
		
	}

}
