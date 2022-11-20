package exercises.reusing;

public class Ex8 {
	public Ex8(int i) {
	}

}

class M extends Ex8 {
	M() {
		super(3);
	}

	M(int i) {
		super(i);
	}

	public static void main(String[] args) {
		M o1 = new M();
		M o2 = new M(3);
	}
}
