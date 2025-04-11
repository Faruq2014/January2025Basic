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
		FindByRegistrationPage rp= new FindByRegistrationPage(driver);// nested driver
		rp.clickOnRegistrationLink();
		rp.firstName("Nilima123");
		rp.lastName("Khan");
		rp.monthsDropDown(1);
		rp.daysDropDown("7");
		rp.yearDropDown("2000");

	}

}
