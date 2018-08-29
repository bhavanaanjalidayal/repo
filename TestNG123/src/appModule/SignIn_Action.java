package appModule;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//import Utility.ExcelUtils;
import pageObjects.HomePage;
import pageObjects.Login;
public class SignIn_Action {
  @Test
  public static void Execute(WebDriver driver,String sUserName,String sPassword){
	  
HomePage.lnk_MyAccount(driver).click(); 

Login.txtbx_UserName(driver).sendKeys(sUserName);

Login.txtbx_Password(driver).sendKeys(sPassword);

Login.btn_LogIn(driver).click();

}
  @Test
  public static void Execute(WebDriver driver){
	  
	 // HomePage.lnk_MyAccount(driver).click(); 

	  Login.txtbx_UserName(driver).sendKeys("testuser_1");

	  Login.txtbx_Password(driver).sendKeys("Test@123");

	  Login.btn_LogIn(driver).click();
}
  
  @Test
  public static void Execute1(WebDriver driver) throws Exception{
	  
  Properties p = new Properties();
//  InputStream input = new FileInputStream(System.getProperty("username"));
 String user =  p.getProperty("username");
 
  
  String password = p.getProperty("password");
  Login.txtbx_UserName(driver).sendKeys(user);

  Login.txtbx_Password(driver).sendKeys(password);

  Login.btn_LogIn(driver).click();
  }

}