package pomWithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PomLoginPage {

	WebDriver driver;

	public PomLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}
	
	public String userName(String enterUserName) {
		WebElement userName=driver.findElement(By.id("email"));
		userName.clear();
		userName.sendKeys(enterUserName);		
		return enterUserName;
	}
	public String password(String enterPassword) {
		WebElement passwordButton =driver.findElement(By.id("pass"));
		passwordButton.clear();
		passwordButton.sendKeys(enterPassword);
		return enterPassword;	
	}

	public void clickLoginButton() {
		WebElement loginButton=driver.findElement(By.name("login"));
		loginButton.click();
	}
}
