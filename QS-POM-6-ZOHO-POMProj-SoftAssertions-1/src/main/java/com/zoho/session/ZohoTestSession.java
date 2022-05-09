package com.zoho.session;

import org.testng.Reporter;

import com.zoho.base.pages.ZohoPage;
import com.zoho.pages.normal.LaunchPage;
import com.zoho.web.WebConnector;
import com.zoho.web.ZohoDriver;

public class ZohoTestSession {

	// Here THIS refers to Current Object of ZOHO SESSION - Video 3 @ 44:00
	// this EQUIVALENT to new ZohoSession();
	// this == new ZohoSession();
	// this line creates a Session object for Current Test Case.
	// How about if there are Multiple test Cases

	WebConnector con;
	ZohoPage currentPage;


	public ZohoTestSession() {
		con = new ZohoDriver();
	}

	public ZohoPage init() {
		if (Reporter.getCurrentTestResult().getTestContext().getAttribute("session") == null)
			Reporter.getCurrentTestResult().getTestContext().setAttribute("session", this);

		return new LaunchPage();
	}

	public WebConnector getCon() {
		return con;
	}
	
	
	
	public ZohoPage getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(ZohoPage currentPage) {
		this.currentPage = currentPage;
	}


}
