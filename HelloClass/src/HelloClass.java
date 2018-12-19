import java.util.Scanner;

public class HelloClass {

	public static void main(String[] args) {
//		System.out.println("hello");
//		System.out.print("Class \n");
//		System.out.println("How are we?");
//		
//		String myFirstName = "Leslie";
//		
//		System.out.println(myFirstName);
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("What is your name?");
//		String firstName = input.nextLine();
//		System.out.println("Hello " + firstName + " \n I hope you're having a good day.");
		
		//whole numbers
		int total = 65;
		
		//default data type for non-whole numbers
		// or a float, or a short, byte, long
		double tax = .65;
		
		//boolean = true or false
		boolean isTodayThursday = true;
		
		//character used to store any one letter, number, punctuation 
		char letter = 'a';
		
		String firstName = "Leslie";
		firstName.charAt(0); //return L
		
		//arithemtic 
		// + - addition
		// - subtraction 
		// / division
		// * multiplication
		// % modulus 
		// When mixing number types. 
		//Add an integer and a double - return a double
		//Math with other integers returns integers 
		//Math with anything more precise returnss the precision number
		
		int num1 = 2; 
		int num2 = num1 + 1;
		num1 = num1 + 1; 
		num1++; //add one to num1
		num1--; //subtract one from num1
		
		num1 += num2; // num1 = num1 + num2
		num1 *= num2; //num1 = num1 * num2
		num1 -= num2; //num1 = num1 - num2
		num1 /= num2; //num1 = num1/num2
		System.out.println(3/2);
		
		//%
		
		System.out.println(36 % 2);
		
		// Conditional 
		// == - Equals
		// != - Does Not Equal
		// < Less than
		// > Greater than
		// <= Less than or Eqaul to 
		// >= Greater than or equal to 
		int number = 7; 
		if(number != 5) {
			System.out.println("Your number is not 5!");
			// code that will happen if the condition is true
		}else {
			System.out.println("Your number is  5.");
			//code that will happen if the condition is false
		}
		
		String greeting = "Hello";
		String farewell = "Goodbye"; 
		
		if(greeting.equals(farewell)) {
			System.out.println("Hello and Hello");
			
		}else {
			System.out.println("Hello and Goodbye");
			sot	
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
