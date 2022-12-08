package innerclasses;

import static util.Print.*;

public interface ClassInInterface {
	class Test implements ClassInInterface {
		public void howdy() {
			System.out.println("Hello!");
		}

		public static void main(String[] args) {
			new Test().howdy();
		}
	}

}
