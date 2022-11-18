package exercises.access;

public class Ex6 {
	/*
	 * private long number = 100l;
	 * 
	 * public static void main(String[] args) { System.err.println(new
	 * UserEx6().n);// omg! }
	 * 
	 * long get() { return number; }
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(new SubEx6().n);
	}

	protected int number = 400;

}

class SubEx6 extends Ex6 {
	String str = "line";
	int n = number;
}

/*
 * class UserEx6 { long n = new Ex6().get(); }
 */
