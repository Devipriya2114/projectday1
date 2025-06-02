package hello1;

public class returnkeyword {
	
	public String days() {
     String a ="a";              //return keyword
     return a;
	}
	public int month() {
		int b = 10;
		return b;
	}
	public byte year() {
		byte c = 120;
		return c;
	}
	public static void main(String[] args) {
		returnkeyword R =new returnkeyword();
		System.out.println(R.days());                      // return not accepted syntax only add sysout 
		System.out.println(R.month());
		System.out.println(R.year());
	}
}
