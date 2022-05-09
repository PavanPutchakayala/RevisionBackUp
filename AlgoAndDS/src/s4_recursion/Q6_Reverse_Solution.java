package s4_recursion;

public class Q6_Reverse_Solution {

	public static void main(String[] args) {
		System.out.println(new Q6_Reverse_Solution().reverse("LetsSee"));
	}

	public String reverse(String str) {
		if (str.isEmpty())
			return str;
		// Calling Function Recursively
		return reverse(str.substring(1)) + str.charAt(0);
	}

}
