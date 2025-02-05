package facebookWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {
	//static WebDriver driver;
	
	
	/*---test case
	 * test step 1-- open face book
	 * --- enter user name
	 * ---- enter pass word
	 * -----click on login button
	 * ---- actual result= expected result== pass
	 * --- valid pass or fail
	 */
	
	// test scripts
	
	public static void main(String[] args) {
		// open face book
		ChromeDriver driver =new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		 // enter user name
		 driver.findElement(By.id("email")).sendKeys("hk@dmail.com");
		 
		 // enter pass word
		 driver.findElement(By.id("pass")).sendKeys("hkjkj");
		 
		 // click on login button
		 driver.findElement(By.name("login")).click();
		 // validate the results
		 // we will build this code later
		 
		 // close the application
          driver.quit();
          
          OpenFacebook of= new OpenFacebook();
          of.invalidLoginTest();
	}
	
	public void invalidLoginTest() {
		
		// open face book
				ChromeDriver driver =new ChromeDriver();
				 driver.get("https://www.facebook.com/");
				 
				 // enter user name
				 driver.findElement(By.id("email")).sendKeys("invalid@dmail.com");
				 
				 // enter pass word
				 driver.findElement(By.id("pass")).sendKeys("hkjkj123");
				 
				 // click on login button
				 driver.findElement(By.name("login")).click();
				 // validate the results
				 // we will build this code later
				 
				 // close the application
		          driver.quit();
		
	}

}
