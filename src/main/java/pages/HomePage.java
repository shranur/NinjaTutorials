package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text() ='My Account']")
	private WebElement myAccountDropMenu;
	
	@FindBy(xpath="//span[text() ='My Account']")
	private WebElement loginOption;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement registerOption;
	
	public void clickOnMyAccount()
	{
		myAccountDropMenu.click();
	}
	
	public void clickOnLoginButton() {
		loginOption.click();
	}
	public void clickOnRegisterButton() {
		registerOption.click();
	}

}
