package pomWithPageFactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumInheritance.BaseTest;
import utilities.PropertyReader;

public class LoginTestUsingProperty extends BaseTest{

	private PomLoginPage plp;
	PropertyReader pr;
	
	@BeforeMethod
	private void openFacebook() {
		openApplication();
	}
	
	@Test
	private void loginTest() {
		plp= new PomLoginPage(driver);
		pr= new PropertyReader();
		plp.userName(pr.getUserName());
		plp.password(pr.getPassword());
		plp.clickLoginButton();
	}
	
	@AfterMethod
	private void closeFacebook() {
		closeApplication();
	}
}
