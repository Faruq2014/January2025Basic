package locators;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import seleniumInheritance.BaseTest;

public class Xpath extends BaseTest{

	
	@BeforeTest
	public void openFacebook() {
		openApplication();
		
	}
	
	@Test
	public void xpathFormula() {
		/*
		 *    //tag[@attributes='value']
		 *    //input[@id='email']
		 */
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hhhjk");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dd12");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).clear();
	}
	
	
	@Test
	public void dynamicXpathFormula() {
		/*
		 * X path function == //tagname[function name(@tag,’value’)]
		 * 
		 * //button[starts-with(@id,'u_0_5_')]
		 * 
		 * //input[starts-with (@name,’email’)]
		 * 
		 * //a[contains(text(),'Forgot account?')]
		 * 
		 */
		
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5_')]")).click();
		
	}
	
	
	@AfterTest
public void closeFacebook() {
		//closeApplication();
		
	}

}
