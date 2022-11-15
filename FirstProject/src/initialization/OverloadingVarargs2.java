package initialization;

public class OverloadingVarargs2 {
	static void f(float i, Character... args) {
		System.out.println("first");
	}

	static void f(int i, Character... args) {
		System.out.print("second");
	}

	public static void main(String[] args) {
		f(1, 'a');
		f('a', 'b');
	}
} /// :~
