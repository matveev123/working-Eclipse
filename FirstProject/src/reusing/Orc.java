
package reusing;

import static util.Print.*;

public class Orc extends Villain {
	private int orcNumber;

	public Orc(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}

	void change(String name, int i) {
		super.set(name);
		orcNumber = i;
	}

	@Override
	public String toString() {
		return "orc " + orcNumber +": "+ super.toString();// super.toString();
	}

	public static void main(String[] args) {
		Orc orc = new Orc("Limberger", 22);
		print(orc);
		orc.change("Bob", 15);
		print(orc);
	}

}

class Villain {
	private String name;

	public Villain(String name) {
		this.name = name;
	}

	protected void set(String nm) {
		name = nm;
	}

	@Override
	public String toString() {
		return " I'm Villain and my name " + name;
	}
}
