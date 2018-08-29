package HelloWorld.HelloMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ClassNew {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver_win32/chromedriver.exe");
		WebDriver basic =new ChromeDriver();
		
		basic.get("https://www.facebook.com");
		
		basic.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Namrata");
		basic.findElement(By.xpath("//input[@name='lastname']")).sendKeys("CP");
		basic.findElement(By.xpath("//input[@name='reg_passwd']")).sendKeys("Password");
	}
}
