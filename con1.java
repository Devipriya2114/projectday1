package hello1;

import java.lang.reflect.Constructor;

public class con1 {
	public con1() {
		System.out.println("constructor clss");
	}
	public con1(String b)
	{
		System.out.println("parameterized constructor+a");
	}
	
	public static void main(String[] args) {
		con1 K = new con1();
		con1 K2 = new con1("A");
			}
	
}
	