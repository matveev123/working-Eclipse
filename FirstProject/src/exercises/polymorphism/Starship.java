//ExerciseSevenTeen
// STATE PATTERN
package exercises.polymorphism;

import static util.Print.*;

public class Starship {

	public static void main(String[] args) {
		AlertStatus alertStatus = new AlertStatus();
		alertStatus.alert.blink();
		alertStatus.change();
		alertStatus.alert.blink();
		alertStatus.push();
		alertStatus.alert.blink();
	}

}

class AlertStatus {
	Alert alert = new Alert();

	void change() {
		alert = new RedAlert();
	}

	void push() {
		alert = new GreenAlert();
	}

	void display() {
		alert.blink();
	}

}

class Alert {
	void blink() {
		print("GREY!");
	}
}

class RedAlert extends Alert {
	void blink() {
		print("RED!");
	}
}

class GreenAlert extends Alert {
	void blink() {
		print("GREEN!");
	}
}
