//ExreciseThree + ExreciseFour

package reusing;

public class Cartoon extends Drawing {
	public Cartoon() {
		System.out.println("Cartoon()");

	}

	public static void main(String[] args) {
		Skill skill = new Skill();

	}

}

class Skill extends Painting {
	Skill() {
		System.out.println("Skill()");
	}
}

class Painting extends Cartoon {
	Painting() {
		System.out.println("Painting()");
	}
}

class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing()");
	}
}

class Art {
	Art() {
		System.out.println("Art()");
	}
}
