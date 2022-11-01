package operators;

import static util.Print.*;

public class Assignment {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		print("t1.level: " + t1.level + " t2.level: " + t2.level + "\n");
		t1 = t2;
		print("t1.level: " + t1.level + " t2.level: " + t2.level + "\n")	;
		t1.level = 88;
		print("t1.level: " + t1.level + " t2.level: " + t2.level + "\n");
		
		// t1.level = t2.level
	}

}

class Tank {
	int level;
}