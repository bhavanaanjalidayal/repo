package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
	
    @FindBy(id = "userInfo")
    private WebElement userInfo;
	
    @FindBy(xpath = "")
    private WebElement r;
    
    public String clickUserInfo(){
	userInfo.click();
	return "USERINFO";
    }
	
    public String showUserInfo(){
	String userData = clickUserInfo();
	return userData;
    }

}
