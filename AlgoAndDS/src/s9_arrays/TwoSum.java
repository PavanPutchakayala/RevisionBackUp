package s9_arrays;

import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {

		System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] { 2, 7, 13, 15 }, 9)));


	}

	// Two Sum
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}

		throw new IllegalArgumentException("No solution found");
	}

}
