package keywords;

public class GenericKeyWords {

	public void openBrowser(String bName) {
		System.out.println("GenericKeyWords openBrowser Launched" + bName);
	}

	public void navigate(String url) {
		System.out.println("GenericKeyWords navigated to " + url);
	}

	public void click(String locator) {
		System.out.println("GenericKeyWords clicked @/on " + locator);
	}

	public void select(String locator, String data) {
		System.out.println("GenericKeyWords select " + locator + data);
	}

	public void type(String locator, String data) {
		System.out.println("GenericKeyWords type " + locator + data);
	}

	public void getText() {

	}
}
