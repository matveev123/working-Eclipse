package polymorphism;

import static util.Print.*;

public class RTTI {

	public static void main(String[] args) {
		Usefull[] x = { new Usefull(), new MoreUsefull() };// upcasting!!!!
		x[0].f();
		x[1].g();
		// compile time !method not found in class Usefull
		// ! x[1].u();
		((MoreUsefull) x[1]).u();//OK!
		//((MoreUsefull) x[0]).u();// ClassCastException!!!

		// or
		
		//Usefull x = new MoreUsefull();//upcasting
		//((MoreUsefull)x).w();//OK!

		// Usefull x = new Usefull();
		// ((MoreUsefull) x).u();//ClassCastException!!!

	}

}

class Usefull {
	public void f() {
	}

	public void g() {
	}
}

class MoreUsefull extends Usefull {
	public void f() {
	}

	public void g() {
	}

	public void u() {// !
	}

	public void v() {// !
	}

	public void w() {// !
	}
}
