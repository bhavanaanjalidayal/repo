// METHODS STARTING WITH get

// getClass	getCurrentUrl getPageSource	 getTitle	getWindowHandle	getWindowHandles
package HelloWorld.HelloMaven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class javatpoint {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		
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
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Category']"))).perform();
		
		//HOVER ON MOBILES, COMPUTERS
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"))).perform();
		
		//driver.findElement(By.xpath("//span[@class='a-size-small a-color-base' and text()='Accessories']")).click();
		
		//CLICK ON POWER BANKS
		driver.findElement(By.xpath("//span[text()='Power Banks']")).click();
		
		WebElement image = driver.findElement(By.xpath("//img[@alt = 'Mi Power bank 2i']"));
		if(image.isDisplayed())
		image.click();
		
		//CLICK ON ACCESSORIES
		driver.findElement(By.xpath("//span[@class='a-size-small a-color-base' and text()='Accessories']")).click();
		
		
		
		//*[@id="nav-link-shopall"]/span[2]
		//FOR CLOSING THE BROWSER
		//driver.close();
		
		
	}

}

