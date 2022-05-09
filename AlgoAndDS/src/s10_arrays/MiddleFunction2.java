package s10_arrays;

import java.util.Arrays;
import java.util.List;

public class MiddleFunction2 {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4 };

		List arr2 = middle(arr);

		for (Object num : arr2) {

			System.out.println((Integer) (num));
		}

	}

	public static List middle(int[] arr) {
		// return Arrays.copyOfRange(arr, 1, arr.length - 1);

		List list = Arrays.asList(arr);

		list.remove(0);
		list.remove(list.size() - 1);

		return list;
	}
}
