package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login {
	private static WebElement element = null;
	
  @Test(priority=0)
  
public static WebElement txtbx_UserName(WebDriver driver){

   element = driver.findElement(By.name("userName"));

   return element;

   }
@Test(priority = 1)
public static WebElement txtbx_Password(WebDriver driver){

   element = driver.findElement(By.name("password"));

   return element;

   }
@Test(priority=2)
public static WebElement btn_LogIn(WebDriver driver){

   element = driver.findElement(By.name("login"));

   return element;

   }
}
