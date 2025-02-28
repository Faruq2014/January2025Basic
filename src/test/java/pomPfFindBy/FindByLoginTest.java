package pomPfFindBy;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumInheritance.BaseTest;

public class FindByLoginTest extends BaseTest{
	
	private FindByLoginPage flp;
	@BeforeMethod
	private void openFacebook() {
		openApplication();
	}
	
	
	@Test
	private void validLoginTest() {
		flp= new FindByLoginPage(driver);
		flp.userName("ghghhg@hmail/com");
		flp.passwordbutton("yuh");
		flp.clickLogin();
	}

	@AfterMethod
	private void closeFacebook() {
		closeApplication();
	}

}
