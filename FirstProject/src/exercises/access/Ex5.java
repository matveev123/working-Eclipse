package exercises.access;

import util.Print;

public class Ex5 {
	public Ex5() {
		System.out.println("OK!Let's go!");
	}

	public int publc = 100;
	protected int protectd = 200;
	private int prvate = -300;
	int defaultPackage = 1000;

	void f0() {
		System.out.println("default-package access");
	}

	private void f2() {
		System.out.println("private access");
	}

	protected void f1() {
		System.out.println("protected access");
	}

	public void f() {
		System.out.println("public access");
	}

	public static void main(String[] args) {
		/*
		 * Ex5 ex5 = new Ex5(); System.out.println(ex5.defaultPackage);
		 * System.out.println(ex5.protectd); System.out.println(ex5.prvate);
		 * System.out.println(ex5.publc); ex5.f(); ex5.f0(); ex5.f1(); ex5.f2();
		 * 
		 * System.out.println("OK!");
		 */

	}

}
