import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		//Ask the user for their mood for the day, then: 
		//Print the length of the string they return
		//Print the string with 'I remember when I was' prepended to it
		//For example, if I was the User and I typed "Sleepy". The following would be printed out
		//6 
		//I remember when I was Sleepy
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your mood like today?");
		String mood = input.nextLine();
		int length = mood.length(); //length of your mood
		System.out.println(length);
		System.out.println("I remember when I was " + mood);



	}

}
