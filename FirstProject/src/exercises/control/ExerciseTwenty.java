package exercises.control;

import static util.Print.*;

public class ExerciseTwenty {
	static boolean test(int begin, int end, int testVal) {
		if (testVal >= begin && testVal <= end)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		print(test(5, 40, 1));
		print(test(7, 12, 1));
		
		/////////////////////////////////////////////////////////////
		for(int i = 0; i < 100; i++) {
		      if(i == 74) break; // Out of for loop
		      if(i % 9 != 0) continue; // Next iteration
		      System.out.print(i + " ");
		    }
	}

}
