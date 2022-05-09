package s10_arrays;

import java.util.Arrays;
import java.util.Collections;

public class BestScore_INCOMPLETE {
	
	public static void main(String[] args) {
		//System.out.println(Arrays.deepToString(new BestScore().firstSecond(new Integer[] {84, 99, 32,12,76,89, 97})));
		/*
		 * BestScore bs = new BestScore(); Integer[] myArray = {89, 98, 54, 99};
		 * Integer[] result = bs.firstSecond(myArray);
		 */
	}
	
	public static String firstSecond(Integer[] myArray) {
		Integer[] arr = myArray;
		Arrays.sort(arr, Collections.reverseOrder());
		int first = arr[0];
		Integer second = null;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != first) {
				second = arr[i];
				break;
			}
		}
		return first + " " + second;

	}
}