package hello1;


public class cast {
	public static void main(String[] args) {
		byte a =100;                   // widening casting
		short b=a;
		int c =b;	
		long l =c;
		System.out.println(l);
	
		long j = 20;
	int h =(int) j;               // narrowing casting
	System.out.println(h);
	
			}

}
