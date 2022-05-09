package w3school_arrays;

import java.util.Arrays;

public class Arrays_Examples {

	public static void main(String[] args) {

		arr_Ex1_Create_String_Array_2();
		// arr_Ex1_Create_Int_Array();
	}

	public static void arr_Ex1_Create_Int_Array() {

		int[] arr;	//Declaring an Array => O(1)
		arr = new int[3];	//Instaniating an Array => O(1)
		arr[0] = 7;			//Initalizing an Array => O(N)
		arr[1] = 8;
		arr[2] = 9;
		System.out.println(Arrays.toString(arr));

	}

	public static void arr_Ex1_Create_String_Array() {
		String[] arr;
		arr = new String[3];
		arr[0] = "Lakshmi";
		arr[1] = "Narayana";
		arr[2] = "Vasudeva";

		System.out.println(Arrays.toString(arr));

	}

	public static void arr_Ex1_Create_String_Array_2() {

		String arr[] = { "Lakshmi", "Narayanaya", "Vasudevaya" };	//O(1)
		System.out.println(Arrays.toString(arr));
		//System.out.println(arr);
	}
}
