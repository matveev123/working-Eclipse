//ExerciseEight:
package exercises.access;

public class ConnectionManager {

	public static void main(String[] args) {
		Connection arr[] = testConnection();
		System.out.println(arr.length);
	}

	public static Connection[] testConnection() {
		int i = 0;
		while (Connection.makeConnection() != null) {
			i++;
		}
		return new Connection[i];
	}
}

class Connection {
	private static int counter = 0;
	// private static final int limit = 5;

	private Connection() {
	}

	public static Connection makeConnection() {
		counter++;
		if (counter == 6)
			return null;
		return new Connection();
	}
	
//	public toString() {
//		return "Connection" + counter;
//	}
}
