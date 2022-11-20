package exercises.reusing;

import reusing.*;

public class Simple {

	public static void main(String[] args) {
		Simple simple = new Simple();
		simple.sterilize();
		simple.scrub();
	}

	public void scrub() {
		// System.out.println("Simple.dcrub()");
		//append("Simple.dcrub()");
	}

	public void sterilize() {
		// System.out.println();
		//append("Simple.sterilize()");
	}

}
