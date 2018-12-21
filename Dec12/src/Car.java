
public class Car {
	
	private int totalMileage; 
	private int milesForward;
	private int milesBackward;
	
	public Car(int totalMileage, int milesForward, int milesBackward) {
		this.totalMileage = totalMileage;
		this.milesForward = milesForward;
		this.milesBackward = milesBackward;
	}

	public int getTotalMileage() {
		return totalMileage;
	}

	public int getMilesForward() {
		return milesForward;
	}

	public void setMilesForward(int milesForward) {
		this.milesForward = milesForward;
	}

	public int getMilesBackward() {
		return milesBackward;
	}

	public void setMilesBackward(int milesBackward) {
		this.milesBackward = milesBackward;
	}
	
	public void Drive(int miles) {
		System.out.println("This car has driven " + miles + " miles forward");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car oscar = new Car(13000, 0, 0);
		oscar.Drive(40);

	}

}
