package initialization;

class Person {
	void eat(Apple apple) {
		Apple peeled = apple.getPeeled();// 1 - берем объект apple
		System.out.println("Yummy!");
	}
}

class Peeler {
	static Apple peel(Apple apple) {// 3 получаем объект apple посредством передачи ссылки this
		return apple;
	}
}

class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);// 2 передаём объект с помощью this - ссылка на объект для которого был вызыван
									// метод getPeeled()
	}
}

public class PassingThis {
	public static void main(String[] args) {
		new Person().eat(new Apple());
	}
}