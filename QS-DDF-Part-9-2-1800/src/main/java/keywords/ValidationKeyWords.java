package keywords;

public class ValidationKeyWords extends GenericKeyWords {

	public void validateTitle() {
		log("ValidationKeyWords validateTitle");
	}

	public void validateText() {
		log("ValidationKeyWords validateText");
	}

	public void validateElementPresent(String locator) {
		// log("ValidationKeyWords validateElementPresent");
		boolean result = isElementPresent(locator);
		reportFailure("Element not Found " + locator);

	}

	public void validateLogin() {

	}
}
