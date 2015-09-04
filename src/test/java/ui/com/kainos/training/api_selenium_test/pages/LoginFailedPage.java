package ui.com.kainos.training.api_selenium_test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFailedPage {


	private WebDriver driver;
	
	private static final By LOGIN_FAILURE = By.id("result-message");
	
	public LoginFailedPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getResultMessage()
	{
		WebElement message = driver.findElement(LOGIN_FAILURE);
		return message.getText();
	}

}


