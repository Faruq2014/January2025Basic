package locators;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import seleniumInheritance.BaseTest;

public class DynamicXpath extends BaseTest {
// how do you handle dynamic locators?
	@BeforeTest
	public void openFacebook() {
		openApplication();

	}

	@Test
	public void startWithFormula() {
		/*//tag[starts-with (@attribute,’value’)]
		 * //input[starts-with (@name,’email’)]
		 * //button[starts-with(@id,'u_0_5_')]
		 * always looking for static value in the begging of the value
		 * 
		 * ends-with-- not preffered--
		 *  
		 * tag[ends-with (@attribute,’value’)]
		 * //button[ends-with(@class,' _4jy6 _4jy1 selected _51sy')] 
		 * always looking for static value in the ending of the value
		 * 
		 * 
		 */

		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5_')]")).click();

	}

	@Test
	public void containFunction() {
		/*  //tag[contains(text(),'value')]
		 *   //a[contains(text(),'Forgot account?')] 
		 *   //button[contains(text(),'Log')]
		 *   
		 *   it is build for text function-- attributes must have some text
		 *   if text is not there-- it will not work
		 *   if your text is dynamic-- then choose some text never change
		 *   if your text is compound value-- chose some text never change
		 */
		
		//driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contact Uploading ')]")).click();
	}
	
	
	
	@AfterTest
	public void closeFacebook() {
		 closeApplication();

	}
}
