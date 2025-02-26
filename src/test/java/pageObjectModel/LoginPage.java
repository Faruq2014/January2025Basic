package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
WebDriver driver;

public LoginPage(WebDriver driver) {
	super();
	this.driver = driver;
}
public String userName(String enterUserName) {
	//driver.findElement(By.id("email")).clear();
	//driver.findElement(By.id("email")).sendKeys(uName);
	
	WebElement userName=driver.findElement(By.id("email"));
	userName.clear();
	userName.sendKeys(enterUserName);
	 System.out.println( userName.getAttribute("class"));
     System.out.println( userName.getAccessibleName());
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
