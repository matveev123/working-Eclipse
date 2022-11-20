package experiment;

public class Temp {

	Temp() {
		System.out.println("const init");
	}

	static int[] arr;
	static int i;
	static {
		i=0;
		arr = new int[3];
		System.out.println("static init!");
	}
	{
		arr[++i] = 1;
		System.out.println("instance init!");
	}

	public static void main(String[] args) {
		Temp t1 = new Temp();
		
		Temp t2 = new Temp();
		System.out.println(t2.arr[0]);
		System.out.println(i);
		System.out.println("End!");
	}

}
