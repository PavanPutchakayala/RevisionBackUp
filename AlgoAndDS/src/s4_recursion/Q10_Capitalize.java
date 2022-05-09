package s4_recursion;

public class Q10_Capitalize {

	public static void main(String[] args) {
		System.out.println(new Q10_Capitalize().capitalizeWord("hello"));
	}

	public static String capitalizeWord(String str) {

		if (str.isEmpty()) {
			return str;
		}
		char chr = str.charAt(str.length() - 1);
		if (str.length() == 1) {
			return Character.toString(Character.toUpperCase(chr));
		}
		if ((str.substring(str.length() - 2, str.length() - 1).equals(" "))) {
			chr = Character.toUpperCase(chr);
		}
		return capitalizeWord(str.substring(0, str.length() - 1)) + Character.toString(chr);
	}

}
