package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class BrowserFactory {
	
	static WebDriver driver;

	
	public static WebDriver init() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/Alain mugisha/Desktop/WebDrivers/chromedriver 5");
		
	   driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		//driver.manage().logs();
		
		driver.get("https://techfios.com/billing/?ng=login");
		
		//driver.getTitle();
		Thread.sleep(2000);
		
		return driver;
	}
	
	@AfterMethod
	public static void quiter() throws InterruptedException {
		
		
		Thread.sleep(10000);
		driver.quit();
		//driver.close();
		
	
		
	}
	
	
		
}
