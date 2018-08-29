package MercuryTours;

import java.lang.reflect.Array;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/register");

		String[] arr = {"firstname","lastname","phone","email","password","confirmpassword"};
		String[] value = {"Bhavana","Anjali","55414345","a@q.com","password","password"};
		for(int i =0;i<arr.length;i++)
		{
			driver.findElement(By.xpath("//input[@name="  +  "'"  +  arr[i]+  "'"  +  "]")).sendKeys(value[i]);
			Thread.sleep(100);
		}
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		boolean Welcome = driver.findElement(By.xpath("//h3[text()='Hi, "+value[0]+" "+value[1]+"']")).isDisplayed();
		System.out.println(Welcome);
		
		
		
		
		
		
		
	}

}
