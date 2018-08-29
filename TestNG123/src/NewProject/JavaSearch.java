package NewProject;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSearch {
	WebDriver driver;
	
	
	 @Test(priority=2,groups= {"checkintest"}, expectedExceptions = Exception.class)
  public void beforeClass() throws InterruptedException {
	  java.util.List<WebElement> we = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		
		System.out.println(we.size());
		Thread.sleep(100);
		we.get(2).click();
	 
  }

	 @Test(priority=3,groups= {"functest","checkintest"},dependsOnGroups="checkintest")
	// @Test(priority=3,enabled = false)
  public void afterClass() throws InterruptedException {
	Thread.sleep(1000);
		
		//GOOGLE SEARCH BUTTON
		//driver.findElement(By.name("btnK")).click();
		
		driver.findElement(By.linkText("Download Free Java Software")).click();

	 
  }

  @Test(priority=1,groups= {"functest","checkintest"})
  public void beforeTest() throws InterruptedException {
	  WebElement e = driver.findElement(By.cssSelector("#lst-ib"));
		//.sendKeys("java");
		e.sendKeys("java");
		Thread.sleep(1000);
	  
  }

  @Test(priority=4,groups= {"functest","checkintest"})
  public void afterTest() {
	  driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/p[2]/a[1]")).click();
  }

  @Test(priority=0,groups= {"functest","checkintest"})
  public void beforeSuite() {
	 
		  System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver_win32/chromedriver.exe");
			WebDriver w = new ChromeDriver();
			w.get("http://google.com");
			driver=w;
  }

  @Test(priority=5,groups= {"functest","checkintest"})
  public void afterSuite() {
	
	  driver.findElement(By.xpath("//a[text()='JRE Expire Date']")).click();
  }

}
