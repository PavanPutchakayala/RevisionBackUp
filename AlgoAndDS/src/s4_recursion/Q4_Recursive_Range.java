package s4_recursion;

public class Q4_Recursive_Range {

	public static void main(String[] args) {
		System.out.println(new Q4_Recursive_Range().recursiveRange(4));

	}

	// RECURSIVE RANGE SOLUTION
	public int recursiveRange(int num) {
		if (num <= 0) {
			return 0;
		}
		return num + recursiveRange(num - 1);
	}

}
