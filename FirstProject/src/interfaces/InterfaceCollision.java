package interfaces;

import static util.Print.*;

public class InterfaceCollision {
//	void f(int o) {
//	}
//
//	int f(int i) {
//		return 1;
//	}
//
//	int f() {
//	}

	public static void main(String[] args) {

	}

}

interface I1 {
	void f();
}

interface I2 {
	int f(int i);
}

interface I3 {
	int f();
}
// отличаются только по return type 

class C {
	public int f() {
		return 1;
	}
}

class C2 implements I1, I2 {
	public void f() {
	}

	public int f(int i) {// overload 
		return 1;
	}

}

class C3 extends C implements I2 {
	public int f(int i) {// overload вместе с public int f(){}
		return 1;
	}

}

class C4 implements I3 {
	public int f() {// OK!
		return 1;
	}

}

//class C5 extends C implemets I1{}
//interface I4 extends I1,I3{}