package experiment.a;

import static util.Print.*;

// using inner classes for callbacks
public class Callbacks {

	public static void main(String[] args) {
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		MyIncrement.f(c2);
		Caller caller1 = new Caller(c1);// the capturing of the callback reference (Caller takes reference in
										// constructor)
		Caller caller2 = new Caller(c2);// the capturing of the callback reference (Caller takes
																// reference in constructor)
		caller1.go();// uses the reference to "call back" into the Callee class.
		caller1.go();// !
		caller2.go();// !
		caller2.go();// !


	}

}

interface Incrementable {
	void increment();
}

class Callee1 implements Incrementable {
	private int i = 0;

	@Override
	public void increment() {
		i++;
		print(i + " from c1");
		
	}
}

class MyIncrement {
	public void increment() {
		System.out.println("совершенно другая операция!");// completely different action
	}

	public static void f(MyIncrement m) {
		m.increment();
	}
}

// if your class must implement increment() in some another way,you must use inner class:
class Callee2 extends MyIncrement implements Incrementable {
	private int i = 0;

	// override
	public void increment() {
		super.increment();
		i++;
		print(i + " from c2");
	}

}

class Caller {
	Incrementable callbackRegerence;

	Caller(Incrementable cbh) {
		callbackRegerence = cbh;
	}

	void go() {
		callbackRegerence.increment();
	}
}