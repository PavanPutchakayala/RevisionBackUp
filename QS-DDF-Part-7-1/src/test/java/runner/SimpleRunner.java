package runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlSuite.ParallelMode;
import org.testng.xml.XmlTest;

public class SimpleRunner {

	public static void main(String[] args) {

		TestNG testng = new TestNG();

		XmlSuite mysuite = new XmlSuite();
		//mysuite.setParallel(ParallelMode.TESTS);
		
		mysuite.setName("Booking Suite");

		List<XmlSuite> allSuites = new ArrayList<XmlSuite>();
		allSuites.add(mysuite);

		testng.setXmlSuites(allSuites);

		XmlTest createBookingTest = new XmlTest(mysuite);
		createBookingTest.setName("Create Booking Test - Apply Discount - Pay@Hotel");

		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("action", "Pay@Hotel");

		createBookingTest.setParameters(parameters);

		List<XmlClass> testClasses = new ArrayList<XmlClass>();

		XmlClass testClass = new XmlClass("testcases.BookingSearch");

		List<XmlInclude> methods = new ArrayList<XmlInclude>();
		methods.add(new XmlInclude("searchHotel", 1));
		methods.add(new XmlInclude("selectHotel", 2));
		methods.add(new XmlInclude("enterGuestInfo", 3));
		testClass.setIncludedMethods(methods);
		testClasses.add(testClass);
		
		testClass = new XmlClass("testcases.PaymentManager");
		methods = new ArrayList<XmlInclude>();
		methods.add(new XmlInclude("applyDiscount", 1));
		methods.add(new XmlInclude("makePayment", 2));
		testClass.setIncludedMethods(methods);
		testClasses.add(testClass);
		
		testClass = new XmlClass("testcases.CustomerCommunications");
		testClasses.add(testClass);
		
		createBookingTest.setXmlClasses(testClasses);
		
		// 2nd Test
		
		XmlTest cBND = new XmlTest(mysuite);
		createBookingTest.setName("Create Booking Test - NO Discount - Pay@Hotel");

		Map<String, String> parameterscBND = new HashMap<String, String>();
		parameterscBND.put("action", "Pay@Hotel");

		cBND.setParameters(parameterscBND);

		List<XmlClass> testClasses_cBND = new ArrayList<XmlClass>();

		XmlClass testClass_cBND = new XmlClass("testcases.BookingSearch");

		List<XmlInclude> methods_cBND = new ArrayList<XmlInclude>();
		methods_cBND.add(new XmlInclude("searchHotel", 1));
		methods_cBND.add(new XmlInclude("selectHotel", 2));
		methods_cBND.add(new XmlInclude("enterGuestInfo", 3));
		testClass_cBND.setIncludedMethods(methods_cBND);
		testClasses.add(testClass_cBND);
		
		testClass_cBND = new XmlClass("testcases.PaymentManager");
		methods_cBND = new ArrayList<XmlInclude>();
		methods_cBND.add(new XmlInclude("makePayment", 1));
		testClass_cBND.setIncludedMethods(methods_cBND);
		testClasses.add(testClass_cBND);
		
		testClass_cBND = new XmlClass("testcases.CustomerCommunications");
		testClasses.add(testClass_cBND);
		
		cBND.setXmlClasses(testClasses_cBND);
		testng.run();

		
		
		
		
	}

}
