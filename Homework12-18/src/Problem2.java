import java.util.Scanner;

public class Problem2 {
	
	public static void main(String[] args) {
//		Prime Numbers
//
//		Asks the user for a number
//		If the number is divisible by 2 let the user know
		
		Scanner input = new Scanner(System.in);
		System.out.println("Can you give me a number?");
		int userInput = input.nextInt();
		//0 1 2 3 5 7 
		if(userInput % 2 == 0) {
			System.out.println("This is divisible by 2");
		}else {
			System.out.println("This is not divisible by 2");
		}
		
	}

}
