package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	   static WebDriver driver = null;
	   
	public static void initializeBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Browser name is not correct!!!!");
		}
		
		
	}
	
		public static WebDriver getDriver() {
			return driver;
	}

}
