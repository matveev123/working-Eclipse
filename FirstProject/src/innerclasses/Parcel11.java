package innerclasses;

import static util.Print.*;

import java.nio.channels.NonWritableChannelException;

public class Parcel11 {

	private static class ParcelContents implements Contents {
		private int i = 2;

		@Override
		public int value() {
			return i;
		}
	}

	protected static class ParcelDestination implements Destination {
		private String label;

		public ParcelDestination(String whereTwo) {
			label = whereTwo;
		}

		@Override
		public String readLabel() {
			return label;
		}
	}

	// nestes classes can contain another static elements:
	public static void f() {
	}

	static int x = 100;

	static class AnotherLevel {
		public static void f() {
		}

		static int x = 300;

	}

	public static Contents content() {
		return new ParcelContents();
	}

	public static Destination destination(String s) {
		return new ParcelDestination(s);
	}

	public static void main(String[] args) {
		Parcel11 p = new Parcel11();
		Destination d = p.destination("Tansania");

	}

}
