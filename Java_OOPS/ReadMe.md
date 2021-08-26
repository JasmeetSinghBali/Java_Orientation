# Java OOPS

- ****OOPS helps in solving real-life problems effectively.****

### Classes

****Classes create a blueprint for an entity and this blueprint can be further used to make multiple copy of the entity.****

                # Example a Person class blueprint with two properties name and age.

                class Person{
                  String name;
                  int age;
                }

****Note multiple objects can be made for a single blueprint/class and each object occupy its unique  memory space.****


----
### Objects

****Blueprint only depicts how a particular goal can be achieved to actually implement this blueprint/class we need objects that helps in allocating memory to different properties associated to the class****

            Person p1 = new Person();
            Person p2 = new Person();

            # both p1 and p2 are instances of same blueprint Person but they are present at different location in memory

****Note - Each unique object occupies different memory space****

--------

### Properties & Behaviours in class

                  # here name ,age are properties of the class/blueprint

                  class Person{
                    String name;
                    int age;
                  }

                  # here walk is a method of the Person class accessible by the instance/object of the Person class

                  class Person{
                    String name;
                    int age;

                    void walk(){
                      System.out.println(name+ " is walking");
                    }

                  }

-----

### Constructors

****when we create a new object of a class we are doing it with the help of default constructor****


              # my_class_name() is a constructor

              my_class_name yourobj = new my_class_name();

****constructors returns an object in above line my_class_name() constructor returns a yourobj object.****


### Static keyword in class

****Static keyword in class makes it possible to access class properties outside the class without the use of an object****

### this keyword

- [x] ****Helps in calling one constructor when inside of the scope of another constructor.****

- [x] ****this can be used to prevent same name conflicts so as to define that we are reffereing to the property of current class.****


### Inheritance

****when we want to inherit the behaviours,properties from a parent class into child class to ensure code reusability and minimize repetition.****

            class childClass extends parentClass{

            }

#### super keyword

****used inside of the child class & calls the constructor of the parent class.****

### Super vs this

****this keyword is used to access current class constructor and properties****

****super keyword is used to access parent class constructor and properties****

### Object class in Java

****Object class is the parent of all the class programmer creates. and every object can access the object class****

-----
### IMPORTANT
####  every object first look for the method or properties inside itself before going to the parent class so if we define a method or property that is already defined inside of parent then when we create a object for child class the the object of child class will refer the method or property define itself over the parent class refer the Dev sleep method in java_oops.java

----


### Encapsulation

****Data hiding or Data Protection****

## Encapsulating the methods and props as a single unit + packages + access modifiers

              1.) create a new package make sure it starts with lowercase inside eclipse.

              2.) then make a class inside that package.

### IMPORTANT

- [x] ****public -> methods and props available to everyone.****

- [x] ****private -> methods and props available inside the same class excluding the child classes & other classes****

- [x] ****protected -> methods and props available to only itself and its childs even if its child are in diffrent package the protected parent class methods and props will be accesible by the child class in diffrent package.****


### IMPORTANT Eclipse Generate get and set methods right click on the selected prop you want to generate setter and getter methods-> source->generate getter and setter.

------

### Abstraction

****The idea is to hide low level complexity how the process is being done for a end user they are only concerned with the output and do not cares how the process is executed behind the scenes and what sort of depth and tech goes behind the scenes****

****Example - ATM machine , Coffee  making machine****

#### Abstraction can be achieved by abstraction and interfaces.

****abstract keyword is prefixed for the class which is only responsible for the blueprint i.e concept of a real world problem and if we were to make a object of this class it wont be logical or any help example a class Car which has child class BMW and Audi.****

****abstract class and methods are not concerned about how the method will be implemented****


****Note - > To make a method/function abstract its class must be abstract first****


### abstract vs interfaces

****interface class by default has public and abstract methods inside of it even if we dont mention it explicitely.****

****IMPORTANT we can have both abstract and normal methods/concrete functions when using abstract keyword while we cannot define body or make concrete function once the class is specified as interface****


### Multiple Inheritance & interfaces

****Java do not allows that one class has more than  one parent****

****interfaces overcomes the java limitation so that we can make multiple interfaces and implement them in a single child class****
