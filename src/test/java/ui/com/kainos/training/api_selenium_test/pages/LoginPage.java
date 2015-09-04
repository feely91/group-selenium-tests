package ui.com.kainos.training.api_selenium_test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebElement usernameBox;
	private WebElement passwordBox;
	private WebElement submitButton;

	private WebDriver driver;
	
	private static final By USERNAME = By.id("username-input");
	private static final By PASSWORD = By.id("password-input");
	private static final By SUBMIT = By.id("submit-button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void enterUsername(String user)
	{
		WebElement usernameTextBox = driver.findElement(USERNAME);
		usernameTextBox.sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		WebElement passwordTextBox = driver.findElement(PASSWORD);
		passwordTextBox.sendKeys(pass);
	}
	
	public void clickSubmit()
	{
		WebElement submitBtn = driver.findElement(SUBMIT);
		submitBtn.click();
	}
	
	public void enterCredentialsAndSubmit(String username, String password){
		enterUsername(username);
		enterPassword(password);
		clickSubmit();
	}
}
