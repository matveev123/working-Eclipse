package interfaces;

import static util.Print.*;

public class Games {

	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
		while (s.move())
			;
	}

	public static void main(String[] args) {
		playGame(new CheckersFactory());
		playGame(new ChessFActory());

	}

}

interface Game {
	boolean move();
}

interface GameFactory {
	Game getGame();
}

class Checkers implements Game {
	private int moves = 0;
	private static final int MOVES = 3;

	public boolean move() {
		print("Checkers move " + moves);
		return ++moves != MOVES;
	}

	Checkers() {
	}

}

class CheckersFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new Checkers();
	}

}

class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;

	public boolean move() {
		print("Chess moves" + moves);
		return ++moves != MOVES;

	}

	Chess() {
	}

}

class ChessFActory implements GameFactory {
	ChessFActory() {
	}

	@Override
	public Game getGame() {
		return new Chess();
	}
}
