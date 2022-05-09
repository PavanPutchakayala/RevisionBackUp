package s10_arrays;

import java.util.Arrays;

//Coding Exercise 18: Middle Function

public class MiddleFunction {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4 };
		arr = middle(arr);
		for (int num : arr) {
			System.out.println(num);
		}

	}

	public static int[] middle(int[] arr) {
		return Arrays.copyOfRange(arr, 1, arr.length - 1);
	}
}


