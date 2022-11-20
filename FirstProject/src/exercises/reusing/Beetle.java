//Exercise 24
package exercises.reusing;

import static util.Print.*;

public class Beetle extends Insect {//2
	private int k = printInit("Поле класса Beetle.k проинициализировано!");
	
	public Beetle() {
		//super();
		print("k = " + k + "\nj = " + j);
	}

	private static int x2 = printInit("Поле класса Beetle.x2 проинициализировано!");

	public static void main(String[] args) {
		print("Construcor Beetle");
		Beetle beetle = new Beetle();

	}

}

class Insect {//1
	private int i = 9;
	protected int j;

	public Insect() {
		print("i = " + i + " j = " + j);
		j = 33;
	}

	private static int x1 = printInit("Поле класса Insect.x1 проинициализировано!");

	static int printInit(String s) {
		print(s);
		return 47;
	}

}
class Type extends Beetle{}
