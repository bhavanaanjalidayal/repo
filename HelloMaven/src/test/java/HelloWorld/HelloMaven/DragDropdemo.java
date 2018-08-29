package HelloWorld.HelloMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropdemo {

	static String amazon= "https://www.amazon.in";
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/test/drag_drop.html");
		//driver.get(amazon);
		WebElement source = driver.findElement(By.xpath("//ul/li[2]//child::a[@class='button button-orange']"));
//		
		WebElement target = driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		Point axes = target.getLocation();
		int x = axes.getX();
		int y = axes.getY();
		System.out.println(x+" "+y);
		Actions a1 = new Actions(driver);
		
		//a1.dragAndDrop(source, target).build().perform();
		
		a1.dragAndDropBy(source, x, y).build().perform();
		a1.sendKeys(target, "gsfghrher");
		//	WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		//action1.clickAndHold(powerbank).build().perform();
//		a1.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("jeans").keyUp(Keys.SHIFT).build().perform();
		
		Thread.sleep(1000);
	}
}
