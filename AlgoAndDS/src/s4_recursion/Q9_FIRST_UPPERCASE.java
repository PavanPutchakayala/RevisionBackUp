package s4_recursion;

public class Q9_FIRST_UPPERCASE {

	public static void main(String[] args) {
		System.out.println(new Q9_FIRST_UPPERCASE().first("wELCOME"));
	}

	public static char first(String str) {
		if (str.isEmpty()) {
			return ' ';
		}
		if (Character.isUpperCase(str.charAt(0))) {
			return str.charAt(0);
		} else {
			return first(str.substring(1, str.length()));
		}
	}

}
