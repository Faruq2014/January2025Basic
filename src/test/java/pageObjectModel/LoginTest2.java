package pageObjectModel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumInheritance.BaseTest;

public class LoginTest2 extends BaseTest{
	@BeforeMethod
	public void openFacebook() {
		openApplication();
	}
	
	@Test
	private void invalidLoginTest() {
		System.out.println("login test starts");
		LoginPage lp = new LoginPage(driver);
		lp.userName("kl@bmail.com");
		lp.password("ffjj123");
		lp.clickLoginButton();
		
	}
	
	
	
	@AfterMethod
	public void closeFacebook() {
		closeApplication();
	}

}
