package shadowing;

public interface FlyCar {
	default public int startEngine(String key) {
		
		return 0;
	}
}
