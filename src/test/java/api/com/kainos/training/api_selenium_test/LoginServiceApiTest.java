package api.com.kainos.training.api_selenium_test;

import static org.junit.Assert.assertTrue;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.junit.Test;

import com.kainos.training.jersey.client.BaseClient;

public class LoginServiceApiTest {
	
	BaseClient baseClient = new BaseClient("http://localhost:8080/login");
	
	@Test
	public void testSuccessfulLogin()
	{
		Response response = baseClient.getLogin("admin", "password");
		assertTrue(response.getStatus() == Response.Status.OK.getStatusCode());
	}
	
	@Test
	public void testFailedLogin()
	{
		Response response = baseClient.getLogin("" + Math.random(), "" + Math.random());
		assertTrue(response.getStatus() == Status.UNAUTHORIZED.getStatusCode());
	}
	
	@Test
	public void testNullLogin()
	{
		Response response = baseClient.getLogin(null, null);
		assertTrue(response.getStatus() == Status.BAD_REQUEST.getStatusCode());
	}
	
}
