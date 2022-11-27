package exercises.polymorphism.twelve;

import static util.Print.*;

public class Shared {//общий
	private int refCount = 0;
	private static long counter = 0;
	private final long id = counter++;

	public Shared() {
		print("Creating" + this);
	}

	public void addRef() {
		refCount++;
	}

	@Override
	public String toString() {
		return "Shared" + id;
	}
}
