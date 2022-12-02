package exercises.interfaces;

import static util.Print.*;

interface CanDo {
	void doIt();
}

interface CanDoMore extends CanDo {

	void doMore();
}

interface CanDoFaster extends CanDo {
	void doFaster();
}

interface CanDoMost extends CanDoMore, CanDoFaster {
	void doMost();
}

class Doer implements CanDoMost {
	public void doIt() {
	}

	public void doMore() {
	}

	public void doFaster() {
	}

	public void doMost() {
	}
}

public class DiamondInheritance {
	public static void main(String[] args) {
		Doer d = new Doer();
//		((CanDoMore) d).doMore();
//		((CanDoFaster) d).doFaster();
//		((CanDo) d).doIt();
		d.doFaster();
		d.doIt();
		d.doMore();
		d.doMost();
	}
}
