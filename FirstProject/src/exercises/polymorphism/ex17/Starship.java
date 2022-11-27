//ExerciseSevenTeen
package exercises.polymorphism.ex17;

import static util.Print.*;

public class Starship {

	public static void main(String[] args) {
		AlertStatus alertStatus = new AlertStatus();
		alertStatus.display();// perform
		alertStatus.greenAlert();// change
		alertStatus.display();// perform
		alertStatus.greyAlert();// change
		alertStatus.display();// perform
		alertStatus.redAlert();// change
		alertStatus.display();// perform

	}

}

class AlertStatus {// star
	private Alert alert = new GreyAlert();// alertstatus

	void redAlert() {
		alert = new RedAlert();
	}

	void greenAlert() {
		alert = new GreenAlert();
	}

	void greyAlert() {
		alert = new GreyAlert();
	}

	void display() {
		alert.alert();
		// print(alert);;//?
	}

}

class Alert {
	void alert() {//0
	}
}

class RedAlert extends Alert {
	void alert() {
		print("RED!");
	}
}

class GreenAlert extends Alert {
	void alert() {
		print("GREEN!");
	}
}

class GreyAlert extends Alert {
	void alert() {
		print("GREY!");
	}

}
