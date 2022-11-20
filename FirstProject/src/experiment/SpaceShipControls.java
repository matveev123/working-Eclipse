package experiment;

public class SpaceShipControls {

	void up(int velocity) {
	}

	void forward(int velocity) {
	}

	void back(int velocity) {
	}

	void left(int velocity) {
	}

	void right(int velocity) {
	}

	void turboBoost(int velocity) {
	}

	void down(int velocity) {
	}

}

/*
 * class SpaceShip extends SpaceShipControls { private String name;
 * 
 * SpaceShip(String name) { this.name = name; }
 * 
 * public String toString() { return name; }
 * 
 * public static void main(String[] args) { SpaceShip protector = new
 * SpaceShip("NSEA protector"); protector.forward(int velocity); } }
 */

class SpaceShipDelegation {
	private String name;

	public SpaceShipDelegation(String name) {
		this.name = name;
	}

	SpaceShipControls ssc = new SpaceShipControls();

	public static void main(String[] args) {
		SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
		protector.forward(100);

	}

	// delegatied methods:
	void up(int velocity) {
		ssc.up(velocity);
	}

	void down(int velocity) {
		ssc.down(velocity);
	}

	void right(int velocity) {
		ssc.right(velocity);
	}

	void left(int velocity) {
		ssc.left(velocity);
	}

	void turboBoost(int velocity) {
		ssc.turboBoost(velocity);
	}

	void back(int velocity) {
		ssc.back(velocity);
	}

	void forward(int velocity) {
		ssc.forward(velocity);
	}
}
