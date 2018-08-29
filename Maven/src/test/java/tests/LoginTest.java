//package tests;
//
//import java.io.IOException;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import pages.HomePage;
//import pages.Login;
//import util.TestUtil;
//
//public class LoginTest {
//
//    //Create firefox driver's instance
//    WebDriver driver;
//	
//    @Test
//    public void verifyUserInfo() throws IOException {
//
//    	TestUtil D = new TestUtil();
//    	D.setProperty();
//    	driver.get(D.BASEUrl);
//    	
//    //Creating instance of loginPage
//    Login loginPage = new Login(driver);
//	
//    //Login to application
//    HomePage homePage = loginPage.loginWithValidCredentials("user1","pwd1");
//		
//    //Fetch user info
//    String userInfo = homePage.showUserInfo();
//		
//    //Asserting user info   
//    Assert.assertTrue(userInfo.equalsIgnoreCase("XYZ"),"Incorrect userInfo");
//    }
//}
