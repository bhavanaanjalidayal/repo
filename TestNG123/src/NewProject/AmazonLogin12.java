package NewProject;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
public class AmazonLogin12 {

	@Test
	void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		 String e = driver.findElement(By.xpath("//span[text()='Amazon']")).getText();
		 
	//	boolean e = Assert.assertEquals(e, "Amazon");
		 Assert.assertEquals(e, "Amdgfazon", "Right");
		
		 
		
		
		//USING getClass method
		Class<? extends WebDriver> g = driver.getClass();
		System.out.println("getClass method Output = "+g);
		
		String CurrentURL =driver.getCurrentUrl();
		System.out.println("getCurrentUrl method = "+CurrentURL);
		
		String PageSource = driver.getPageSource();
		//System.out.println("Page Source = "+PageSource);
		
		
		String title = driver.getTitle();
		System.out.println("Title of the page is = "+title);
		
		String w = driver.getWindowHandle();
		System.out.println("USING getWindowHandle = "+w);
		
		Set<String> f = driver.getWindowHandles();
		System.out.println("USING getWindowHandles = "+f);
		
		
		//***********************************************************************************************************
		int hashcode = driver.hashCode();
		System.out.println("HASHCODE = "+hashcode);
		
		//HOVER ON CATEGORY
		Actions action1 = new Actions(driver);
		
		action1.moveToElement(driver.findElement(By.xpath("//span[text()='Category']"))).perform();
		
		//HOVER ON MOBILES, COMPUTERS
		action1.moveToElement(driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"))).perform();
		
		//driver.findElement(By.xpath("//span[@class='a-size-small a-color-base' and text()='Accessories']")).click();
		
		//CLICK ON POWER BANKS
		driver.findElement(By.xpath("//span[text()='Power Banks']")).click();
		
		WebElement image = driver.findElement(By.xpath("//img[@alt = 'Mi Power bank 2i']"));
		if(image.isDisplayed())
		image.click();
		
		//CLICK ON ACCESSORIES
		driver.findElement(By.xpath("//span[@class='a-size-small a-color-base' and text()='Accessories']")).click();
		
		WebElement powerbank = driver.findElement(By.xpath("//h2[@data-attribute='Mi 10000mAH Li-Polymer Power bank 2i (Black)']"));
	
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		//action1.clickAndHold(powerbank).build().perform();
		action1.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("jeans").keyUp(Keys.SHIFT).build().perform();
		
		Thread.sleep(1000);
		
		//*[@id="nav-link-shopall"]/span[2]
		//FOR CLOSING THE BROWSER
		//driver.close();
		
		
	}
}
