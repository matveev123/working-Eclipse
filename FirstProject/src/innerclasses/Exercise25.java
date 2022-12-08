//ExerciseTwentyFive
package innerclasses;

import static util.Print.*;

import innerclasses.controller.*;

public class Exercise25 extends GreenhouseControls { // ExerciseTwentyFive

	// water mist gemerator
	private boolean waterMistGen = false;

	// private String waterMistGenerator = "Turn on";
	public class WaterMistGeneratorOn extends Event {
		public WaterMistGeneratorOn(long delayTime) {
			super(delayTime);
		}

		public void action() {
			waterMistGen = true;
		};

		@Override
		public String toString() {
			return "Water mist generator is on!";
		}
	}

	public class WaterMistGeneratorOff extends Event {

		public WaterMistGeneratorOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			waterMistGen = false;
		}

		@Override
		public String toString() {
			return "Water mist generator is off";
		}

	}

}
