package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ApplicationKeyWords extends ValidationKeyWords {

	public ApplicationKeyWords() {

		// *** MODIFICATION - VIDEO - 4_*
		String path = System.getProperty("user.dir") + "/src/test/resources/env.properties";

		prop = new Properties();
		envProp = new Properties();

		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);

			String env = prop.getProperty("env") + ".properties";
			path = System.getProperty("user.dir") + "/src/test/resources/" + env;
			
			fis = new FileInputStream(path);
			envProp.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void login() {
		System.out.println("ApplicationKeyWords login ");
	}

	public void selectDateFromCalendar() {
		System.out.println("ApplicationKeyWords selectDateFromCalendar ");
	}

	public void verifyStockAdded() {
		System.out.println("ApplicationKeyWords verifyStockAdded ");
	}
}
