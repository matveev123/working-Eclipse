//ExerciseTwentyFour
package innerclasses;

import static util.Print.*;

import innerclasses.controller.*;

public class GreenhouseControls extends Controller {

	private boolean fan = false;

	public class FanOn extends Event {// ExerciseTwentyFour

		public FanOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			fan = true;
		}

		@Override
		public String toString() {
			return "Fan is on";
		}

	}

	public class FanOff extends Event {

		public FanOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			fan = false;
		}

		@Override
		public String toString() {
			return "Fan is off";
		}
	}

	private boolean light = false;

	public class LightsOn extends Event {

		public LightsOn(long delayTime) {
			super(delayTime);
		}

		public void action() {
			light = true;
		}

		@Override
		public String toString() {
			return "Light is on!";
		}

	}

	public class LightsOff extends Event {

		public LightsOff(long delayTime) {
			super(delayTime);
		}

		public void action() {
			light = true;
		}

		@Override
		public String toString() {
			return "Light is off!";
		}

	}

	private boolean water = false;

	public class WaterOn extends Event {

		public WaterOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			water = true;
		}

		@Override
		public String toString() {
			return "Greenhouse is water on!";
		}

	}

	public class WaterOff extends Event {
		public WaterOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			water = false;
		}

		@Override
		public String toString() {
			return "Greenhouse is water off!";
		}

	}

	private String thermostat = "Night";

	public class ThermostatDay extends Event {
		public ThermostatDay(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			thermostat = "Day";
		}

		@Override
		public String toString() {
			return "Thermostat is day setting";
		}
	}

	public class ThermostatNight extends Event {
		@Override
		public void action() {
			thermostat = "Night";

		}

		public ThermostatNight(long delayTime) {
			super(delayTime);
		}

		@Override
		public String toString() {
			return "Thermostat is Night setting!";
		}
	}

	public class Bell extends Event {

		public Bell(long delayTime) {
			super(delayTime);
		}

		// разрешено inner классу им пользоваться т.к. внешний класс extends Controller
		// в котором public addEvent
		@Override
		public void action() {
			addEvent(new Bell(delayTime)); // заново себя

		}

		@Override
		public String toString() {
			return "Bing!";
		}
	}

	public class Restart extends Event {
		private Event[] eventList;

		public Restart(long delayTime, Event[] eventlist) {
			super(delayTime);
			this.eventList = eventlist;
			for (Event e : eventList)
				addEvent(e);
		}

		@Override
		public void action() {
			for (Event e : eventList) {
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);

		}

		@Override
		public String toString() {
			return "Restating!";
		}

	}

	public static class Terminate extends Event {
		@Override
		public void action() {
			System.exit(0);
		}

		public Terminate(long delayTime) {
			super(delayTime);
		}

		@Override
		public String toString() {
			return "Terminating";
		}
	}
}
