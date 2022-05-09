package dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider
	public Object[][] dataSuiteA(Method m) {

		Object[][] data = null;

		if (m.getName().toUpperCase().equals("TESTA")) {
			data = new Object[2][2];

			data[0][0] = "A00000001";
			data[0][1] = "P1";

			data[1][0] = "A2";
			data[1][1] = "P2";
			
		} else if (m.getName().toUpperCase().equals("TESTAA")) {
			System.out.println(m.getName());
			
			data = new Object[2][2];

			data[0][0] = "AA1";
			data[0][1] = "PP1";

			data[1][0] = "AA2";
			data[1][1] = "PP2";
		}

		return data;
	}

	@DataProvider
	public Object[][] dataSuiteB(Method m) {
		Object[][] data = null;
		if (m.getName().toUpperCase().equals("TESTB")) {
			data = new Object[2][3];

			data[0][0] = "B1";
			data[0][1] = "ROW1";
			data[0][2] = "Chrome";

			data[1][0] = "B1";
			data[1][1] = "ROW2";
			data[1][2] = "IE";
		} else if (m.getName().toUpperCase().equals("TESTBB")) {
			data = new Object[2][2];

			data[0][0] = "BB1";
			data[0][1] = "ROW1";

			data[1][0] = "BB1";
			data[1][1] = "ROW2";

		}
		return data;
	}

	@DataProvider
	public Object[][] dataSuiteC(Method m) {
		Object[][] data = null;

		if (m.getName().toUpperCase().equals("TESTC")) {
			data = new Object[2][1];
			data[0][0] = "C0";
			data[1][0] = "C1";

		} else if (m.getName().toUpperCase().equals("TESTCC")) {
			data = new Object[3][2];

			data[0][0] = "CC1";
			data[0][1] = "Admin";

			data[1][0] = "CC2";
			data[1][1] = "HR";

			data[2][0] = "CC3";
			data[2][1] = "Dev";

		}

		return data;
	}

}