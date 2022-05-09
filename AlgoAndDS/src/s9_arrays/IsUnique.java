package s9_arrays;

public class IsUnique {
	public static void main(String[] args) {
		IsUnique mn = new IsUnique();
		int[] intArray = { 1, 2, 3, 6, 5, 5 };
		boolean result = mn.isUnique(intArray);
		System.out.println(result);
	}

	// Is Unique
	public boolean isUnique(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] == intArray[j]) {
					return false;
				}
			}
		}
		return true;
	}

}
