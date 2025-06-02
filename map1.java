package hello1;

import java.util.HashMap;
import java.util.Map;

public class map1 {
	public static void main(String[] args) {
		
		Map<String, String> name =new HashMap<String, String>();
	     name.put("name","devipriya");                 //put
	     name.put("location","thanjavur");
	//     System.out.println(name.containsValue("thanjavur"));           //containsvalue
	 //     System.out.println(name.get(name));           //map
	     
	       //string,integer
	     Map<String, Integer> number = new HashMap<String, Integer>();
	     number.put("age",27);
	     number.put("id", 123456);
	  
	     System.out.println(number);
	//     System.out.println(number.size());              //map size
	     
	      // string,float
	     Map<String, Float> per = new HashMap<String, Float>();
	     per.put("percentage1", 95.50f);
	     per.put("percentage2", 80.50f);
	  //   System.out.println(per.containsKey("percentage1"));        //containskey
	}

}
