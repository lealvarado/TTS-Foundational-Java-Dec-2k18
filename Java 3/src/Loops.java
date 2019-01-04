import java.util.Scanner;

public class Loops {
	
	public static void iCan() {
		for(int i = 0; i < 5; i++) {
			System.out.println("I think I can");
		}
		
		int count = 0; 
		for(int i = 0; i < 10; i++) {
			count = i * i; 
			System.out.println(count);
		}
	}
	//OUtput for problem 2 
	//0
	//1
	//4
	//9
	//16
	//25
	//36
	//49
	//64
	//81
	
	public static void forLoop() {
		int sum = 0; 
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			sum += i; 
		}
		System.out.println(sum);
		
		
	}
	
	//break - ends code 
	//continue - 
	public static void whileLoop() {
		int number = 0; 
		while(number < 5) {
			if(number == 0) {
				continue;
			}else {
				System.out.println(number);
			}
			
		}
		System.out.println("hello");
	}
	
	public static void dowhile() {
		int count = 10; 
		int limit = 8; 
		
		do {
			limit++;
			System.out.println("Hello");
		}while(limit < count);
	}
	
	public static void doubles() {
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a number between 0 and 10");
		int number = input.nextInt();
		while(number <= 10) {
			System.out.println(number *2); 
			number++;
		}
		
	}
	
	public static void please() {
		Scanner input = new Scanner(System.in);
		System.out.println("Can we go to Disney World?");
		String answer = input.nextLine();
		while(answer.equalsIgnoreCase("no")) {
			System.out.println("Pretty, pretty please???");
			answer = input.nextLine();
		}
		System.out.println("YESSSS!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//doubles();
		//please();
		//forLoop();
		//iCan();
		whileLoop();
		
		//Problem 1 - User input = 3 
		//6
		//8
		//10
		//12
		//14
		//16
		//18
		//20

	}

}
