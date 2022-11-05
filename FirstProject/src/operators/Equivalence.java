package operators;

import static util.Print.*;

public class Equivalence {

	public static void main(String[] args) {

		Integer i1 = Integer.valueOf(47);
		Integer i2 = Integer.valueOf(47);

		/* Integer i1 = new Integer(47); Integer i2 = new Integer(47); */// false а следом true;
		print(i1.hashCode());// 47
		print(i2.hashCode());// 47

		System.out.println(i1 == i2);// true
		// print(i1 == i2);// сравнивает ссылки
		print(i1 != i2);// сравниванет сслыки false
		print(i1.equals(i2));// сравнивает ЗНАЧЕНИЯ!НО! по умрлчанию сравнивает ССЫЛКИ И только после определения - значения!
								//  // true
	}

}
