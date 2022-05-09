package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ApplicationKeyWords extends ValidationKeyWords {

	public ApplicationKeyWords() {

		// THIRD MODIFICATION - VIDEO - 4_1
		String path = System.getProperty("user.dir") + "/src/test/resources/env.properties";

		prop = new Properties();

		// FOURTH MODIFICATION - VIDEO - 4_1
		envProp = new Properties();

		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);

			// FIFTH MODIFICATION - VIDEO - 4_1
			String env = prop.getProperty("env") + ".properties";

			// SIXTH MODIFICATION - VIDEO - 4_1
			path = System.getProperty("user.dir") + "/src/test/resources/" + env;
			
			// SEVENTH MODIFICATION - VIDEO - 4_1
			fis = new FileInputStream(path);
			
			// EIGTH MODIFICATION - VIDEO - 4_1			
			envProp.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// System.out.println(prop.getProperty("url"));
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
