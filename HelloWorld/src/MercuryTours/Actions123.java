package MercuryTours;
import Basic.setProperty;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions123 {
	@Test
	public  void act() throws IOException
	{
		String baseUrl="http://swisnl.github.io/jQuery-contextMenu/demo.html";
		
		setProperty f = new setProperty();
		f.setProperty1();
		
		WebDriver driver = new ChromeDriver();	
		driver.get(baseUrl);
		//driver.close();
		Actions e = new Actions(driver);
		Action d = e.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).build();
		d.perform();
		
	//e.doubleClick(driver.findElement(By.xpath("//span[text()='right click me']")));
		driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']//li//span[text()='Copy']")).click();
	}

}
