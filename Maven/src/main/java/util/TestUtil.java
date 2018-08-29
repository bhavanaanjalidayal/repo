package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestUtil{
	
	/* Utility class (TestUtil.java) stores and handles the functions 
	 * (The code which is repetitive in nature such as waits, actions, 
	 * capturing screenshots, accessing excels, sending email etc.,) 
	 * which can be commonly used across the entire framework. 
	 * The reason behind creating utility class is to achieve reusability.
	 *  This class extends the TestBase class to inherit the properties of TestBase in TestUtil.
	 */
public  String BASEUrl = "";
static WebDriver driver;


	public  void setProperty() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
}
