package hello1;

import java.util.Scanner;

public class scan {
   public static void main(String[] args) {
	Scanner S = new Scanner(System.in);         // scanner
	System.out.println("enter values");
	 int a = S.nextInt();
	 System.out.println(a);
	String b = S.next();
	System.out.println(b+a);
	float c = S.nextFloat();
	System.out.println(c*10);
			}
  
}
