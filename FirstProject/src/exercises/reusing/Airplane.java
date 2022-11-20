//ExerciseOne
package exercises.reusing;

public class Airplane {
	private String fuselage, tail, wings;// private!!!
	private Engine e;// private!!!

	public Airplane() {
		fuselage = "Body";
		tail = "Empennage";
		wings = "Airfoils";
	}

	public String toString() {
		if (e == null)
			e = new Engine();
		return "fuseage: " + fuselage + "\n" + "teil: " + tail + "\n" + "wings: " + wings + "\n" + "engine: " + e
				+ "\n";
	}

	public static void main(String[] args) {
		Airplane N1234 = new Airplane();
		System.out.println(N1234);
	}

}

class Engine {

	private String s;// private!!!

	Engine() {
		System.out.println("Engine()");
		s = "Constructed!";
	}

	public String toString() {
		return s;
	}
}
