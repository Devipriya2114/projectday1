package hello1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class setcollections {

	public static void main(String[] args) {
		List fruits = new ArrayList();

		List<String> fruit = new ArrayList<String>();

		fruit.add("apple");                             // ad
		fruit.add("orange");
	//	fruit.set(1, "strawberry");                         // set
	// fruit.remove(1);                     // remove
		System.out.println(fruit);
		System.out.println(fruit.size());               //size
		System.out.println(fruit.indexOf("orange"));    // indexof

		System.out.println(fruit.contains("orange"));    // contains

	}
}
