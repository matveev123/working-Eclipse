package operators;

public class PassObject {

	static void f(Letter l) {
		l.c = 'z';
	}

	public static void main(String[] args) {
		Letter letter = new Letter();
		letter.c = 'a';
		System.out.println("letter.c = " + letter.c);
		f(letter);
		System.out.println("letter.c = " + letter.c);
	}

}

class Letter {
	char c;
}
