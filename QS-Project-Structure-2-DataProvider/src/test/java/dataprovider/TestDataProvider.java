package dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider
	public static Object[][] datasuiteA(Method m) {

		Object data[][] = null;
		System.out.println(m.getName());
		if (m.getName().toUpperCase().equals("TESTA")) {
			data = new Object[2][2];
			data[0][0] = "U1-testA";
			data[0][1] = "P1-testA";

			data[1][0] = "U2-testA";
			data[1][1] = "P2-testA";

		} else if (m.getName().toUpperCase().equals("TESTAA")) {
			data = new Object[2][2];
			data[0][0] = "U1-test AA";
			data[0][1] = "P1-test AA";

			data[1][0] = "U2-test AA";
			data[1][1] = "P2-test AA";
		}
		return data;

	}

	@DataProvider
	public static Object[][] datasuiteB(Method m) {

		Object data[][] = null;
		System.out.println(m.getName());
		
		if (m.getName().toUpperCase().equals("TESTB")) {
			data = new Object[2][2];
			data[0][0] = "R1-testB";
			data[0][1] = "C1-testB";

			data[1][0] = "R2-testB";
			data[1][1] = "C2-testB";

		} else if (m.getName().toUpperCase().equals("TESTBB")) {
			data = new Object[2][2];
			data[0][0] = "R1-test BB";
			data[0][1] = "C1-test BB";

			data[1][0] = "R2-test BB";
			data[1][1] = "C2-test BB";
		}
		return data;

	}

	@DataProvider
	public static Object[][] datasuiteC(Method m) {

		Object data[][] = null;
		System.out.println(m.getName());
		if (m.getName().toUpperCase().equals("TESTC")) {
			data = new Object[2][2];
			data[0][0] = "R1-testC";
			data[0][1] = "C1-testC";

			data[1][0] = "R2-testC";
			data[1][1] = "C2-testC";

		} else if (m.getName().toUpperCase().equals("TESTCC")) {
			data = new Object[2][2];
			data[0][0] = "R1-test CC";
			data[0][1] = "C1-test CC";

			data[1][0] = "R2-test CC";
			data[1][1] = "C2-test CC";
		}
		return data;

	}

}
