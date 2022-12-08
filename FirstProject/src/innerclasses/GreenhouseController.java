// added ExerciseTwentyfour  + ExerciseTwentyFive
package innerclasses;

import static util.Print.*;

import innerclasses.Exercise25.*;
import innerclasses.controller.*;

public class GreenhouseController {
	public static void main(String[] args) {
		GreenhouseControls gc = new GreenhouseControls();// !
		gc.addEvent(gc.new Bell(3000000000l));
		Event[] eventList = { gc.new ThermostatDay(0), gc.new FanOn(100), gc.new LightsOn(200), gc.new LightsOff(400),
				gc.new WaterOn(600), new Exercise25().new WaterMistGeneratorOff(800), gc.new WaterOff(800),
				gc.new FanOff(300), new Exercise25().new WaterMistGeneratorOn(600), gc.new ThermostatNight(1400), };// ExerciseTwentyFour
		gc.addEvent(gc.new Restart(5000000000l, eventList));
		gc.addEvent(new GreenhouseControls.Terminate(10000000000l));
		gc.run();
		// new Execise25 <=> gc ~

	}

}
