package s9_arrays;

public class MaxProduct {
	public static void main(String[] args) {
		MaxProduct mn = new MaxProduct();
		int[] intArray = { 10, 60, 30, 40, 90 };
		String pairs = mn.maxProduct(intArray);
		System.out.println(pairs);

	}

	// Max Product
	public String maxProduct(int[] intArray) {
		int maxProduct = 0;
		String pairs = "";
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] * intArray[j] > maxProduct) {
					maxProduct = intArray[i] * intArray[j];
					pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
				}
			}
		}
		return pairs;
	}

}
