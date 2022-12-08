package exercises.innerclasses;

import static util.Print.*;
/*Если в программе Sequence.java отсутствовали бы внутренние классы, то нам пришлось бы заявить, что «класс Sequence есть класс Selector»(«is-a»), 
и при этом ограничиться только одним объектом Selector для конкретного объекта Sequence. А вы можете с легкостью определить второй метод, reverseSelector(), 
создающий объект Selector для перебора элементов Sequence в обратном порядке. Такую гибкость дают только внутренние классы.*/

public class ExerciiseTwentytwo {

	public static void main(String[] args) {
		print("readY!");
		Sequence.main(args);
	}

}

interface Selector {
	void reverse();

	boolean end();

	Object current();

	void next();

}

class Sequence {
	private Object[] items;
	private int next = 0;

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}

	Sequence(int size) {
		items = new Object[size];
	}

	private class SequenceSeleector implements Selector {// pattern «Iterator»
		private int i = 0;
		private int iR = items.length-1;

		public boolean end() {
			return i == items.length;
		}

		public Object current() {
			return items[i];
		}

		public void next() {
			if (i < items.length)
				i++;
		}

		public Sequence getSequence() {// ExerciseFour
			return Sequence.this;
		}

		@Override
		public void reverse() {
			while (iR != -1) {
				System.out.print(items[iR--] + " ");
			}

		}

	}

	Selector selector() {
		return new SequenceSeleector();
	}

	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		System.out.println();
		
		selector.reverse();

		// ((SequenceSeleector) selector).getSequence();// !
		// Sequence sequence3 = new Sequence(1).new SequenceSeleector().getSequence();//
		// ExerciseFour

	}

}

