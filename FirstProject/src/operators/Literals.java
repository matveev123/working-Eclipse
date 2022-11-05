package operators;

import static util.Print.*;

public class Literals {

	public static void main(String[] args) {
		/*
		 * 0
		 * 0b 0B
		 * D d
		 * L l
		 * 0xFFFF
		 * 0xffff
		 * 08A
		 * */
		int smile = 0x1F600; // Здесь шестнадцатеричный код эмоджи
		StringBuilder sb = new StringBuilder();
		sb.append(Character.toChars(smile)); // Собираем в StringBuilder
		System.out.println("Улыбающееся лицо: " + sb.toString());
	}

}
