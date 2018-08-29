package automationFramework;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// Import package pageObject.*
import pageObjects.HomePage;
import pageObjects.Login;
import appModule.SignIn_Action;
import Utility.Constant;
public class POM_TC {
	WebDriver driver = null;
	 
 @Test
public void POM() throws Exception {

	 System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver_win32/chromedriver.exe");
	 
  driver = new ChromeDriver();

  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  driver.get("http://newtours.demoaut.com");

  // Use page Object library now

  SignIn_Action.Execute1(driver);

  System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

 // HomePage.lnk_LogOut(driver).click(); 

  driver.quit();

  }
}
;