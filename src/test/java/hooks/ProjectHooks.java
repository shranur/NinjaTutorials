package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class ProjectHooks {
//Hooks
	WebDriver driver;
	//Hooks
		@Before
		public void setup() throws InterruptedException
		{
			 DriverFactory.initializeBrowser("chrome");
			 driver = DriverFactory.getDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//WebDriverWait wait=new WebDriverWait(driver, 20);
			driver.get("https://tutorialsninja.com/demo/");
			
		}
		
		@After
		public void tearDown() {
			driver.quit();
		}
	
	
	
}
