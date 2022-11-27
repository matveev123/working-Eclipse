package polymorphism;

import static util.Print.*;

public class Temp {

	public static void main(String[] args) {
		A a = new B();
		print(a.n);//0
	
		B b = new B();//1
		print(b.n);
	}

}

class A {
	int n = 0;
}

class B extends A {
	int n = 1;
}