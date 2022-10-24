package experiment;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/**
 * @author zhoufy
   * @date 2 февраля 2019 г., 10:29:15
 */
@SuppressWarnings("restriction")		// Отменяем отображаемый набор предупреждений
public class ObjectsAddressDemo {

	static final Unsafe unsafe = getUnsafe();
	static final boolean is64bit = true; // auto detect if possible.

	public static void main(String... args) {
		A a = new A();
		
		// Перед сборкой мусора
		System.out.println("----------- Перед сборкой мусора ------------");
		print(a);
		
		System.gc();
		
		// После GC
		System.out.println("----------- После GC ------------");
		print(a);
	}

	private static void print(A a) {
		// hashcode
		System.out.println("Hashcode :       " + a.hashCode());
		System.out.println("Hashcode :       " + System.identityHashCode(a));
		System.out.println("Hashcode (HEX) : " + Integer.toHexString(a.hashCode()));// Integer.toHexString (int) - это преобразование целого числа в шестнадцатеричное число

		// toString
		System.out.println("toString :       " + String.valueOf(a));

		// Через sun.misc.Unsafe;
		printAddresses("Address", a);
	}

	@SuppressWarnings("deprecation")
	public static void printAddresses(String label, Object... objects) {
		System.out.print(label + ":         0x");
		long last = 0;
		int offset = unsafe.arrayBaseOffset(objects.getClass());
		int scale = unsafe.arrayIndexScale(objects.getClass());
		switch (scale) {
		case 4:
			long factor = is64bit ? 8 : 1;
			final long i1 = (unsafe.getInt(objects, offset) & 0xFFFFFFFFL) * factor;
			System.out.print(Long.toHexString(i1));
			last = i1;
			for (int i = 1; i < objects.length; i++) {
				final long i2 = (unsafe.getInt(objects, offset + i * 4) & 0xFFFFFFFFL) * factor;
				if (i2 > last)
					System.out.print(", +" + Long.toHexString(i2 - last));
				else
					System.out.print(", -" + Long.toHexString(last - i2));
				last = i2;
			}
			break;
		case 8:
			throw new AssertionError("Not supported");
		}
		System.out.println();
	}

	private static Unsafe getUnsafe() {
		try {
			Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
			theUnsafe.setAccessible(true);
			return (Unsafe) theUnsafe.get(null);
		} catch (Exception e) {
			throw new AssertionError(e);
		}
	}
}
