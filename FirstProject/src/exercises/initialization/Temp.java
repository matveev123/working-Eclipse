package exercises.initialization;

import static util.Print.*;

import java.util.Arrays;
import java.util.Random;

public class Temp {
	void m() {
		int i;
		// i++;
		// System.out.println("Non-static method m");

	}

	static void ms(Temp temp) {
		temp.m();
	}

	public static void main(String[] args) {
//		ms(new Temp());
//		Animal animal = new Animal();
//		System.out.println(animal.c);
		// Animal animal = new Animal ();
//		Animal animal = null;
//		animal.i = 0;
//		Animal.i = 4;
//		Random rand = new Random(47);
		// Integer[] arr = Integer.valueOf(rand.nextInt(500));
		// Integer[] arr = Integer.toString(rand.nextInt(500));
//		Integer[] arr = { Integer.valueOf(rand.nextInt(500)), Integer.valueOf(rand.nextInt(500)),
//				Integer.valueOf(rand.nextInt(500)), Integer.valueOf(rand.nextInt(500)),
//				Integer.valueOf(rand.nextInt(500)), Integer.valueOf(rand.nextInt(500)) };
//		print(Arrays.toString(arr));
//		Object[] objects = new Integer[] { 1, 2, 3 ,};
//		print(Arrays.toString(objects));
//		Integer[] arr1 = new Integer[] { 5, 6, };// !
//		arr1[0].hashCode();
//		Integer arr2[] = new Integer[20];
//		print(Arrays.toString(arr2));
//		for (int i = 0; i < arr2.length; i++)
//			arr2[i] = rand.nextInt(500);
//		print(Arrays.toString(arr2));
//		printArr(int{1,2,3});
		
	}

	/*
	 * static void printArr(int[] arr) { print(Arrays.toString(arr));
	 * 
	 * }
	 */

}

class Cat {
	String nameString = "123";

	Cat() {
		print("cat created");
	}
}

class Animal {
	char c;
	static int i;
	float f;

	void f() {
		print("i am animal!");
	}

	static Cat cat = new Cat();
}
