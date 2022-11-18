package exercises.access;

class SomeData {
	protected int i = 123;
}

class DataChanger {
	static void change(SomeData sd, int a) {
		sd.i = a;
	}
}

public class ProtectedData {

	public static void main(String[] args) {
		SomeData SomeData = new SomeData();
		System.out.println(SomeData.i);
		DataChanger.change(SomeData, 1);
		System.out.println(SomeData.i);
	}

}
