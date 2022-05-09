package runner.custom;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class REVISION_CustomTestNGRunner {

	TestNG testNg;
	XmlSuite suite;
	List<XmlSuite> allSuites;
	XmlTest test;
	List<XmlTest> testCases;
	Map<String, String> testParameters;
	List<XmlClass> allClasses;
	
	
	public void REVISION_CustomTestNGRunner(int suiteThreadPoolSize) {
		testNg = new TestNG();
		allSuites = new ArrayList<XmlSuite>();
		testNg.setXmlSuites(allSuites);
	}
	public void createSuite(String suiteName) {
		
	}
	
	public void addTest(String testName) {
		
	}
	
	public void addTestParameter(String name, String value) {
		
	}
	
	public void addTestClass(String className, List<String> includedMethodNames) {
		
	}
	
	public void run() {
		
	}
	
	public void addListener(String listenerFile) {
		
	}
}			