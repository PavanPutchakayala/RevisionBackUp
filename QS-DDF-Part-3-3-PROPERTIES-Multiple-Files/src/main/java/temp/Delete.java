package temp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Delete {

	public static void main(String[] args) throws IOException {

		String path = System.getProperty("user.dir") + "/src/test/resources/env.properties";

		Properties prop = new Properties();
		Properties envProp = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
			
			String env = prop.getProperty("env")+ ".properties";
			path = System.getProperty("user.dir") + "/src/test/resources/"+env;
			fis = new FileInputStream(path);
			envProp.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prop.getProperty("env"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("login_submit"));
		
		System.out.println(envProp.getProperty("application"));
		System.out.println(envProp.getProperty("platform"));
		System.out.println(envProp.getProperty("url"));
		
	}
}
