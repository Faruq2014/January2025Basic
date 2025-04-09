package pomPfFindBy;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import seleniumInheritance.BaseTest;

public class FindByRegistrationTest extends BaseTest {
	@BeforeTest
	public void openFacebook() {
		openApplication();
	}

	@Test
	public void registrationTest() {
		FindByRegistrationPage rp= new FindByRegistrationPage(driver);
		rp.clickOnRegistrationLink();
		rp.firstName("Nilima123");

	}

}
