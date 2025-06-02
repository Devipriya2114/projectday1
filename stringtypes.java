package hello1;

public class stringtypes {
	
	public static void main(String[] args) {
	// String a ="devipriya";                    //string immutable (only used string types)
	//	String b ="devipriya";
	//	String c =a+b;
	
	//	System.out.println(System.identityHashCode(a));
	//	System.out.println(System.identityHashCode(b));
	 //   System.out.println(System.identityHashCode(c));
		
		
		StringBuffer A = new StringBuffer("hello");            //mutable (stringbuffer)
		StringBuffer B = new StringBuffer("hello");
		System.out.println(System.identityHashCode(A));
		System.out.println(System.identityHashCode(B));
		
	}

}
