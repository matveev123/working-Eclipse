package string;

import static util.Print.*;

public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		Test test1 = new Test();
		String s1 = "world";
		String s2 = "world";

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		s1.hashCode();
		s1.equals(s2);
		print("HI,master!");
		//s1 == s2;
		//System.out.println(s1.hashCode());
		//System.out.println(s1.hashCode());
		//System.out.println(test1.hashCode());

	}
}
