package hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;


public class ProjectHooks {

	WebDriver driver;
	
	//Hooks
		@Before
		public void setup() throws InterruptedException
		{	
			//configReader = new ConfigReader();
			Properties prop = ConfigReader.init_properties();
			
			 DriverFactory.initializeBrowser(prop.getProperty("browser"));
			 driver = DriverFactory.getDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//WebDriverWait wait=new WebDriverWait(driver, 20);
			
			
			driver.get(prop.getProperty("url"));
			
		}
		
		@After
		public void tearDown() {
			driver.quit();
		}
	
	
	
}
