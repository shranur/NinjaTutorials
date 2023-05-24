package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="email")
	private WebElement emailField;
	
	@FindBy(name="password")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@value ='Login']")
	private WebElement loginButton;
	
	public void enterEmail(String email)
	{
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String pwd) {
		passwordField.sendKeys(pwd);
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}

}
