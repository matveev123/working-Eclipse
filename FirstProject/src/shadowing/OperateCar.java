package shadowing;

public interface OperateCar {
	default public int startEngine(String key) {

		return 0;
	}
}
