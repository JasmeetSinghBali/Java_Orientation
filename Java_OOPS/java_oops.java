import encapsulation.EncapsulationBasics;

public class java_oops {

	public static void main(String[] args) {
		System.out.println("Welcome to the OOPS World");

		// creating instance/object named as p1 of the Person blueprint/class
//		Person p1 = new Person();
//		p1.age = 38;
//		p1.name= "John Wick";

		// here Person() is a default constructor that returns object p2
		// default constructor do not takes any arguments
//		Person p2 = new Person();
//		p2.age = 7;
//		p2.name = "Dugo";

//		System.out.println("====Persons created via Person class/blueprint====");
//		System.out.println(p1.age+":"+p1.name);
//		System.out.println(p2.age+":"+p2.name);

		// methods / behaviour
//		System.out.println("===calling eat and sleep method of Person class====");
//		p1.eat();
//		p2.sleep();
//		p1.sleep();
//		p2.eat();

		// calling paramterized sleep methods
		// polymorphism more than one form of sleep() method one non-parameterized and one parameterized
		// compile time polymorphism(method overloading) use ctrl + click to see which method will be called for which line.
//		System.out.println("===calling sleep parameterized/overloaded method of Person class===");
//		p1.sleep(8);
//		p2.sleep(30);

		// accesing static count of Person class
		//System.out.println(Person.count);

		// parameterized constructor calling
//		Person p3 = new Person("Jason Mamoa",34);
//		System.out.println("===Parameterized constructor calling i.e initialize value for class properties at the time of object creation====");
//		System.out.println(p3.age+":"+p3.name);

		// Developer type Person object
//		Dev dev1 = new Dev("Thor",1520);
//		System.out.println("===I am inside Dev child class ,Inherited props from Person===");
//		System.out.println(dev1.name);
//		System.out.println(dev1.age);
//		dev1.eat();

		// runtime polymorphism
		// when this line executes it determines at run time which form of sleep to execute either the sleep method inside it or the sleep method in its parent class.
		// by default sleep() method defined inside of it is preffered over parent class sleep() method.
//		dev1.sleep();

		// accessing the doWork method inside encapsulation package
		EncapsulationBasics obj = new EncapsulationBasics();
		obj.doWork();

	}

}

// Dev child class Inheritance from Person parent class
class Dev extends Person{

	public Dev(String name, int age) {
		// since we have a parametrized constructor in parent Person class it becomes compulsary to make a constructor in the child class
		super(name, age);

	}

	//run time polymorphism
	void sleep() {
		System.out.println("Dev " + name + " needs to sleep more");
	}


}

class Person {

	// properties
	protected String name;
	protected int age;

	// static keyword defines this property is of class not object means we can directly access this property outside the class.
	static int count=0;


	// to check wheather default Person constructor is called or not
//	public Person() {
//		count++;
//		System.out.println("Person() Constructor is called: "+count+" rd time");
//	}

	// parameterized constructor
	// constructor overloading
	public Person(String name,int age) {
		// this here calls the Person() unparameterized constructor for the count increment and the console print statement rather than using a seprate count2 variable or print statement
		//this();
		// here this.name and this.age means we are reffering to the name and age of the class Person
		this.name = name;
		this.age = age;
	}

	// method/behaviours/functionality/function
	void sleep() {
		System.out.println(name + " is sleeping");
	}

	// method/behaviours/functionality/function
	void eat() {
		System.out.println(name + " is eating");
	}

	// Methods can take arguments like
	void sleep(int duration) {
		System.out.println( name +" slept for:"+ duration + " hrs" );
	}

}
