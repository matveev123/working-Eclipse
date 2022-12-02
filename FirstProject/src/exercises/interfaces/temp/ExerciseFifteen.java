package exercises.interfaces.temp;

import static util.Print.*;

public class ExerciseFifteen {
	public static void q(Q q) {
		q.k();
	}

	public static void w(F f) {
		f.f();
	}

	public static void z(New o) {
		o.d();
	}

	public static void r(U u) {
		u.e();
	}

	public static void main(String[] args) {
		HugeClass h = new HugeClass();
		q(h);
		w(h);
		z(h);
		r(h);

	}

}

interface Q {
	void k();

	void l();
}

interface U {
	void e();

	void x();
}

interface F {
	void f();

	void d();
}

interface New extends Q, U, F {
	void method();
}

abstract class Old {
	abstract void doc();
}

class HugeClass extends Old implements New {

	@Override
	public void k() {
	}

	@Override
	public void l() {
	}

	@Override
	public void e() {
	}

	@Override
	public void x() {
	}

	@Override
	public void f() {
	}

	@Override
	public void d() {
	}

	@Override
	public void method() {
	}

	@Override
	void doc() {
	}
}
