package exercises.object;

public class ExreciseEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllTheColorsOfTheRainbow atc = new AllTheColorsOfTheRainbow();
		System.out.println("atc.anIntegerRepresentingColors = " + atc.anIntegerRepresentingColors);// ???
		atc.changeColor(7);
		atc.changeTheHueOfTheColor(77);
		System.out.println("after color change atc.anIntegerRepresentingColors = " + atc.anIntegerRepresentingColors);
		System.out.println("atc.hue = " + atc.hue);
	}

}

class AllTheColorsOfTheRainbow {// red orange yellow green blue violet
	int anIntegerRepresentingColors = 0;
	int hue;

	void changeTheHueOfTheColor(int newHue) {
		hue = newHue;
	}

	int changeColor(int newColor) {// ???
		return anIntegerRepresentingColors = newColor;
	}
	//
}