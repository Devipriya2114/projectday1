package hello1;

public class Variables {
	byte a = 120;
    static	int b = 10;
	 
    public void day() {
		 String c = "class variables";
		 System.out.println(c);	  
	 }
 public static void main(String[] args) {
	Variables V = new Variables();
	V.day();                   // class variables
	System.out.println(V.a);   // local variables
	System.out.println(b);     // static variables
}
}
