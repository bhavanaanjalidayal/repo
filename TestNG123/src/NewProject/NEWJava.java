package NewProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NEWJava {

	 void f ()
	 {
	System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver_win32/chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("http://google.com");
		
	 }
}
