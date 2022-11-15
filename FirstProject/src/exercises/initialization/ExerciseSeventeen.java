package exercises.initialization;

import static util.Print.*;

import java.util.Arrays;
import java.util.Random;

public class ExerciseSeventeen {

	public static void main(String[] args) {
		Exercise[] arr = new Exercise[10];
//		for (Exercise x : arr)
//			printb(x.str + " "); null-ы
		Exercise.fill(arr);
		print("\nafter fill()");
		for (Exercise x : arr)
			printb(x.str + " ");

	}

}

class Exercise {
	String str = "line";

	Exercise(String str) {
		printb("inint(): " + str +" ");
		this.str = str;
	}

	static void fill(Exercise[] mas) {// создаем копмю arr!(передаем сслылку)
		Random random = new Random(47);
		for (int i = 0; i < mas.length; i++)
			mas[i] = new Exercise(Integer.toString(random.nextInt(500)));
	}
}
