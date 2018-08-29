package MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Hotels {

	static String baseURL = "https://www.phptravels.net/hotels";
	static String newURL = "http://demo.guru99.com/test/drag_drop.html";
	static String newUrl = "http://www.seleniumeasy.com/test/drag-drop-range-sliders-demo.html";
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get(newUrl);
	
	Thread.sleep(1000);
	//WebElement a = driver.findElement(By.xpath("//*[@id='fourth']/a"));
	//*[@id="fourth"]/a
	//WebElement d = driver.findElement(By.xpath("//*[@id='amt7']/li"));
	
	//System.out.println(driver.findElement(By.xpath("//*[@id=\'body-section\']/div[5]/div[3]/div/table/tbody/tr[1]/td/div[2]/div/h4/a/b")).isDisplayed());
//	
	
	WebElement a = driver.findElement(By.xpath("//*[@id='slider2']/div/input"));
	Actions act = new Actions(driver);
	
	Action dragdrop = act.clickAndHold().build();
	//act.
	
	//dragdrop.perform();
	
	driver.close();
	
	
	
}
	
}
