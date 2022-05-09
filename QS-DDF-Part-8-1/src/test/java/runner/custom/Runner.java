package runner.custom;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		CustomTestNGRunner runner = new CustomTestNGRunner(1);
		runner.createSuite("Booking Suite", false);
		runner.addTest("Create Booking Test - Apply Discount - Pay@Hotel");
		runner.addTestParameter("action", "Pay@Hotel");
		
		List<String> includeMethodNames = new ArrayList<String>();
		
		includeMethodNames.add("searchHotel");
		includeMethodNames.add("selectHotel");
		includeMethodNames.add("enterGuestInfo");
		runner.addTestClass("testcases.BookingSearch", includeMethodNames);
		
		includeMethodNames = new ArrayList<String>();
		includeMethodNames.add("applyDiscount");
		includeMethodNames.add("makePayment");
		runner.addTestClass("testcases.PaymentManager", includeMethodNames);
		
		
		includeMethodNames = new ArrayList<String>();
		runner.addTestClass("testcases.CustomerCommunications", includeMethodNames);
		
		runner.run();
		
		System.out.println("Video 8-1");

	}

}
