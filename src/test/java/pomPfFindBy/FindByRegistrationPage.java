package pomPfFindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindByRegistrationPage {
public WebDriver driver;

public FindByRegistrationPage(WebDriver driver) {
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
//regular style of coding for example
public String clickOnRegistrationLink() {
	//a[starts-with(@id,'u_0_0_')]
	WebElement createnewAc=driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0_')]"));
	createnewAc.click();
	return null;
	
}


@FindBy(xpath="//a[starts-with(@id,'u_0_0_')]") WebElement createnewAcPF; //PageFactory

public String clickOnRegistrationLinkPF() {
	createnewAcPF.click();
	return null;
	
}

@FindBy(name="firstname") private WebElement fname;

public String firstName(String enterFirstname) {	
	fname.sendKeys(enterFirstname);
	return enterFirstname;
}



}
