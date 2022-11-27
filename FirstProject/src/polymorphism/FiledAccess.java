package polymorphism;

import static util.Print.*;

public class FiledAccess {

	public static void main(String[] args) {
		Super spr1 = new Sub();
		spr1.getStatic();
		spr1.dynamicStatic();
		spr1.special();
		// print("1) field : " + spr1.field + "spr1.getField(): " + spr1.getField());
		Sub sub = new Sub();
		// print("2) field : " + sub.field + "spr1.getField(): " + sub.getField());
		// 0 1
		// 1 1 0
	}

}

class Super {
	public int field = 0;

	public static void getStatic() {// 1
		print("super static");
	}

	public static void dynamicStatic() {// 2
		print("super dynamic static");
	}

	public void special() {
		print("superSpecial");
	}

	int getField() {
		return field;
	}
}

class Sub extends Super {
	public void special() {
		print("subSpecial");
	}

	public int field = 1;

	public static void getStatic() {
		print("sub static");
	}

	public static void dynamicStatic() {
		print("sub dynamic static");
	}

	int getField() {
		return field;
	}

	int getSuperField() {
		return super.field;
	}
}
