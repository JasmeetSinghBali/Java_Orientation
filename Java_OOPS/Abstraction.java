public class Abstraction {

	public static void main(String[] args) {
		Audi a1 = new Audi();
		a1.start();
		BMW b1 = new BMW();
		b1.start();


	}
}

	class Audi extends Car{

		@Override
		void start() {
			System.out.println("Audi Bought!!");
		}

	}

	class BMW extends Car{

		@Override
		void start() {
			System.out.println("BMW Bought!!");
		}

	}

	abstract class Car {
		String model;
		int price;

		abstract void start();
	}
