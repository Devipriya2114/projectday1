package hello1;

public class stvariabmethod {  
	static String b = "a";
	static int a  = 10;                        // variable level
	 
	public static void vm() {                 // method level
		System.out.println("hello world");
	}
	
	static {                                 // block value
		System.out.println("hi java user");
	}
	public static void main(String[] args) {
		 vm();
		 System.out.println(a);
		 System.out.println(b);
	}
	

}
