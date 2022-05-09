package com.zoho.session;

import org.testng.Reporter;


public class ZohoTestSession {
	
	// Here THIS refers to Current Object of ZOHO SESSION - Video 3 @ 44:00
	// this EQUIVALENT to new ZohoSession();
	// this == new ZohoSession();
	// this line creates a Session object for Current Test Case.
	// How about if there are Multiple test Cases
	

	public void init() {
		if(Reporter.getCurrentTestResult().getTestContext().getAttribute("session") == null) 
		Reporter.getCurrentTestResult().getTestContext().setAttribute("session", this);
		
	}

}
