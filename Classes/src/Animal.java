import anotherPackage.User;

public class Animal extends User {
	//instance variables
		// varaiables that live within your class but outside a method 
	//constructorss
		//allows an instance of your class to be created
	//local variables
		//live within methods
	//methods
		//behaviors of a class
//	String name; 
//	int age; 
//	String breed;
	

//	public void Animal() {
//		
//	}
//	
//	public void Animal(String name) {
//		this.name = name;
//	}
//	
//	public void User(String name, int age, String breed) {
//		this.name = name; 
//		this.age = age;
//		this.breed = breed;
////		name = inputName; 
////		age = inputAge;
////		breed = inputBreed;
//	}
	
	public String sound() {
		return "Roar"; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal giraffe = new Animal("Dean", 45, "girafee");
		Animal whale = new Animal();
		User user1 = new User("Leslie", 3);
		System.out.println(user1.name);
		user1.name = "not Leslie";
		user1.sayHello();
		//System.out.println(user1.getName());

	}

}

//Problem #1: Create a User Class
//I want all users to have a: 
// - name
// - age
// -location
//I want two constructors:
//- One with all three attributes
// -One with just their name and age
//-Create two instances of User














