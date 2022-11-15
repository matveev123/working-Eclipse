package initialization;

import static util.Print.*;

public class Leaf {
	int i = 0;
	Leaf increment() {
		i++;
		return this;
	}
	void printLeaf(){
		print("i = " + i);
	}
	

	public static void main(String[] args) {
		Leaf leaf = new Leaf();
		leaf.increment().increment().increment().printLeaf();
	}

}
