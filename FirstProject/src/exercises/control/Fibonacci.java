// EXerciseTwentyThree:
package exercises.control;

import static util.Print.*;

public class Fibonacci {
	int fib(int n) {
		if (n < 2)
			return 1;
		return (fib(n - 2) + fib(n - 1));

	}

	static void fibonacci(int n) {
		int f = 1, t = 0;
		while (f != n) {
			f = t + f;
			printb(f + " ");
			t = f - t;
		}

	}

	public static void main(String[] args) {
		fibonacci(433494437);// 5
		int n = 433_494_437;
		if (args.length != 0)
			n = Integer.parseInt(args[0]);// or Integer.valueOf()
//		for (int i = 0; i < n; i++)// infinite loop
//			print((new Fibonacci()).fib(i)); 
		// print(Integer.parseInt("Mother",10));

	}

}
