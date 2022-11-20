
package exercises.reusing;

import static util.Print.*;

public class Ex18 {
	private String name;

	public Ex18(String name) {
		this.name = name;
	}

	private static final int INT_1 = 1;
	private final int valInt = 100;

	@Override
	public String toString() {
		return " INT_1 : " + INT_1 + " " + "valint: " + valInt;
	}

	public static void main(String[] args) {
		Ex18 ex18A = new Ex18("ex18A");
		System.out.println(ex18A);
		Ex18 ex18B = new Ex18("ex18B");
		System.out.println(ex18B);

	}

}
