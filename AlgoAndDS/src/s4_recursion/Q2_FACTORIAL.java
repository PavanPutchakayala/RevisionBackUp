package s4_recursion;

public class Q2_FACTORIAL {

	public static void main(String[] args) {
		System.out.println(new Q2_FACTORIAL().factorial(5));

	}

	public int factorial(int num) {
		if (num <= 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}

}
