package reports;

import java.io.File;
import java.util.Date;

public class Temp {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString().replaceAll(":", "-"));
		String reportsFolder=d.toString().replaceAll(":", "-") +"//screenshots";
		
		String path = System.getProperty("user.dir") +"//reports//"+reportsFolder;
		System.out.println(path);
		File f = new File(path);
		f.mkdirs();

	}

}
