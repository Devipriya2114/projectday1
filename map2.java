package hello1;

import java.util.HashMap;
import java.util.Map;

public class map2 {
	public static void main(String[] args) {
		   
	     Map<String, Integer> number = new HashMap<String, Integer>();
	     number.put("age",27);
	     number.put("id", 123456);
	     System.out.println(number);
	     System.out.println(number.containsKey("age"));     //containskey
	     System.out.println(number.containsValue(27));      //containvalues
	     System.out.println(number.keySet());               //keyset
	     System.out.println(number.values());               //values
	}

}
