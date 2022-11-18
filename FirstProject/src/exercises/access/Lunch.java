package exercises.access;

public class Lunch {

	public static void main(String[] args) {

	}

	void testPrivate() {
		// Soup1 soup1 = new Soup1();// нельзя!
	}

	void testStatic() {
		Soup2 soup2 = Soup2.access();
	}

	void testSingelton() {
		Soup2.access().f();
	}

}

class Soup1 {
	private Soup1() {// контроль создание объекта класса Soup1
	}

	public static Soup1 makeSoup() {// возращает ссылку на объект
		return new Soup1();// разрешаем создание объектов в статическом методе!
	}

}

class Soup2 {
	private Soup2() {// контроль создание объекта класса Soup2
	}

	private static Soup2 sp2 = new Soup2();// создаем статический объект

	public static Soup2 access() {// возращает ссылку на объект
		return sp2;// по запросу возращаем объект!
	}

	public static void f() {
		System.out.println("OK?");
	}
}
