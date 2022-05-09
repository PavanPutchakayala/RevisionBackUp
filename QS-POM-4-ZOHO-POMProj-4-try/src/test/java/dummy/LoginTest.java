package dummy;

import org.testng.annotations.Test;

import com.zoho.base.pages.ZohoPage;
import com.zoho.session.ZohoTestSession;

public class LoginTest {

	@Test
	public void loginTest() {

		ZohoTestSession session = new ZohoTestSession();

		ZohoPage page = session
							.init()
							.openBrowser("chrome");

		page.goToHomePage();

	}

}
