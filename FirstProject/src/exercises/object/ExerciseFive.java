package exercises.object;

public class ExerciseFive {

	public static void main(String[] args) {
		DataOnly dataOnly = new DataOnly();
		dataOnly.i = 500;
		dataOnly.d = 10.58d;
		dataOnly.b = true;
		System.out.println("DataOnly members are: \n "
				+ "i = " + dataOnly.i + "\n d = " + dataOnly.d + " \n b = " + dataOnly.b);
	}

}
