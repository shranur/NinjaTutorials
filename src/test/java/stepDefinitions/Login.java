package stepDefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import junit.framework.Assert;

public class Login {
	
	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver = DriverFactory.getDriver();
		
		
		driver.findElement(By.xpath("//span[text() ='My Account'] ")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
	 
	}

	@When("User enters valid emaail address {string}")
	public void user_enters_valid_emaail_address(String emailText) {
	   driver.findElement(By.name("email")).sendKeys("anuragshrivastava007@gmail.com");
		
	}

	@When("User enter valid password {string}")
	public void user_enter_valid_password(String pwdText) {
	   driver.findElement(By.name("password")).sendKeys("Password#23");
	
		
	}

	@When("User clicks on Login Button")
	public void user_clicks_on_login_button() {
	   driver.findElement(By.xpath("//input[@value ='Login'] ")).click();
		
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
	    Assert.assertTrue((driver.findElement(By.linkText("Edit your account information")).isDisplayed()));
	}

	@When("User enters invalid emaail address {string}")
	public void user_enters_invalid_emaail_address(String string) {
		driver.findElement(By.name("email")).sendKeys("string");
	}

	@When("User enter invalid password {string}")
	public void user_enter_invalid_password(String pwd) {
		 driver.findElement(By.name("password")).sendKeys("pwd");
	}

	@Then("User should  not login successfully and see an error message")
	public void user_should_not_login_successfully_and_see_an_error_message() {
	    Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')] ")).isDisplayed());
	}

	
	
}
