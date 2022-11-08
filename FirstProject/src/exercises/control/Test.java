package exercises.control;

import static util.Print.*;

import java.util.Arrays;

public class Test {

//	public static void main(String[] args) {
//		int i = 100;
//		switch (1) {
//		case 1: {
//			break;
//		}
//		case 2: {
//			print("i = " + i);
//
//		}
//		case 3: {
//			print("case 3");
//		}
//		default:
//			print("default");
//		}
//
//		print("OK!");
//	}
	public static void main(String[] args) {
		int[][] arr = new int[4][3];
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[0].length; j++)
				arr[i][j] = 1;
		print(Arrays.deepToString(arr));
	}

}
