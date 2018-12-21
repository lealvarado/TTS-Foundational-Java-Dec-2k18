
public class Student extends Person{
	
	int gradYear; 
	boolean enrolled; 
	
	public Student() {
		super(firstName, lastName, age, email, level, attendance, location);
	}
	
	public int birthday() {
		//int newAge = age + 1; 
		setAge(1);
		return 2; 
	}
	
	public void enrolled() {
		enrolled = true; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student leslie = new Student();
		

	}

}
