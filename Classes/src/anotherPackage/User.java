package anotherPackage;

public class User {
	private String name; 
	private int age;
	private String location;
	
	public User(String name, int age, String location) {
		this.name = name; 
		this.age = age;
		this.location = location;
	}
	
	public User(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("Hello my name is" + name);
		if(this.is21()) { // is21() is going to be equal to true or false
			//is21() = true or is21() = false
			System.out.println("I am older than 21.");
		}else {
			System.out.println("I am not 21 but that's okay, this is Europe.");
		}
	}
	
	private boolean is21() {
		if(age >= 21) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User eliza = new User("Eliza", 5);
		User user1 = new User("Leslie", 3, "Charlotte");
		System.out.println(user1.name);
		user1.sayHello();
		System.out.println(eliza.is21());
		eliza.is21();
	}
	
	
	

}

//Create a Pet Class
	// - name (PRIVATE)
	// -age (PRIVATE)
	// - location (PRIVATE)
	// - type (PRIVATE)
// two constructors
	// - empty
	// - all attributes 
//Code to be able to access the following: 
	// - name
	// - age
	// - type
//Code to be able to change: 
	//- name 
	// - age
	// - location








