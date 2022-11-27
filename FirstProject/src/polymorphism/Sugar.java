package polymorphism;

import static util.Print.*;

public class Sugar extends R {
	private static int i = sinit();

	private long l = init();
	R r = new R();
	double d;

	Sugar() {
		print("Sugar()");

	}

	public static void main(String[] args) {
		print("Hello!");
		new Sugar();
		print("BYe!");

	}

	static int init() {
		print("Init()l");
		return 1;
	}

	static int sinit() {
		print("SInit() S");
		return 2;
	}

}

class R {
	private static int i = sinit2();
	K k = new K();

	public R() {
		print("R()");
	}

	static int sinit2() {
		print("SInit() R");
		return 2;
	}
}

class K {
	private static int i = sinit1();//1
	String s = m();//2

	static String m() {
		print("Stirng");
		return "String";
	}

	public K() {
		s = "123";
		print("K()");
	}

	static int sinit1() {
		print("SInit() K");
		return 2;
	}

}
