
public class Person {
	
	static String firstName; 
	protected static String lastName; 
	protected static int age; 
	protected static  String attendance; 
	protected static  String level; 
	protected static  String email; 
	protected static  String location; 
	
	public Person(String firstName, String lastName, int age, String attendance, String level, String email, String location) {
		this.firstName = firstName; 
		this.setLastName(lastName); 
		this.age = age; 
		this.attendance = attendance; 
		this.level = level; 
		this.email = email; 
		this.location = location; 
	}
	
	public void assignHomework(String homework) {
		System.out.println("Hey Leah, please do this homework: " + homework);
	}
	
	public int birthday() {
		int newAge = age + 1; 
		setAge(1);
		return newAge; 
	}
	
	public void setAge(int year) {
		this.age += year; 
//		this.age = newAge; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person leah = new Person("Leah", "McPherson", 36, "Here everyday", "IT Background", "leah@person.com", "Charlotte");
		leah.assignHomework("Practice Problems");
		System.out.println(leah.birthday());
		System.out.println(leah.age);

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
