package initialization;

import static util.Print.*;

public class VarargType {
	static void f(Character... args) {
		System.out.print(args.getClass());
		System.out.println(" length " + args.length);
	}

	static void g(int... args) {
		System.out.print(args.getClass());
		System.out.println(" length " + args.length);
	}

	public static void main(String[] args) {
//		f('a');
//		f();
//		g(1);
//		g();

		System.out.println(new Boolean[0].getClass());
		System.out.println(new Character[0].getClass());
		System.out.println(new Byte[0].getClass());
		System.out.println(new Short[0].getClass());
		System.out.println(new Integer[0].getClass());
		System.out.println(new Long[0].getClass());
		System.out.println(new Float[0].getClass());
		System.out.println(new Double[0].getClass());
		System.out.println(new String[0].getClass());
		System.out.println(new boolean[0].getClass());// Z
		System.out.println(new char[0].getClass());
		System.out.println(new byte[0].getClass());
		System.out.println(new short[0].getClass());
		System.out.println(new int[0].getClass());
		System.out.println(new long[0].getClass());// J
		System.out.println(new float[0].getClass());
		System.out.println(new double[0].getClass());

	}
}
