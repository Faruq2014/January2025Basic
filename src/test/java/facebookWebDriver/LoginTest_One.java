package facebookWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest_One {


	WebDriver driver;
     @BeforeTest
	public void openApp() {
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
     @Test(priority=1)
	public void usernameTest() {
    	 System.out.println("user name-1");
		driver.findElement(By.id("email")).sendKeys("valid@dmail.com");
	}
     
     @Test(priority=2)
     public void passwordTest() {
    	 System.out.println("pass-2");
    	driver.findElement(By.id("pass")).sendKeys("hhhu"); 
     }
     
     @Test(priority=3)
     public void loginButtonTest() {
    	 System.out.println("login-3");
    	 driver.findElement(By.name("login")).click();
     }

	@AfterTest
	public void closeApp() {
	driver.quit();	
	}
}
