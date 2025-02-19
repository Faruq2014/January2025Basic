package locators;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import seleniumInheritance.BaseTest;

public class XpathIndex extends BaseTest{
 // how do you handle duplicate locators value
	@BeforeTest
	public void openFacebook() {
		openApplication();

	}
	
	@Test
	public void xPathIndexFormula() {
		/*
		 * if you have more than one xpath or id with the same value
		 * then use index to specify exactly which one you want to click
		 */
		driver.findElement(By.xpath("//*[@type='submit'][1]")).click();
	}
	
	@AfterTest
	public void closeFacebook() {
		 closeApplication();

	}
}
