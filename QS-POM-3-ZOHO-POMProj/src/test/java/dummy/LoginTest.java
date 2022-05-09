package dummy;

import org.testng.annotations.Test;

import com.zoho.base.pages.ZohoPage;
import com.zoho.pages.normal.LaunchPage;
import com.zoho.session.ZohoTestSession;

public class LoginTest {

	@Test
	public void loginTest() {
	
		ZohoTestSession session = new ZohoTestSession();
		session.init();
		
	}

}
