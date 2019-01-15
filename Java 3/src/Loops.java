import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
			
			System.out.println(number); 
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
	
	public static void loopingCollections() {
		String[] fruitList = new String[3];
		fruitList[0] = "apple";
		fruitList[1] = "pear"; 
		fruitList[2] = "peach"; 
		
		System.out.println(fruitList[0]);
		System.out.println(fruitList[1]);
		System.out.println(fruitList[2]);
		System.out.println("About to enter the for loop");
		
		for(int i = 0; i < fruitList.length; i++) {
			System.out.println(fruitList[i]);
			//first go around i = 0, so we're going to be looking at fruitList[0]
			//second go around i = 1, so we're going to be looking at fruitLsit[1]
			//third go around i = 2, so we're going to be looking at fruitList[2]
		}
		
		for(String fruit : fruitList) {
			System.out.println(fruit);
		}
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Leslie");
		name.add("Zack");
		name.add("Sean");
		name.add("Chris");

		for(int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}
		
		for(String person : name) {
			System.out.println(person);
		}
		
	}
	
	public static void hashMaps() {
		HashMap<String, Integer> myPeople = new HashMap<String, Integer>();
		myPeople.put("Leslie", 25);
		myPeople.put("Chris", 55);
		myPeople.put("Steve", 10);
		
		for(Map.Entry<String, Integer> entry : myPeople.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + ": " + value);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loopingCollections();
		hashMaps();
		//doubles();
		//please();
		//forLoop();
		//iCan();
		//whileLoop();
		
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
