package pomPfFindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

@FindBy(name="lastname") private WebElement lName;

public String lastName(String enterLastName) {
	lName.sendKeys(enterLastName);
	return enterLastName;
}

@FindBy(id="month") private WebElement dropMonth;
public void monthsDropDown(int enterMonth) {
	Select select = new Select(dropMonth); // nested webElement
	select.selectByIndex(enterMonth);
}

@FindBy(id="day") private WebElement dropDay;
public void daysDropDown(String enterDay) {
	Select daySelect= new Select(dropDay);
	daySelect.selectByValue(enterDay);
	
}

@FindBy(id="year") private WebElement dropYear;

public void yearDropDown(String enterYear) {
	Select yearSelect= new Select(dropYear);
	yearSelect.selectByVisibleText(enterYear);
	
}




















}
