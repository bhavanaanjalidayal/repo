package NewProject;

import java.awt.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium1Test {
	WebDriver driver;
//NO MAIN METHOD IN TESTNG ANNOTATIONS
  @BeforeTest
  public void LaunchURL() {

	  System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver_win32/chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("http://google.com");
		driver=w;
		//return driver;
		
  }
  @Test(priority = 1)
  public void AddText() throws InterruptedException
  {
	  WebElement e = driver.findElement(By.cssSelector("#lst-ib"));
		//.sendKeys("java");
		e.sendKeys("java");
		Thread.sleep(1000);
  }
  @Test(priority = 2)
  public void ChooseFromOptions() throws InterruptedException
  {
	//WORKING CSS SELECTOR PATH!!!
			//driver.findElement(By.cssSelector("#sbtc > div.gstl_0.sbdd_a > div:nth-child(2) > div.sbdd_b > div > ul > li:nth-child(2)")).click();
			////ul[@role='listbox']//li/descendant::div[@class='fr sbpqs_b']
	  
	  //  //ul[@role='listbox']//li/descendant::div[@class='sbqs_c']
	  java.util.List<WebElement> we = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		
		System.out.println(we.size());
		Thread.sleep(100);
		we.get(2).click();
  }
  @Test(priority = 3)
  public void ClickOnTheFirstLink() throws InterruptedException
  {
//		WebDriverWait wait = new WebDriverWait(driver,100);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("java")));
		
//		WebDriverWait wait = new WebDriverWait(driver,100);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("btnK")));
		Thread.sleep(1000);
		
		//GOOGLE SEARCH BUTTON
		//driver.findElement(By.name("btnK")).click();
		
		driver.findElement(By.linkText("Download Free Java Software")).click();
		//NOT WORKING FOR TAGNAMES
		//Tagnames can be used only when any unique tagname is present
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/p[2]/a[1]")).click();  
  }
}
