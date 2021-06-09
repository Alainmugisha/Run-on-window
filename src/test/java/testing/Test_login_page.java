package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import all_pages.First_login_page;
import util.BrowserFactory;


@Test
public class Test_login_page {

	static WebDriver driver;


	
	public static void login_test() throws InterruptedException {

		BrowserFactory.init();
		
		First_login_page loginpage = PageFactory.initElements(driver, First_login_page.class );
		
		loginpage.usernamefield("demo@techfios.com");
		loginpage.passwordfield("abc123");
		loginpage.signin();
		

	}
}
