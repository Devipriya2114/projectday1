package hello1;


public class Constructor2 {
	public Constructor2() {
		System.out.println("constructor class");
	}
  public Constructor2(String a)
  {
	  System.out.println("parameterized constructot"+a);
	  
	  }
  	  public static void main(String[] args) {
  		Constructor2 c = new Constructor2();
		Constructor2 c2 = new Constructor2("c");
		
	}
  }

