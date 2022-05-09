package s2_recursion;

public class Recursion_1_Factorial {

	public static void main(String[] args) {

		Recursion_1_Factorial recursion = new Recursion_1_Factorial();
		System.out.println(recursion.factorial(3));
	}

	public int factorial(int n) {
		if(n<0) return -1;
		if(n==0 || n==1) return 1;

		return n * factorial(n - 1);
	}

}
