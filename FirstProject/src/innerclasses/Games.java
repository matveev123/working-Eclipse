package innerclasses;

import static util.Print.*;

public class Games {

	public static void play(GameFactory fact) {
		Game g = fact.getGame();
		while (!g.move())
			;
	}

	public static void main(String[] args) {
		play(Checkers.factory);// !
		play(Chess.factory);// !

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
	private static final int MOVE = 3;

	public boolean move() {
		print("Checkers moves" + moves);
		return ++moves == MOVE;
	}

	public static GameFactory factory = new GameFactory() {
		public Game getGame() {
			return new Checkers();
		}
	};
}

class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;

	@Override
	public boolean move() {
		print("Chess moves" + moves);
		return ++moves == MOVES;
	}

	public static GameFactory factory = new GameFactory() {
		public Game getGame() {
			return new Chess();
		}
	};

}
