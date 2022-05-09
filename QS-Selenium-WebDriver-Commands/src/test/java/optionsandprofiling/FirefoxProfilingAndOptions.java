package optionsandprofiling;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.Test;


/*Scripting in Different Browsers*/
/*Video2: Managing Browser Notifications, SSL Errors, Proxy Settings, Browser Logs */
public class FirefoxProfilingAndOptions {

	// notifications
	// maximize the browsers
	// Certificate errors
	// work with proxy

	@Test
	public void firefox() {
		FirefoxOptions options = new FirefoxOptions();

		/*  @ 16:16 - LOGS - Started  */
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "logs/firefox.log");

		/* @ 22:00 SL Errors */
		ProfilesIni allProf = new ProfilesIni();
		FirefoxProfile prof = allProf.getProfile("SeleniumTesting");
		prof.setPreference("dom.webnotifications.enabled", false);
		options.setProfile(prof);

		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("https://www.pushengage.com/demo");

	}

	public void revisionFF() {
		FirefoxOptions options = new FirefoxOptions();
		ProfilesIni allProf = new ProfilesIni();
		FirefoxProfile prof = allProf.getProfile("SeleniumTesting");
		options.setProfile(prof);

	}

}
