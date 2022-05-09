package keywords;

import org.openqa.selenium.support.ui.Select;

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
		// reportFailure("Element not Found " + locator, true);

	}

	public void validateLogin() {

	}

	public void validateSelectedValueInDropDown(String locatorKey, String option) {
		Select s = new Select(getElement(locatorKey));
		String text = s.getFirstSelectedOption().getText();
		if (!text.equals(option)) {
			reportFailure("Option" + option + " not present in Drop Down " + locatorKey, true);
		}

	}

	public void validateSelectedValueNotInDropDown(String locatorKey, String option) {
		Select s = new Select(getElement(locatorKey));
		String text = s.getFirstSelectedOption().getText();
		if (text.equals(option)) {
			reportFailure("Option" + option + " present in Drop Down " + locatorKey, true);
		}

	}
}
