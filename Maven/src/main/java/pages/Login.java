package pages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
WebDriver driver;
WebElement s ;
	 public Login(WebDriver driver) {
	        this.driver = driver;
	    }

	    //Using FindBy for locating elements
	    @FindBy(id = "userName")
	    private WebElement userName;

	    @FindBy(id = "password")
	    private WebElement password;

	    @FindBy(id = "submitButton")
	    private WebElement submit;

	    /*Defining all the user actions that can be performed in the loginPage
	    in the form of methods*/

	    
	    
	    public void typeUserName(String text) {
	        userName.sendKeys(text);
	    }

	    public void typePassword(String text) {
	        password.sendKeys(text);
	    }

	    /*Take note of return type of this method, clicking submit will navigate
	    user to Home page, so return type of this method is marked as HomePage.*/
	    public HomePage clickSubmit() {
	       
			s.click();
	        return new HomePage(driver);
	    }

	    public HomePage loginWithValidCredentials(String userName, String pwd) {
	        typeUserName(userName);
	        typePassword(pwd);
	        return clickSubmit();
	    }
	    
	    
	    
	    
	    
	    

}
