package exercises.object;

public class ExerciseSeven {

	public static void main(String[] args) {
		StaticTest staticTest = new StaticTest();
		// System.out.println(staticTest.i);
		// System.out.println(StaticTest.i);
		System.out.println("value i before using staic method increment is " + StaticTest.i);
		// StaticTest.i = Incrementable.increment(StaticTest.i);
		Incrementable.increment();
		// Incrementable.increment(StaticTest.i);
		System.out.println("value i after using staic method increment is " + StaticTest.i);
	}

}

class StaticTest {
	static int i;
}

class Incrementable {
	static void increment() {// (StaticTest st) or () and return void!!!
		// i++;
		// System.out.println("\n[value i = " + i + "]\n");
		StaticTest.i++;
		// return i;
	}
}
