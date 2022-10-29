package basic;

import java.util.Scanner;

/*Write a Java program to print 'Hello' on screen and then print your name on a separate line.
Expected Output :
Hello
Alexandra Abramov
*/
public class ExerciseOne {

	public void greeting(String first, String last) {
		System.out.println("Hello\n" + first + " " + last);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// ?
		System.out.print("Print you first name:");
		String s = sc.next();
		System.out.print("Print you last name:");
		new ExerciseOne().greeting(s, sc.next());
		// String str = sc.next();
		// sSystem.out.println(s);

	}
}
