package polymorphism;

import static util.Print.*;

public class ReferenceCounting {
	@Override
	protected void finalize() {
		print("message from finalize");
	}

	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composings = new Composing[] { new Composing(shared), new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared), new Composing(shared) };
		for (Composing x : composings)
			x.dispose();
		//Composing composinTestComposing = new Composing(shared);
		Shared sharedTest = new Shared();
		Composing composinTestComposing = new Composing(sharedTest);
		sharedTest.finalize();
		print("Try 1: ");
		System.runFinalization();
		print("Try 2: ");
		Runtime.getRuntime().runFinalization();
		print("Try 3: ");
		System.gc();
		print("Try 4: ");

	}

}

class Shared {
	private int refCount = 0;
	private static long counter = 0;
	private final long id = counter++;
//	private boolean flag = false;

	@Override
	protected void finalize() {
		if (refCount > 0)
			print("Error!");
	}

	public Shared() {
		print("Creating " + this);
	}

	void addRef() {
		refCount++;
//		flag = true;
	}

	protected void dispose() {
		if (--refCount == 0) {
			print("disposing " + this);
//			flag = false;
		}

	}

	@Override
	public String toString() {
		return "Shared " + id;
	}
}

class Composing {
	Shared shared;
	private static long counter = 0;
	private final long id = counter++;
//	private boolean flag = false;

	public Composing(Shared shared) {
		print("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
//		this.shared.flag = true;
//		flag = true;
	}

//	@Override
//	protected void finalize() {
//		if (flag)
//			print("Error");
//	}

	protected void dispose() {
		print("disposing " + this);
		this.shared.dispose();
//		flag = false;
	}

	@Override
	public String toString() {
		return "Composing " + id;
	}

}
