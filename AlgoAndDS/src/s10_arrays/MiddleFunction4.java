package s10_arrays;

import java.util.Arrays;

//Coding Exercise 18: Middle Function

public class MiddleFunction4 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new MiddleFunction4().middle(new int[] { 1, 2, 3, 4 })));

	}

	public static int[] middle(int[] arr) {
		return Arrays.copyOfRange(arr, 1, arr.length - 1);
	}
}
