package pageObjectModel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumInheritance.BaseTest;

public class LoginTest3 extends BaseTest{
	@BeforeMethod
	public void openFacebook() {
		openApplication();
	}
	
	@Test
	private void boundaryLoginTest() {
		System.out.println("login test starts");
		LoginPage lp = new LoginPage(driver);
		lp.userName("12234555");
		lp.password("ffjj");
		lp.clickLoginButton();
		
	}
	
	
	
	@AfterMethod
	public void closeFacebook() {
		closeApplication();
	}

}
