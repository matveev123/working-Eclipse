package polymorphism;

class StaticSuper {
	public static String staticGet() {//1
		return "Base staticGet()";
	}

	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticSub extends StaticSuper {
	public static String staticGet() {
		return "Derived staticGet()";
	}

	public String dynamicGet() {
		return "Derived dynamicGet()";//2
	}
}

public class StaticPolymorphism {
	public static void main(String[] args) {
		StaticSuper sup = new StaticSub(); // Upcast
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
	}
} /*
	 * Output: Base staticGet() Derived dynamicGet()
	 */// :~
