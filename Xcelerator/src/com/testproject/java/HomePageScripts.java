package com.testproject.java;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.google.common.io.Files;

//import org.apache.commons.io.FileUtils;
import org.apache.*;


import main.com.testproject.java.framework.locators.*;

public class HomePageScripts {
	static HomePage wb = new HomePage();
	static WebDriver driver = wb.WebBrowser("InternetExplorer");
	static WebElement e = null;
	//void launchURL()
	public static void main(String args[]) throws Exception
	{
		driver.get("https://xcelerator.ninja");
		clickon3Lines();
		drawersidebar("projects");
	}
	
	static void clickon3Lines() throws InterruptedException
	{
		
		    //Actions can be performed here
	
		
		Thread.sleep(1000);
		
		String[] xpath = {"//span[@class='hamBurger']",
				"//div[@class='loggedOutMenu col-xs-12']//span/child::i","//span[@class='hamBurger']/child::i",
				"//span[@class='hamBurger']/descendant::i[@class='fa fa-bars']"};
		
		
		for(int i=0;i<4;i++)
		{
			try 
			{
			e = driver.findElement(By.xpath(xpath[i]));
			}
			catch (RuntimeException ee)
			{
				System.out.println(i+ "= 3 lines NO Xpath Worked");
			    if (ee.toString().contains("NoSuchElementException"))
			    {
			    	
			    	 continue;
			    	
			    	
			    }
			   
			}
			boolean t = e.isDisplayed();
		
		if(t==true)
		e.click();
		break;
		}	
		
		
	//div[@class='drawer']//div[@id='drawerListItem-ninja']
		//Thread.sleep(1000);
	
	}//driver.findElement(By.xpath("//span[@class='listItemSpan']//div/child::div[text()='Mentor']")).click();
		
	
	static void drawersidebar(String option) throws Exception
		{
		String xpath1[] = {"//div[@class='drawer']//div[@id='drawerListItem-projects']","//div[@class='listItemText' and text()='Projects']"};
		
		//  ninja']
for(int i=0;i<2;i++)
{
try
{
	//String fxpath = '"'+xpath1[0]+option+"']"+'"';
	if(i==0)
e = driver.findElement(By.xpath(xpath1[0]));
	else
		e = driver.findElement(By.xpath(xpath1[i]));	
	
}
catch(NoSuchElementException ee)
{
	
		 System.out.println("NO Xpath Worked");
	      continue; 
	    
}
//Thread.sleep(1000);
		
	e.click();
	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     //The below method will save the screen shot in d drive with name "screenshot.png"
        Files.copy(scrFile, new File("E:/screenshot.png"));
	//Assert.assertTrue(e.getText()=="Projects");
		}	
	
}}
