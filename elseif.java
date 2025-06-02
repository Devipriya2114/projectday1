package hello1;


public class elseif {
 public static void main(String[] args) {
	int age =0;
	if(age>=70 && age<=100){
		System.out.println("old age");
	}
 else if(age>=50 && age<70){
	 System.out.println("old age1");
 }
 else if(age>30&& age<50) {
	 System.out.println("middle age");
 }
 else if(age>20 && age<30) {
	 System.out.println("teenage");
 }
 else if(age>5 && age<10) {
	 System.out.println("children");
 }
 else {
	 System.out.println("babies");
 }
 }
}


