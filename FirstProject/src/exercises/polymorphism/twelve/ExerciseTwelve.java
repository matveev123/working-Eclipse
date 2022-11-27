package exercises.polymorphism.twelve;

import static util.Print.*;

import java.util.Random;

public class ExerciseTwelve {
	private static RandomRodentGenerator gen = new RandomRodentGenerator();

	public static void main(String[] args) {
		Rodent[] rodents = new Rodent[4];
		for (int i = 0; i < rodents.length; i++) {
			rodents[i] = gen.next();
			rodents[i].eat();
			rodents[i].run();
			rodents[i].sleep();
		}

	}

}

class Characteristic {
	private String s;

	public Characteristic(String s) {
		this.s = s;
		print("Creating characterisctic " + s);
	}

}

class Description {
	private String s;

	public Description(String s) {
		this.s = s;
		print("Creating Description " + s);
	}

}

class Rodent {//Composing
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	Characteristic t = new Characteristic("has tail");
	Description p = new Description("small mammal");
	private String name = "Rodent";

	Rodent(Shared shared) {
		print("Rodent" + id);
		this.shared = shared;
		this.shared.addRef();
	}

	void eat() {
		print("Rodent.eat()");
	}

	void run() {
		print("Rodent.run()");
	}

	void sleep() {
		print("Rodent.sleep()");
	}

	@Override
	public String toString() {
		return name;
	}

}

class Rat extends Rodent {
	private static long counter;
	private final long id = counter++;
	Characteristic t = new Characteristic("larger");
	Description p = new Description("black");
	private String name = "Rat";

	Rat(Shared shared) {
		super(shared);
		print("Rat" + id);

	}

	void eat() {
		print("Rat.eat()");
	}

	void run() {
		print("Rat.run()");
	}

	void sleep() {
		print("Rat.sleep()");
	}

	@Override
	public String toString() {
		return name;
	}
}

class Hamster extends Rodent {
	private static long counter;
	private final long id = counter++;
	Characteristic t = new Characteristic("like seed");
	Description p = new Description("short-lived");
	private String name = "Hamster";

	Hamster(Shared shared) {
		super(shared);
		print("Hamster" + id);

	}

	void eat() {
		print("Hamster.eat()");
	}

	void run() {
		print("Hamster.run()");
	}

	void sleep() {
		print("Hamster.sleep()");
	}

	@Override
	public String toString() {
		return name;
	}
}

class Mouse extends Rodent {
	private static long counter;
	private final long id = counter++;
	Characteristic t = new Characteristic("like cheese");
	Description p = new Description("nocturnal");
	private String name = "Mouse";

	Mouse(Shared shared) {
		super(shared);
		print("Mouse()");

	}

	void eat() {
		print("Mouse.eat()");
	}

	void run() {
		print("Mouse.run()");
	}

	void sleep() {
		print("Mouse.sleep()");
	}

	@Override
	public String toString() {
		return name;
	}
}

class Squirell extends Rodent {
	private static long counter;
	private final long id = counter++;
	Characteristic t = new Characteristic("climbs trees");
	Description p = new Description("likes nuts");
	private String name = "Squirell";

	Squirell(Shared shared) {
		super(shared);
		print("Squirell()");

	}

	void eat() {
		print("Squirelleat()");
	}

	void run() {
		print("Squirell.run()");
	}

	void sleep() {
		print("Squirell.sleep()");
	}

	@Override
	public String toString() {
		return name;
	}

}
