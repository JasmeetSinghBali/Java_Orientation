package encapsulation;

public class EncapsulationBasics {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.setPrice(2000);

		System.out.println(l1.getPrice());
	}

	// public makes this method accessible outside this package like inside java_oops.java under default package
	public void doWork() {
		System.out.println("Replying from EncapsulationBasics");
	}

	// only accesible inside this class
	private void privateWork() {
		System.out.println("Only accesible inside this class not even in sub classes inside the same package");
	}


}

class Laptop{
	int ram;
	private int price=4000;

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	// we are making sure that the only way to change the price is via changePrice public method
	// could be the idea how the authorization works first we verify and then a/c to different access and paths we specify which user has the ability to change something via method
	public void setPrice(int price) {
		boolean isAdmin = false;
	    if( !isAdmin ) {
	    	System.out.println("You are not authorized to change price");
	    }
	    else {
	    	this.price = price;
	    }
	}

}
