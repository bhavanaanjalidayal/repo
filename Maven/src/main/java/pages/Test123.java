package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test123 {
	 WebDriver driver = null;
	@Given("User is on Home Page") 
	public void M1()
	{
		// Create a new instance of the Firefox driver
		System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver_win32/chromedriver.exe");
        driver = new FirefoxDriver();

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch the Online Store Website

        driver.get("http://www.store.demoqa.com");
	   
	   
	};

	@When("User Navigate to LogIn Page")
	public void M2()
	{
		 // Find the element that's ID attribute is 'account'(My Account) 

        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	};

	@When("User enters UserName and Password")
	public void M3()
	{
		// Enter Username on the element found by above desc.

        driver.findElement(By.id("log")).sendKeys("testuser_1"); 

        // Find the element that's ID attribute is 'pwd' (Password)

        // Enter Password on the element found by the above desc.

        driver.findElement(By.id("pwd")).sendKeys("Test@123");

        // Now submit the form. WebDriver will find the form for us from the element 

        driver.findElement(By.id("login")).click();
	};

	@Then("Message displayed Login Successfully")
	public void M4()
	{
		
		// Print a Log In message to the screen

        System.out.println("Login Successfully");
	};

	@When("User LogOut from the Application")
	public void M5()
	{
		// Find the element that's ID attribute is 'account_logout' (Log Out)

        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();

        // Print a Log In message to the screen
	};

	@Then("Message displayed LogOut Successfully")
	public void M6()
	{
        System.out.println("LogOut Successfully");

        // Close the driver

        driver.quit();
	};


}
