package facebookWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	/*---test case
	 * test step 1-- open face book
	 * --- enter user name
	 * ---- enter pass word
	 * -----click on login button
	 * ---- actual result= expected result== pass
	 * --- valid pass or fail
	 * --- close application
	 */
	
	WebDriver driver; // instance variable-- class level- all method can use it
	
	
	//open face book
	@BeforeMethod
	public void openApplication() {
    System.out.println("open app");
    driver= new ChromeDriver();  // intalization of instance variable
    driver.get("https://www.facebook.com/");
    
	}
    @Test(priority=0)
	public void validLoginTest() {
    	 System.out.println("valid test");
    	 driver.findElement(By.id("email")).sendKeys("valid@dmail.com");
    	 driver.findElement(By.id("pass")).sendKeys("kjhj");
    	 driver.findElement(By.name("login")).click();
	}
    @Test(priority=1)
	public void invalidLoginTest() {
    	 System.out.println("invalid test");
    	 driver.findElement(By.id("email")).sendKeys("invalid@dmail.com");
    	 driver.findElement(By.id("pass")).sendKeys("kjhj");
    	 driver.findElement(By.name("login")).click();
	}

	// close application
	
	@AfterMethod
	public void closeApplication() {
		 System.out.println("close app");
		 driver.quit();
	}
	
}
