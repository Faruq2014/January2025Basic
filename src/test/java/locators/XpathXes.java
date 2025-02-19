package locators;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import seleniumInheritance.BaseTest;

public class XpathXes extends BaseTest{
	@BeforeTest
	public void openFacebook() {
		openApplication();

	}
	
	@Test
	public void xPathXesFormula() {
		/*
		 * in web development there are xes
		 * indside the xes- there could be ul/ol
		 * inside there li
		 * those are called xpath xes
		 *  -- first find the closest node
		 *  then build xpath xes
		 *  then if you need then put xpath index
		 */
		driver.findElement(By.xpath("//div[@id='pageFooterChildren']/ul/li[12]")).click();
	}
	
	@AfterTest
	public void closeFacebook() {
		 closeApplication();

	}
}
