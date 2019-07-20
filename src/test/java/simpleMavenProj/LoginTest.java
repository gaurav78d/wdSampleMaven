package simpleMavenProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver","F:\\Testing\\TestingSW_And_Jars\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	
	@Test
	public void doLogin() {
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("gauravgattu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Gattu&*D>");
		driver.findElement(By.id("SignIn")).click();
		
	}
	
	
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	
	}
	
}
