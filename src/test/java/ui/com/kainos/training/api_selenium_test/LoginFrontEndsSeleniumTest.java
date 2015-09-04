package ui.com.kainos.training.api_selenium_test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginFrontEndsSeleniumTest extends BaseTest {

	@Before
	public void setup() {
		driver.get("http://localhost:8900/login");

	}

	@Test
	public void testSuccesfulLogin() {

		loginPage.enterCredentialsAndSubmit("admin", "password");
		
		// assertTrue(driver.getCurrentUrl().contains("/login-success"));

		boolean loginSuccessMsg = homePage.getResultMessage().contains("Successful");

		assertTrue(loginSuccessMsg);
	}

	@Test
	public void testFailedLogin() {

		loginPage.enterCredentialsAndSubmit("adam", "password");

		// assertTrue(driver.getCurrentUrl().contains("/login-failure"));

		boolean loginFailedMsg = loginFailedPage.getResultMessage().contains("Failed");

		assertTrue(loginFailedMsg);
	}


}
