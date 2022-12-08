package innerclasses;

import static util.Print.*;

public class Factories {
	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(Implementation1.factory);
		serviceConsumer(Implementation2.factory);
	}
}

interface Service {
	void method1();

	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {

	public void method1() {
	}

	public void method2() {
	}

	public static ServiceFactory factory = new ServiceFactory() {
		public Service getService() {
			return new Implementation1();
		}
	};
}

class Implementation2 implements Service {

	@Override
	public void method1() {
	}

	@Override
	public void method2() {
	}

	public static ServiceFactory factory = new ServiceFactory() {
		public Service getService() {
			return new Implementation2();
		}
	};
}
