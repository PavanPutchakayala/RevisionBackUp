package temp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class REVISION_ReadProperties {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir") + "/src/test/resources/prod.properties";
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(path);
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("platform"));
		System.out.println(prop.getProperty("application"));
	}

}
