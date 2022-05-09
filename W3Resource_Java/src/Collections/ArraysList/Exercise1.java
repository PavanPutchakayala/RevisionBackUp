package Collections.ArraysList;

import java.util.*;


//Write a Java program to create a new array list, 
//add some elements (string) and print out the collection.

public class Exercise1 {
	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println(list_Strings);
	}
}
