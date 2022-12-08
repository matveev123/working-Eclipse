package innerclasses;

import static util.Print.*;

public class LocalInnerClass {
	private int count = 0;

	public Counter getCounter(final String name) {
		// locele innner class:
		class LocalCounter implements Counter {// cannot have acces modifier!
			// locale inner class ca have a constructor!
			public LocalCounter() {
				print("LoclaCounter()");
			}

			public int next() {
				printb(name);// aceess local final
				return count++;

			}
		}
		return new LocalCounter();// !!!
	}

	Counter getCounter2(final String name) {// !
		return new Counter() {
			{
				// Anonymous inner class cannot have a named constructor;
				// only an instance initializer!
			}

			public int next() {
				printb(name);
				return count++;

			}
		};
	}

	public static void main(String[] args) {

		LocalInnerClass lic = new LocalInnerClass();
		Counter c1 = lic.getCounter("locale"), c2 = lic.getCounter2("abonymous");
		for (int i = 0; i < 5; i++)
			print(c1.next());
		;
		for (int i = 0; i < 5; i++)
			print(c2.next());
		;

	}

}

interface Counter {
	int next();
}