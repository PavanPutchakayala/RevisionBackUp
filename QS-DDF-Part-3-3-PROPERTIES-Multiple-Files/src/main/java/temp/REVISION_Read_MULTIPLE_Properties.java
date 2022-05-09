package temp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class REVISION_Read_MULTIPLE_Properties {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir") + "/src/test/resources/env.properties";

		Properties prop = new Properties();
		Properties envProp = new Properties();

		try {
			FileInputStream fis = new FileInputStream(path);
			try {
				prop.load(fis);

				String env = prop.getProperty("env") + ".properties";

				path = System.getProperty("user.dir") + "/src/test/resources/" + env;
				fis = new FileInputStream(path);
				envProp.load(fis);

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(envProp.getProperty("url"));
		System.out.println(prop.getProperty("env"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
	}

}
