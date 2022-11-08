package exercises.control;

import static util.Print.*;

import java.util.Arrays;

public class ExerciseTwentyFour {
	// ABCD :
	// AC AB AD
	// BA BC BD
	// CA CB CD
	// DA DB DC
	static int[] f(int n) {
		int[] mas = new int[4];
		mas[0] = n / 1000;
		mas[1] = (n / 100) % 10;
		mas[2] = (n % 100) / 10;
		mas[3] = n % 10;
		return mas;
	}

	static int[][] m(int[] mas) {
		int arr[][] = new int[4][3];// 4 3
		arr[0][0] = mas[0] * 10 + mas[1];// AB 00
		arr[0][1] = mas[0] * 10 + mas[2];// AB 01
		arr[0][2] = mas[0] * 10 + mas[3];// AB 02
		// = mas[1] * 10 + mas[0];
		arr[1][0] = ((mas[1] == 0) ? (mas[1] = mas[0]) : (mas[1] = mas[1])) * 10 + mas[0];// BA 10
		arr[1][1] = ((mas[1] == 0) ? (mas[1] = mas[2]) : (mas[1] = mas[1])) * 10 + mas[2];// BC 12 
		arr[1][2] = ((mas[1] == 0) ? (mas[1] = mas[3]) : (mas[1] = mas[1])) * 10 + mas[3];// BD 13 

		arr[2][0] = ((mas[2] == 0) ? (mas[2] = mas[0]) : (mas[2] = mas[2])) * 10 + mas[0];// CA 20
		arr[2][1] = ((mas[2] == 0) ? (mas[2] = mas[1]) : (mas[2] = mas[2])) * 10 + mas[1];// CB 21
		arr[2][2] = ((mas[2] == 0) ? (mas[2] = mas[3]) : (mas[2] = mas[2])) * 10 + mas[3];// CD 23

		arr[3][0] = ((mas[3] == 0) ? (mas[3] = mas[0]) : (mas[3] = mas[3])) * 10 + mas[0];// DA 30
		arr[3][1] = ((mas[3] == 0) ? (mas[3] = mas[1]) : (mas[3] = mas[3])) * 10 + mas[1];// DB 31
		arr[3][2] = ((mas[3] == 0) ? (mas[3] = mas[2]) : (mas[3] = mas[3])) * 10 + mas[2];// DC 32
		return arr;
	}

	static void method(int n, int a, int b) {
		String str = Integer.toString(n);
		String strA = Integer.toString(a);
		String strB = Integer.toString(b);

		String str1 = str;
		String strA1 = strA;
		String strB1 = strB;

		while (strA.isEmpty() != true & strB.isEmpty() != true) {
			if (str.indexOf(strA.substring(0, 1)) != -1) {
				str = str.replaceAll(strA.substring(0, 1), "");
				strA = strA.replaceAll(strA.substring(0, 1), "");
			} else {
				break;
			}
			if (str.indexOf(strB.substring(0, 1)) != -1) {
				str = str.replaceAll(strB.substring(0, 1), "");
				strB = strB.replaceAll(strB.substring(0, 1), "");
			} else {
				break;
			}
		}
		if (str.isEmpty() & strA.isEmpty() & strB.isEmpty())
			print("SUCCESS! " + str1 + " " + strA1 + " " + strB1);

	}

	public static void main(String[] args) {// 6880 = 86*60 missed!
		for (int r = 1000; r <= 9999; r++) {
			int mas[] = f(r);
			int arr[][] = m(mas);
			for (int i = 0; i < arr.length; i++)
				for (int j = 0; j < arr[0].length; j++)
					for (int k = 0; k < arr.length; k++)
						for (int l = 0; l < arr[0].length; l++)
							method(arr[i][j] * arr[k][l], arr[i][j], arr[k][l]);
		}
	}
}