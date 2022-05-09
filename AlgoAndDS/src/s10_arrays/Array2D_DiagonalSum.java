package s10_arrays;

//Coding Exercise 19: 2D Arrays - Diagonal Sum

public class Array2D_DiagonalSum {
	public int sumDiagonal(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i][i];
		}
		return sum;
	}

}