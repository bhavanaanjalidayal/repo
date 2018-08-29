package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePage {
	private static WebElement element = null;
 @Test
 public static WebElement lnk_MyAccount(WebDriver driver){
	
	 element = driver.findElement(By.id("account"));
	 
	 return element;
	 
	    }
@Test
	 public static WebElement lnk_LogOut(WebDriver driver){
	 
	    element = driver.findElement(By.id("account_logout"));
	 
	 return element;
	 
	    }
	 
	}

