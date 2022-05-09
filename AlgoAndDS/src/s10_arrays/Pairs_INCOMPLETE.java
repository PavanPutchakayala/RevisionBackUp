package s10_arrays;

import java.util.Arrays;

public class Pairs_INCOMPLETE {

	public static void main(String[] args) {

		//System.out.println(Arrays.deepToString(new Pairs().pairSum(new int[] { 2, 4, 5, 6, 7, -9, 1, -1, 8 }, 7)));
	}

	public static String pairSum(int[] myArray, int sum) {
		String result = "";
		for (int i = 0; i < myArray.length; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i] + myArray[j] == sum) {
					result += myArray[i] + ":" + myArray[j] + " ";
				}
			}
		}
		return result;
	}

}