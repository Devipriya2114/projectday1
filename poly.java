package hello1;

public class poly {
	
	public void hello(int a) {
		System.out.println(a);
	}
	public void hello(short b) {
		System.out.println(b);
	}
    public void hello() {
    	System.out.println("hello");

    	}
    public static void main(String[] args) {
		poly apoly= new poly();
	apoly.hello(127);
	apoly.hello(1245);
	apoly.hello();
	;
	}
    
}


