package s4_recursion;

public class Q7_IsPalindrome {

	public static void main(String[] args) {
		System.out.println(new Q7_IsPalindrome().isPalindrome("LIRIL"));
	}

	public boolean isPalindrome(String s) { // if length is 0 or 1 then String is palindrome
		if (s.length() == 0 || s.length() == 1)
			return true;
		if (s.charAt(0) == s.charAt(s.length() - 1))
			return isPalindrome(s.substring(1, s.length() - 1));
		return false;
	}

}
