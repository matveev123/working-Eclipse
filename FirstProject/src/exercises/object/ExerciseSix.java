package exercises.object;

import java.util.Scanner;

public class ExerciseSix {
	int storage(String s) {
		return s.length() * 2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ExerciseSix exerciseSix = new ExerciseSix();
		System.out.print("Input string, please...");
		String s = scanner.nextLine();// try{}catch(){} ????
		System.out.println(exerciseSix.storage(s) + " butes are required to hold the information in the \""+ s +"\" string");
		// размер char d Java 16 бит т.е. 2 байта!
	}

}
