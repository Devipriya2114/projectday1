package hello1;

public class extendobjectcast extends objectcast {
	
  public void month() {
	  System.out.println();
  }

	public static void main(String[] args) {
		objectcast OB = new extendobjectcast();   // upcasting
		OB.classes("old classes");
		OB.batch();
	}
     
}
