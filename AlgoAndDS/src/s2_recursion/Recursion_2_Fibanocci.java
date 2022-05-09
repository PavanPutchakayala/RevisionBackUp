package s2_recursion;

public class Recursion_2_Fibanocci {

	public static void main(String[] args) {

		Recursion_2_Fibanocci recursion = new Recursion_2_Fibanocci();
		System.out.println(recursion.fibonacci(6));
	}

	public int fibonacci(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
