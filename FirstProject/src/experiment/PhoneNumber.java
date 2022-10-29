package experiment;

import java.util.*;

public class PhoneNumber {
	private final short areaCode, prefix, lineNum;

	PhoneNumber(int areaCode, int prefix, int lineNum) {
		this.areaCode = checkRange(areaCode, 999, "area code");
		this.prefix = checkRange(prefix, 999, "prefix");
		this.lineNum = checkRange(lineNum, 9999, "line num");
	}

	private static short checkRange(int val, int max, String arg) {
		if (val < 0 || val > max)
			throw new IllegalArgumentException(arg + ":" + val);
		return (short) val;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof PhoneNumber))
			return false;
		PhoneNumber pn = (PhoneNumber) o;
		return pn.areaCode == areaCode && pn.prefix == prefix && pn.lineNum == lineNum;
	}

	@Override
	public int hashCode() {
		int result = Short.hashCode(areaCode);
		result = 31 * result + Short.hashCode(prefix);
		result = 31 * result + Short.hashCode(lineNum);
		return result;
	}

	public static void main(String[] args) {
		Map<PhoneNumber, String> m = new HashMap<>();
		System.out.println(m.put(new PhoneNumber(707, 867, 5309), "Jenny"));// один экземпляр класса для вставки
		System.out.println(m.get(new PhoneNumber(707, 867, 5309)));// один экземпляр класса для выборки
		//System.out.println(m.get("Jenny"));// один экземпляр класса для выборки
	
		//System.out.println(m.in);
	}
}
