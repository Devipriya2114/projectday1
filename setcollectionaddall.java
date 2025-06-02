package hello1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class setcollectionaddall {
	public static void main(String[] args) {
		List l1 =new ArrayList<>();
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("numbers");

	
		System.out.println(l1);
		
		List l2 =new LinkedList<>();
		l2.add("a");
		l2.add("1");
		l2.add("2");
		l2.add("b");
		l2.add("c");
		l2.add("characters");
		System.out.println(l2);
		
		l1.addAll(l2);
		System.out.println(l1);   //addall(list methods)
		
		l1.retainAll(l2);
		System.out.println(l1);         //retainall
		
	//	l2.removeAll(l1);
	//	System.out.println(l2);           //removeall
	}
	

}
