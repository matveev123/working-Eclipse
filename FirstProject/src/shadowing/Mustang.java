package shadowing;

public class Mustang implements FlyCar, OperateCar {

	// FlyCar.super.startEngine("1");
	// OperateCar.super.startEngine("1");
	public int startEngine(String key) {
		return 0;
	}

	public static void main(String[] args) {
		Mustang mustang = new Mustang();
		mustang.startEngine("1");

	}

}
