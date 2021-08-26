public class Interfaces implements Car,Person {

	public static void main(String[] args) {

	}

	@Override
	public void start() {

		System.out.println("Car can drift here");
	}

	@Override
	public void userType() {
		System.out.println("Person can walk here also");

	}

}

interface Car {
	void start();
}

interface Person{
	void userType();
}
