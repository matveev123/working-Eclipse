package reusing;

import exercises.access.B;

public class Hide {

	public static void main(String[] args) {

		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(2.3f);
		b.doh(new Milhouse());

	}

}

class Homer {
	char doh(char c) {
		System.out.println("doh(char)");
		return 'd';
	}

	float doh(float f) {
		System.out.println("doh(float)");
		return 1.0f;
	}
}

class Milhouse {
}

class Bart extends Homer {
	void doh(Milhouse m) {
		System.out.println("doh(Milhouse)");

	}

}

//class Lisa extends Homer {
//	@Override
//	void doh(Milhouse m) {
//		System.out.println("doh(Milhouse)");
//
//	}
//}
