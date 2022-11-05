package operators;

import static util.Print.*;

public class AutoInc {

	public static void main(String[] args) {
		int i = 1;
		print("i : " + i);
		print("++i : " + ++i);// pre
		print("i++ : " + i++);// post
		print("i : " + i);
		print("--i : " + --i);// pre
		print("i-- : " + i--);// post
		print("i : " + i);
		// побочный эффект!
	}

}
