import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String firstName = input.nextLine();
		System.out.println("Give me an adverb");
		String adverb = input.nextLine();
		System.out.println("Give me an adjective");
		String adjective = input.nextLine();
		System.out.println("Give me a noun:");
		String noun = input.nextLine();
		System.out.println("Give me another noun");
		String anotherNoun = input.nextLine();
		System.out.println("Give me a number");
		String number = input.nextLine();
		System.out.println("What is another name");
		String anotherName = input.nextLine();
		
		System.out.println("Dear " + firstName + "\n You are " + adverb + " " + adjective + " and I want to be your " + noun + " ! I want to go to the " + anotherNoun +" with you in " + number +" days.  \n" + "\n" + " Sincerely " + anotherName);
		 

	}

}
