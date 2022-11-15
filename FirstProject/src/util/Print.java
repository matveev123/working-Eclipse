package util;

import java.io.*;

public class Print {
	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static void print(Object[] obj) {
		for (Object x : obj)
			System.out.print(x + " ");
	}

	public static void printb(Object obj) {
		System.out.print(obj);
	}

	public static void println() {
		System.out.println();
	}

	/*
	 * public static void print() { System.out.print(); }
	 */
}
