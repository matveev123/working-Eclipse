package exercises.innerclasses;

import static util.Print.*;

public class EcerciseTwentythree {

	public static void main(String[] args) {
		U.A a1 = new U.A();
		U.A a2 = new U.A();
		U.A a3 = new U.A();
		U.A a4 = new U.A();
		U.B b = new U.B(4);
		b.add(a1.makeU());
		b.add(a2.makeU());
		b.add(a3.makeU());
		b.add(a4.makeU());
		b.call();
		println();
		b.del(2);
		b.call();
		
//		b.showUs();
//		println();
//		b.del(2);
//		b.showUs();
//		b.call2();
//		b.del(2);
//		println();
//		println();
//		b.call2();

	}

}

interface U {
	class A {
		U makeU() {
			return new U() {

				@Override
				public void a() {
					printb("|a()");
				}

				@Override
				public void b() {
					printb("b()");
				}

				@Override
				public void c() {
					printb("c()|");
				}
				@Override
				public String toString() {// for showUs()
					return "I'm U!";
				}
			};
		}
	}

	class B {
		private U[] arrU;
		private int counter = 0;

		public B(int size) {
			arrU = new U[size];
		}

		void add(U u) {// void add(U u , int i)
			arrU[counter++] = u;

		}

		void del(int i) {// erase

			arrU[i] = null;
		}

		void call() {
			int i = -1;
			System.out.print("| *** ");
			while (++i < arrU.length - 1) {
				if (arrU[i] == null)
					printb("|  null   |  ***");
				else {
					arrU[i].a();
					arrU[i].b();
					arrU[i].c();
					System.out.print(" *** ");
				}
			}
			System.out.println(" |");
		}

		void call2() {// other version
			System.out.print(" * ");
			
			for (U u : arrU) {
				if(u == null)
					printb("null");
				else {
				u.a();
				u.b();
				u.c();
				System.out.print(" * ");
				}
			}
			
		}

		void showUs() {// other version
			for (U u : arrU)
				if (u != null)
					System.out.println(u);
				else
					System.out.println("null");
		}
	}

	void a();

	void b();

	void c();
}
