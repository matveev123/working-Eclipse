package interfaces;

import static util.Print.*;

public class NestingInterfaces {
	public class BImp implements A.B {

		@Override
		public void f() {
		}

	}

	class CImp implements A.C {

		@Override
		public void f() {
		}
	}

// нельзя реализовавать private interface кроме как внутри класса, где он был определён
//	private class DImp implements A.D {
//
//		@Override
//		public void f() {
//		}
//	}

	class EImp implements E {

		@Override
		public void g() {
		}

	}

	class EGImp2 implements E.G {

		@Override
		public void f() {
		}

	}

	class EImp2 implements E {

		@Override
		public void g() {
		}

	}

	class EG implements E.G {

		@Override
		public void f() {
		}

	}

	public static void main(String[] args) {
		A a = new A();
		// все ограничения связаны с объявлением элементов !!PRIVATE!!!:
		// не возвращает ничего кроме A.D
		//A.DImp2 di2 = a.getD(); 
		A a2 = new A();
		// нельзя получить доступ к члену интерфейса,т.к. метод возрашает объект private класса + из другого класса!
		//a.getD().f();
		a2.receiveD(a.getD());
		

	}

}

class A {// 1 interface : 2 class imp 2interface : 2 class imp 3 interface : 2 class imp
			// + variable and 2 methods
	interface B {
		void f();
	}

	public class BImp implements B {
		public void f() {
		}
	}

	public class BImp2 implements B {
		public void f() {
		}
	}

	public interface C {

		void f();
	}

	public class CImp implements C {
		public void f() {
		}
	}

	public class CImp2 implements C {
		public void f() {
		}
	}

	private interface D {
		void f();
	}

	// implement a private interface within that interface's ONLY defining class:
	private class DImp implements D {
		public void f() {
		}
	}

	public class DImp2 implements D {
		public void f() {
		}
	}

	public D getD() {
		return new DImp2();// .f();
	}

	private D dref;

	public void receiveD(D d) {
		dref = d;
		dref.f();
	}
}

interface E {
	interface G {
		void f();
	}

	// redundant "public"
	public interface H {
		void f();
	}

	void g();

	// cannot!! private interface I {}
}
