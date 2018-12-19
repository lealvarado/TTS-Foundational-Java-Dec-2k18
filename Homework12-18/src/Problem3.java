import java.util.Scanner;

public class Problem3 {
	
	public static void main(String[] args) {
		//Rock, paper, scissors!
//		Asks for player one’s move
//		Asks for player two’s move
//		Declares the winner!
		
		Scanner input = new Scanner(System.in);
		System.out.println("Rock, Paper, or Scissors?");
		String userInput = input.nextLine();
		System.out.println("User 2 Same question?");
		String user2Input = input.nextLine();
		String computer = "Rock";
		
		
		if(userInput.equalsIgnoreCase(user2Input)) {
			System.out.println("It's a tie!");
			//if our user1 & user2 input is the same (meaning they picked the same object, then it's a tie
		}else if(userInput.equalsIgnoreCase("paper")) { // if (userInput == paper)
			//This bunch of code will ONLY happen if the first if is false and if User1 chose paper
			if(user2Input.equalsIgnoreCase("scissors")) {
				//if User1 chose paper & user2 chose scissors do this:
				System.out.println("User 2 wins");
			}else {
				//Otherwise that means that User 2 chose rock, and paper beats rock so:
				System.out.println("User 1 wins!");
			}
		}else if(userInput.equalsIgnoreCase("rock")) {
			if(user2Input.equalsIgnoreCase("scissors")) {
				System.out.println("User 1 wins");
			}else {
				System.out.println("User 2 wins");
			}
		}

	}

}
