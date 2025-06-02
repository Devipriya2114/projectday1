package hello1;

public class This {
	int a = 20;
	int b = 124;
public void day()
{
	int a = 100;
	System.out.println(this.b+a);    // this keyword
	System.out.println(this.a);
	System.out.println(a);
}
public static void main(String[] args) {
	This T = new This();
	T.day();
}

}
