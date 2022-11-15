//exercise 1-7:
package exercises.initialization;

import static util.Print.*;

public class ExerciseThree {

	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test(new String("line"));
		char c = ';';
		byte b = 127;
		short s = 32767;
		int i = -2_1_4_7_4_8_3_6_4_8;
		long l = 817491857182759l;
		float f = 1231414.1414111f;
		double d = 44.011909011955182801149014912941259810515115015010511119049104901d;
		Dog dog = new Dog();
		dog.bark();
		dog.bark(c);
		dog.bark(b);
		dog.bark(s);
		dog.bark(i);
		dog.bark(l);
		dog.bark(f);
		dog.bark(d);
		dog.bark(c, i);
		dog.bark(i, c);
		NoConstructor noConstructor = new NoConstructor();
		noConstructor.bark();

	}

}

class Test {
	Test() {
		print("i am default constructor!");
	}

	Test(String str) {

		print("'" + str + "'" + " is my argument! And i am overloading constructor!");
	}
}

class Dog {
	// char byte short int long float double
	void bark() {
		print(" is breathing");
	}

	void bark(char c) {
		print(" is howls");
	}

	void bark(byte b) {
		print(" bites");
	}

	void bark(short s) {
		print("sneezes");
	}

	void bark(int i) {// chew
		print(" is champing");
	}

	void bark(long l) {
		print(" is scrtching");
	}

	void bark(float f) {
		print(" plays");
	}

	void bark(double d) {
		print("is licking");
	}

	void bark(char c, int i) {
		print("eats");
	}

	void bark(int i, char c) {
		print("is running");
	}

}

class NoConstructor {
	void bark() {
		print("argh!");
	}

}
