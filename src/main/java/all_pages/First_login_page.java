package all_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class First_login_page {

	WebDriver driver;

	public First_login_page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement USER_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SUBMIT_FIELD;

	public void usernamefield(String userName) {

		USER_FIELD.sendKeys(userName);
	}

	public void passwordfield(String passWord) {

		PASSWORD_FIELD.sendKeys(passWord);

	}

	public void signin() {

		SUBMIT_FIELD.click();

	}

}