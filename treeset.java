package hello1;

import java.util.Set;
import java.util.TreeSet;

public class treeset {
	public static void main(String[] args) {
		Set<String> ref =new TreeSet<String>();
		ref.add("camel");
		ref.add("giraffe");
		ref.add("dog");
		ref.add("apple");
		ref.add("ball");
		ref.add("elephant");
		ref.add("fan");
		ref.add("fan");                //doesnt allow duplicate values(not printed)
		System.out.println(ref);
		
	}

}
