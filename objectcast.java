package hello1;

public class objectcast {
	public void batch() {
		System.out.println("good batch");
	}
	public void classes(String a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		objectcast OB = new objectcast();
		OB.batch();
		OB.classes("new classes");
	}

}
