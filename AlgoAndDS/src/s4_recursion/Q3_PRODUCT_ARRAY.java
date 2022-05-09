package s4_recursion;

public class Q3_PRODUCT_ARRAY {

	public static void main(String[] args) {
		System.out.println(new Q3_PRODUCT_ARRAY().productofArray(new int[] { 2, 3 }, 2));
	}

	public int productofArray(int A[], int N) {
		if (N <= 0)
			return 1;
		return (productofArray(A, N - 1) * A[N - 1]);
	}

}
