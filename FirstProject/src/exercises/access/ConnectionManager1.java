package exercises.access;

public class ConnectionManager1 {
	static int howManyLeft = 3;
	static Connection1[] ca = new Connection1[3];// ?
	{
		for (Connection1 x : ca)
			x = Connection1.makeConnection1();
	}

	public static Connection1 getConnection1() {
		if (howManyLeft > 0)
			return ca[--howManyLeft];
		else {
			System.out.println("No more connection!");
			return null;
		}

	}

	public static void main(String[] args) {
		ConnectionManager1 cn1 = new ConnectionManager1();
		System.out.println(cn1.howManyLeft);
		cn1.getConnection1();
		System.out.println(cn1.howManyLeft);
		cn1.getConnection1();
		System.out.println(cn1.howManyLeft);
		cn1.getConnection1();
		System.out.println(cn1.getConnection1());
		System.out.println(howManyLeft);

	}

}

class Connection1 {
	private static int count = 0;
	private int i = 0;// ?

	private Connection1() {
	}

	static Connection1 makeConnection1() {
		count++;
		return new Connection1();
	}

	int howMany() {
		return count;
	}

	public String toString() {
		return "Connection" + count;
	}

}
