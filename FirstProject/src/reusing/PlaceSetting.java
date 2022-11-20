package reusing;

public class PlaceSetting extends Custom {
	private Spoon sp;
	private Knife knf;
	private Fork frk;
	private DinnerPlate dpl;

	public PlaceSetting(int i) {
		super(i + 1);/// ??
		sp = new Spoon(i + 1);
		knf = new Knife(i + 2);
		frk = new Fork(i + 3);
		dpl = new DinnerPlate(i + 4);
		System.out.println("PlaceSettings");
	}

	public static void main(String[] args) {
		PlaceSetting ps = new PlaceSetting(0);
	}

}

class Plate {
	Plate(int i) {
		System.out.println("Plate");
	}
}

class DinnerPlate extends Plate {
	DinnerPlate(int i) {
		super(i);
		System.out.println("DinnerPlate");
	}

}

class Utensil {
	Utensil(int i) {
		System.out.println("Utensil");
	}
}

class Fork extends Utensil {
	Fork(int i) {
		super(i);
		System.out.println("Fork");

	}
}

class Spoon extends Utensil {
	Spoon(int i) {
		super(i);
		System.out.println("Spoon");
	}
}

class Knife extends Utensil {
	Knife(int i) {
		super(i);
		System.out.println("Knife");
	}
}

class Custom {
	Custom(int i) {
		System.out.println("Custom");
	}
}
