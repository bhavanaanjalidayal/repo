package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HealthCare {

	static String tutorial = "http://tutorialspoint.com";
	static String healthcare = "healthcare";
	static String java = "java";
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		

		
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(java);
	Thread.sleep(1000);
		//driver.findElement(By.xpath("//ul[@class = 'sbsb_b' and @role='listbox']/li[1]//descendant::div/div[2]")).click();
		driver.findElement(By.xpath("//ul[@class = 'sbsb_b' and @role='listbox']/li//descendant::div/div[2]/b[text()=' interview questions']")).click();

		
		
//				driver.get(tutorial);
//		driver.findElement(By.xpath("//ul[@id = 'computer_programming']/li[16]")).click();
		//15
	
	}
}
