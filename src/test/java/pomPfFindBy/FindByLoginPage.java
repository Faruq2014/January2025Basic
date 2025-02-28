package pomPfFindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindByLoginPage {

	WebDriver driver;

	public FindByLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	public WebElement uName;

	public String userName(String enterUserName) {
		uName.sendKeys(enterUserName);
		return enterUserName;
	}

	@FindBy(xpath = "//input[@id='pass']")
	private WebElement password;

	public String passwordbutton(String enterYourPass) {
		password.sendKeys(enterYourPass);
		return enterYourPass;
	}

	@FindBy(xpath = "//button[starts-with(@id,'u_0_5_')]")
	private WebElement login;

	public void clickLogin() {
		login.click();
	}

}
