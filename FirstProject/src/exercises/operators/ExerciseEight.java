package exercises.operators;

//add ExerciseNine
import static util.Print.*;

public class ExerciseEight {

	public static void main(String[] args) {
		long l = 1500l;// decimal
		print(Long.toBinaryString(l));
		l = 0x5DC;// hex
		print(Long.toBinaryString(l));
		l = 02734;// ocatl
		print(Long.toBinaryString(l));
		print(Float.MAX_VALUE);
		print(Float.MAX_VALUE);
		print(Double.MAX_VALUE);
		print(Double.MIN_VALUE);
		print(2e+10);
		print(~0);
	}

}
