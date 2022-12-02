package interfaces;

import static util.Print.*;

public class HorrorShow {
	static void u(Monster m) {
		m.menace();
	}

	static void m(DangerousMonster d) {
		d.destroy();
		d.menace();
	}

	static void w(Lethal l) {
		l.kill();
	}

	public static void main(String[] args) {
		DangerousMonster barney = new DragonZilla();// !
		u(barney);
		m(barney);
		Vampire vlad = new VeryBadVampire();
		w(vlad);
		m(vlad);
		u(vlad);

	}

}

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();

}

interface Lethal {

	void kill();
}

class DragonZilla implements DangerousMonster {

	@Override
	public void menace() {
	}

	@Override
	public void destroy() {
	}

}

interface Vampire extends DangerousMonster, Lethal {
	void drikBlood();
}

class VeryBadVampire implements Vampire {

	@Override
	public void destroy() {
	}

	@Override
	public void menace() {
	}

	@Override
	public void kill() {
	}

	@Override
	public void drikBlood() {
	}
}
