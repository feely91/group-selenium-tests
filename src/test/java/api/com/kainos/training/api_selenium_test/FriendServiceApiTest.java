package api.com.kainos.training.api_selenium_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.junit.Test;

import com.kainos.training.blackbox.client.FriendClient;
import com.kainos.training.blackboxinterface.model.person.Person;

public class FriendServiceApiTest {

	public FriendServiceApiTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testAddFriendSuccessful()
	{
		FriendClient client = new FriendClient("http://localhost:8910/person");
		
		Person theRock = new Person();
		theRock.setName("The Rock" + Math.random());
		
		Response response = client.addFriend(theRock);
		assertTrue(response.getStatus() == Status.OK.getStatusCode());		
		
		List<Person> friends = client.getFriendsList();
		assertEquals(theRock.getName(), friends.get(friends.size() - 1).getName());
	}

}
