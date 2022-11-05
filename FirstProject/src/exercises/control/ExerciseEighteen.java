package exercises.control;

import static util.Print.*;

public class ExerciseEighteen {
	static void findPrimeBounds(int from, int until) {
		if(until < from)
			return;
		int k = 0, f = 0;
		for (int i = from; i < until; i++) {
			if (f == k & i != 1 & i != 2 & i != 0)
				print(i - 1);
			k = 0;
			f = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0 & i != 1 & j != 1) {
					f++;
					if (i == j)
						k++;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		findPrimeBounds(0,20);
	}

}
