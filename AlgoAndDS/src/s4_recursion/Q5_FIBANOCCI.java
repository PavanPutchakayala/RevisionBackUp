package s4_recursion;

public class Q5_FIBANOCCI {

	public static void main(String[] args) {
		System.out.println(new Q5_FIBANOCCI().fib(8));
	}

	public int fib(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

}
