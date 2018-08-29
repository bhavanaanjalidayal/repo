package NewProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AmazonLogin {
	WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) 
  {
	  
  }
  @BeforeMethod
//  public void beforeMethod() {
//	 String e = driver.findElement(By.xpath("//span[text()='Amazon']")).getText();
//	 
//	 Assert.assertEquals(e, "Amazon");
//  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  java.util.List<WebElement> we = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		
		System.out.println(we.size());
		Thread.sleep(100);
		we.get(2).click();
	 
  }

  @AfterClass
  public void afterClass() throws InterruptedException, IOException {
	Thread.sleep(1000);
		
		//GOOGLE SEARCH BUTTON
		//driver.findElement(By.name("btnK")).click();
    String propertyFilePath = "C:/Users/Administrator/eclipse-workspace/TestNG123/src/Property.properties";
	   
    BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));
   	    Properties property = new Properties();
   property.load(reader);
  String value =  property.getProperty("value");
		
 driver.findElement(By.linkText(value)).click();

	 
  }

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebElement e = driver.findElement(By.cssSelector("#lst-ib"));
		//.sendKeys("java");
		e.sendKeys("java");
		Thread.sleep(1000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/p[2]/a[1]")).click();
  }

  @BeforeSuite
  public void beforeSuite() {
	 
		  System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver_win32/chromedriver.exe");
			WebDriver w = new ChromeDriver();
			w.get("http://google.com");
			driver=w;
  }

  @AfterSuite
  public void afterSuite() {
	
	  driver.findElement(By.xpath("//a[text()='JRE Expire Date']")).click();
  }

}
