package dummy;

import org.testng.annotations.Test;

import com.zoho.web.ZohoDriver;
import com.zoho.web.ZohoWebConnector;

public class LoginTest {

	@Test
	public void loginTest() {
	
		/*
		ZohoTestSession session = new ZohoTestSession();
		session.init();
		*/
		
		ZohoWebConnector con = new ZohoDriver();
		con.openBrowser("chrome");
	}

}
