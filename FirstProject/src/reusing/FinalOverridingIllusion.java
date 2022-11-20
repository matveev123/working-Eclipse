//example + ExersiseTwenty
package reusing;

import static util.Print.*;

public class FinalOverridingIllusion {

	public static void main(String[] args) {
		OverridigFinals2 of2 = new OverridigFinals2();
		of2.f();
		of2.g();
		OverridigFinals o = of2;// upcasting!
		// o.f();
		// o.g();
		WithFinals wf = of2;// upcasting!
//		wf.f();
//		wf.g();
	}

}

class WithFinals {
	private final void f() {
		print("Withfinals.f()");
	}

	private void g() {
		print("Withfinals.g()");
	}
}

class OverridigFinals extends WithFinals {
	private final void f() {
		print("OverridigFinals.f()");
	}

	private void g() {
		print("OverridigFinals.g()");
	}
}

class OverridigFinals2 extends OverridigFinals {
	//@Override
	public final void f() {
		print("OverridigFinals2.f()");
	}

	//@Override
	public void g() {
		print("OverridigFinals2.g()");
	}
}
