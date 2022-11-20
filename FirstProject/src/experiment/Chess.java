//ExerciseSix
//ExrciseSeven
package experiment;

public class Chess extends BoardGame {
	public Chess(int i) {
		super(i);
		System.out.println("Chess()");
	}

	public static void main(String[] args) {
		Chess chess = new Chess(5);
	}

}

class Game {
	Game(int i) {
		System.out.println("Game() and i = " + i);
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame() and i = " + i);
	}
}
