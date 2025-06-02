package hello1;

public class excepation {
	public static void main(String[] args) {
		try {
			int a= 10;
			int b=20;
			System.out.println(a/b);
			String c= "js";
			}
		catch (Exception e) {
			System.out.println("you / 0 to 10");
		}
		finally {
			System.out.println("exception cleared");
		}
		}
	}


