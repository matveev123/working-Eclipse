package innerclasses;

import static util.Print.*;

abstract class Base {
	public Base(int i) {
		print("base consteuctor i = " + i);
	}

	public abstract void f();
}

public class AnonymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {
			{
				print("initializer instance");
			}

			public void f() {
				print("в абасрактном f()");
			}
		};
	}

	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();

	}

}
