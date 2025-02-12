package seleniumInheritance;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginWithInheritance_Test extends BaseTest{
	@BeforeMethod
	public void openApp() {
		openApplication();
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
	
  @AfterMethod
	public void closeApp() {
		closeApplication();
	}
}
