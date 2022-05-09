package keywords;

public class ValidationKeyWords extends GenericKeyWords {

	public void validateTitle() {
		System.out.println("ValidationKeyWords validateTitle");
	}

	public void validateText() {
		System.out.println("ValidationKeyWords validateText");
	}

	public void validateElementPresent(String locator) {
		System.out.println("ValidationKeyWords validateElementPresent");

		boolean result = isElementPresent(locator);
	}

	public void validateLogin() {

	}
}
