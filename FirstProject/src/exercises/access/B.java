package exercises.access;

public class B {

	public static void main(String[] args) {
		Ex5 ex5 = new Ex5();
		System.out.println(ex5.defaultPackage);
		System.out.println(ex5.protectd);
		// System.out.println(ex5.prvate);//private access!
		System.out.println(ex5.publc);
		ex5.f();
		ex5.f0();
		ex5.f1();
		//ex5.f2();//private access!

		System.out.println("OK!");
	}

}
