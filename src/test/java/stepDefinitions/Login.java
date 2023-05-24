package stepDefinitions;



import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;

public class Login {
	
	WebDriver driver;
	private LoginPage loginPage;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver = DriverFactory.getDriver();
		
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccount();
		
		//driver.findElement(By.xpath("//span[text() ='My Account'] ")).click();
		homePage.clickOnLoginButton();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		homePage.clickOnRegisterButton();
	 
	}

	@When("User enters valid emaail address \"([^\"]*)\"$")
	public void user_enters_valid_emaail_address(String email) {
		loginPage = new LoginPage(driver);
		
	   //driver.findElement(By.name("email")).sendKeys(emailText);
		loginPage.enterEmail(email);
		
	}

	@When("User enter valid password \"([^\"]*)\"$")
	public void user_enter_valid_password(String pwd) {
	   //driver.findElement(By.name("password")).sendKeys(pwdText);
		loginPage.enterEmail(pwd);
		
	}

	@When("User clicks on Login Button")
	public void user_clicks_on_login_button() {
	   //driver.findElement(By.xpath("//input[@value ='Login'] ")).click();
		loginPage.clickOnLoginButton();
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
	    Assert.assertTrue((driver.findElement(By.linkText("Edit your account information")).isDisplayed()));
	}

	@When("User enters invalid emaail address")
	public void user_enters_invalid_emaail_address() {
		driver.findElement(By.name("email")).sendKeys(getEmailWithTimeStamp());
	}

	@When("User enter invalid password \"([^\"]*)\"$")
	public void user_enter_invalid_password(String pwd) {
		 driver.findElement(By.name("password")).sendKeys("pwd");
	}

	@Then("User should  not login successfully and see an error message")
	public void user_should_not_login_successfully_and_see_an_error_message() {
	    Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')] ")).isDisplayed());
	}
	
	public  String getEmailWithTimeStamp()
	{
		Date date = new Date();
		return "xyz"+date.toString().replace(" ", "_").replace(":", "_")+"@gmail.com";
		
		
	}

	
	
	
}
