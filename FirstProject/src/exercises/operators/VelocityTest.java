//exreciseFour
package exercises.operators;

import static util.Print.*;

import util.Print;

public class VelocityTest {

	public static void main(String[] args) {
		float d = 44.1f;
		float t = 10f;
		float v = VelocityCalc.velocityCalculator(d, t);
		print("velocity = " + v);
	}

}

class VelocityCalc {
	static float velocityCalculator(float d, float t) {
		return d / t;// check devison by zero!!!
	};
}
