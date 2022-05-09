package dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	
	
	@DataProvider
	public static Object[][] dataSuiteA(Method m) {
		System.out.println(m.getName());
		Object data[][] = null;
		if (m.getName().toUpperCase().equals("TESTA")) {

			data = new Object[2][2];
			// row 1
			data[0][0] = "U1";
			data[0][1] = "P1";

			// row 2
			data[1][0] = "U2"; // xls , json
			data[1][1] = "P2";

		} else if (m.getName().toUpperCase().equals("TESTB")) {
			data = new Object[2][2];
			// row 1
			data[0][0] = "xx";
			data[0][1] = "U1";

			// row 2
			data[1][0] = "xx"; // xls , json
			data[1][1] = "U2";
		} else if (m.getName().toUpperCase().equals("TESTC")) {
			data = new Object[2][3];
			// row 1
			data[0][0] = "xx";
			data[0][1] = "U1";
			data[0][2] = 23234;

			// row 2
			data[1][0] = "xx"; // xls , json
			data[1][1] = "U2";
			data[1][2] = 23234;
		}
		return data;

	}




	
	
	@DataProvider
	public static Object[][] dataSuiteB(Method m) {
		System.out.println(m.getName());
		Object data[][] = null;
		if (m.getName().toUpperCase().equals("TESTA")) {

			data = new Object[2][2];
			// row 1
			data[0][0] = "U1";
			data[0][1] = "P1";

			// row 2
			data[1][0] = "U2"; // xls , json
			data[1][1] = "P2";

		} else if (m.getName().toUpperCase().equals("TESTB")) {
			data = new Object[2][2];
			// row 1
			data[0][0] = "xx";
			data[0][1] = "U1";

			// row 2
			data[1][0] = "xx"; // xls , json
			data[1][1] = "U2";
		} else if (m.getName().toUpperCase().equals("TESTC")) {
			data = new Object[2][3];
			// row 1
			data[0][0] = "xx";
			data[0][1] = "U1";
			data[0][2] = 23234;

			// row 2
			data[1][0] = "xx"; // xls , json
			data[1][1] = "U2";
			data[1][2] = 23234;
		}
		return data;

	}





}
