package pomWithPageFactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumInheritance.BaseTest;

public class PomLoginTest extends BaseTest{
	private PomLoginPage plp;
	@BeforeMethod
	private void openFacebook() {
		openApplication();
	}
	
	@Test
	private void loginTest() {
		plp= new PomLoginPage(driver);
		plp.userName("1234567890");
		plp.password("hh");
		plp.clickLoginButton();
	}
	
	@Test
	private void inloginTest() {
		plp= new PomLoginPage(driver);
		plp.userName("234567890");
		plp.password("hjg");
		plp.clickLoginButton();
	}
	
	@Test
	private void boundaryloginTest() {
		plp= new PomLoginPage(driver);
		plp.userName("234567891");
		plp.password("hjg");
		plp.clickLoginButton();
	}
	
	
	
	@AfterMethod
	private void closeFacebook() {
		closeApplication();
	}

}
