package exercises.reusing;

import static util.Print.*;

public class Ex20 {
	final void m() {
		System.err.println("i am from Ex20");
	}

	public static void main(String[] args) {
		Sub sub = new Sub();
		Ex20 o = sub;
		o.m();
	}

}

class Sub extends Ex20 {
//	final void m() {// error
//		System.out.println("i am from Sub");
//	}
}
