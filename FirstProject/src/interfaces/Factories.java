package interfaces;

import static util.Print.*;

public class Factories {
	static void serviceConsumer(ServiceFacrtory fact) {
		Service s = fact.getService();// ?
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		// interchangeable
		serviceConsumer(new ImplamentationFactory1());
		serviceConsumer(new ImplamentationFactory2());

	}

}

interface Service {
	void method1();

	void method2();
}

interface ServiceFacrtory {
	Service getService();
}

class Implementation1 implements Service {

	Implementation1() {
	}

	@Override
	public void method1() {
		print("method1 from1");
	}

	@Override
	public void method2() {
		print("method2 from2");
	}
}

class ImplamentationFactory1 implements ServiceFacrtory {

	@Override
	public Service getService() {
		return new Implementation1();
	}

}

class Implementation2 implements Service {
	Implementation2() {
	}

	@Override
	public void method1() {
		print("method1 from2");
	}

	@Override
	public void method2() {
		print("method2 from2");
	}
}

class ImplamentationFactory2 implements ServiceFacrtory {

	@Override
	public Service getService() {
		return new Implementation2();
	}

}