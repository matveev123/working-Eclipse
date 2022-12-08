package experiment;

import static util.Print.*;

public class A {
	private long a; // not initialized value

	public A() {
		this.a = 1; // initialization
	}

	public long a() {
		return this.a;
	}

	public static class ABC {
		int i;

		@Override
		public String toString() {
			return "zxc";
		}
	}

	public static void main(String[] args) {
//		L xL = new SonL(); infinite loop
//		xL.f();

//		A.ABC x = new A.ABC();

//		System.out.println(new A.ABC());

	}
}

class L {
	private L l = new L();

	public L() {
		print("L()");
	}

	public void f() {
		print("from L");
	}

	public void insert(L ll) {
		l = ll;
	}

	public void g(L l) {
		l.f();
	}

}

class SonL extends L {
	SonL() {
		insert(new L());
		print("SonL");
	}

	public void f() {
		print("from SonL");
	}
}
