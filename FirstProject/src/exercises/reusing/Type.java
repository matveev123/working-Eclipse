//Exercise 24
package exercises.reusing;

import static util.Print.*;

class Insect {//1
	private int i = 9;
	protected int j;

	public Insect() {
		print("i = " + i + " j = " + j);//1
		j = 33;
	}

	private static int x1 = printInit("Поле класса Insect.x1 проинициализировано!");

	static int printInit(String s) {
		print(s);
		return 47;
	}

}

class Beetle extends Insect {//2
	private int k = printInit("Поле класса Beetle.k проинициализировано!");
	protected int b;

	public Beetle() {//2
		// super();
		print("k = " + k + "\nj = " + j);//2
		b = 0;
	}

	private static int x2 = printInit("Поле класса Beetle.x2 проинициализировано!");

}

public class Type extends Beetle {//3
	private int t = 1;//
	protected int b;

	Type() {
		print("t = " + t + " b = " + b);//3
	}

	public static void main(String[] args) {
		print("Construcor Type");
		// Beetle beetle = new Beetle();
		Type tObj = new Type();

	}

	static int type = printInit("Поле класса Type.type initialiazed");
}
