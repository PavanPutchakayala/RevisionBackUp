package adelete;

public class Find_A_Number {

	public static void main(String[] args) {

		Find_A_Number mn = new Find_A_Number();
		// mn.intLinearSearch(intArray, 32);
		new Find_A_Number().intLinearSearch(new int[] { 1, 2, 3, 4 }, 2);
		// new Find_A_Number().intLinearSearch(new {1,2,3,4}, 6);
	}

	public void intArrSearch(int[] intArr, int value) {
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] == value) {
				System.out.println("@ : " + i);
				return;
			}
		}
		System.out.println(value + "NOT found");
	}

	public void intLinearSearch(int[] intArray, int value) {
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == value) {
				System.out.println(value + " found @ index: " + i);
				return;
			}
		}
		System.out.println(value + " NOT found");
	}
}
