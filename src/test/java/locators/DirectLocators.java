package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import seleniumInheritance.BaseTest;

public class DirectLocators extends BaseTest{
	
	@BeforeTest
	public void openFacebook() {
		openApplication();
		
	}
	@Test
	public void idTest() {
		driver.findElement(By.id("email")).sendKeys("hghg");
	}
	
	@Test
	public void nameTest() {
		driver.findElement(By.name("pass")).sendKeys("ghhg");
	}
	
	@Test
	public void classTest() {
		WebElement text=driver.findElement(By.className("_8eso"));
		System.out.println(text.toString());
	}
	
	@Test
	public void linkTest() {
		driver.findElement(By.linkText("Create new account")).click();
	}
	
	@Test
	public void partialLinkTest() {
		driver.findElement(By.partialLinkText("Consumer Health")).click();
	}
	
	@Test
	public void radioButtonTest() {
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.id("sex")).click();
	}
	
	
	
	
	@AfterTest
public void closeFacebook() {
		//closeApplication();
		
	}

}
