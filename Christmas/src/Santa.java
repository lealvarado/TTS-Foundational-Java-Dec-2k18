
public class Santa {
	
	private String name; 
	private int age; 
	private String location; 
	
	public Santa() {
		
	}
	
	public Santa(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	
	public Santa(String name, int age, String location) {
		this.name = name; 
		this.age = age; 
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public boolean isJolly() {
		return true; 
	}
	
	public String hoHoHo() {
		return "HO HO HO....Merry Christmas to all and to all a good night!";
	}

}
