package HelloWorld.HelloMaven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;

import Flash.FlashObjectWebDriver;

public class FlashObject {
	public static void main(String args[])
	{
	FirefoxDriver driver = new FirefoxDriver();
	FlashObjectWebDriver fdriver = new FlashObjectWebDriver(driver,"myFlashMovie");
	driver.get("http://demo.guru99.com/test/flash-testing.html");
	fdriver.callFlashObject("Play");
	fdriver.callFlashObject("StopPlay");
	//fdriver
	//http://demo.guru99.com/test/flash-testing.html
	//Thread.sleep(5000);		

}

}
