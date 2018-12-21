import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice {
	
	public static void Problem1() {
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a number");
		int num1 = input.nextInt();
		System.out.println("Give me a second number");
		int num2 = input.nextInt();
		int sum = num1 + num2; 
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
		System.out.println("The sum is " + (num1 + num2));
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the cost of your dinner?");
		double dinnerAmount = input.nextDouble();
		DecimalFormat format = new DecimalFormat("0.00");
		System.out.println("The tip " + format.format(dinnerAmount * .18));
	}
}












