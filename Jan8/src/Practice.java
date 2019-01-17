import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Practice {
	
	public static void problem1() {
		String[] animalList = new String[5];
		animalList[0] = "zebra";
		animalList[1] = "dog";
		animalList[2] = "cat";
		animalList[3] = "elephant";
		animalList[4] = "bird";
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("zebra");
		animals.add("dog");
		animals.add("cat");
		animals.add("elephant");
		animals.add("bird");
		
		String favorite = "whale";
		if(animals.contains(favorite)) {
			System.out.println("That animal is my favorite!");
		}else {
			System.out.println("I don't really like any of those animals.");
		}
		
		for(String x : animals) {
			if(favorite.equals(x)) {
				System.out.println("That animal is my favorite!");
			}else {
				System.out.println("I don't really like " + x + "s");
			}
		}
		
		
		
	}
	
	public static void problem2() {
		HashMap<String, String> facts = new HashMap<String, String>();
//		THIS CODE IS HOW YOU WOULD TAKE INPUT AND USE IT IN HASH MAP ENTRY CREATION
//		Scanner input = new Scanner(System.in);
//		System.out.println("What is your name?");
//		String name = input.nextLine();
//		facts.put("Name", name);
		facts.put("Name", "Leslie");
		facts.put("Color", "Teal");
		facts.put("Age", "25");
		facts.put("Hometown", "Naples");
		facts.put("favorite food", "french fries");
		
		HashMap<String, String> facts2 = new HashMap<String, String>();
		facts2.put("Name", "Leslie");
		facts2.put("Color", "Teal");
		facts2.put("Age", "25");
		facts2.put("Hometown", "Naples");
		facts2.put("favorite food", "french fries");
		
		HashMap<String, String> facts3 = new HashMap<String, String>();
		facts3.put("Name", "Not Leslie");
		facts3.put("Color", "Purple");
		facts3.put("Age", "12");
		facts3.put("Hometown", "CLT");
		facts3.put("favorite food", "pie");
		ArrayList<HashMap> myPeopleFacts = new ArrayList<HashMap>();
		myPeopleFacts.add(facts);
		myPeopleFacts.add(facts2);
		myPeopleFacts.add(facts3);
		//[{Name -> Leslie, Color -> Teal......}, {Name -> /.....}, {Name......}]
		
		for(int i = 0; i < myPeopleFacts.size(); i++) {
			System.out.println(myPeopleFacts.get(i).get("Color"));
			System.out.println("This is " + myPeopleFacts.get(i).get("Name") + " her favorite color is " + myPeopleFacts.get(i).get("Color") + "She is " + myPeopleFacts.get(i).get("Age") + "-years old. Her hometown is " + myPeopleFacts.get(i).get("Hometown") + " and her favorite food is " + myPeopleFacts.get(i).get("favorite food"));
		}
		
		
//		for(Map.Entry<String, String> entry : facts) {
//			
//		}
	}
	
	public static void problem3() {
//		Create an ArrayList with the following requirements:
//			Add 10 non-consecutive numbers into the ArrayList
//			Hint: Google Random number generator Java
//			Or just do it by hand
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		
		Random rand = new Random();
		int number = rand.nextInt(100) + 1;
		System.out.println(number);
		for(int i = 0; i < 10; i++) {
			myNums.add(number);
			number = rand.nextInt(100) + 1;
		}
		System.out.println(myNums);
		
		Integer[] myNumArray = new Integer[10];
		int counter = 0;
		for(int num : myNums ) {
			myNumArray[counter] = num;
			System.out.println(myNumArray[counter]);
			///the firs go around we're looking at myNumArray[0]
			//the second time we're looking at myNumArray[1]
			counter++;
		}
		System.out.println(counter);
		System.out.println(myNumArray[counter - 1]);
	}
	
	public static void problem4() {
		
		Queue<Integer> myQueue = new LinkedList<Integer>();
		//10, 29, 5, 193, -15, 0, 78, -6, 75
		myQueue.add(10);
		myQueue.add(29);
		myQueue.add(5);
		myQueue.add(193);
		myQueue.add(-15);
		myQueue.add(0);
		myQueue.add(78);
		myQueue.add(-6);
		System.out.println(myQueue.peek());
		myQueue.add(75);
		myQueue.isEmpty(); //return a true if the queue is empty 
		myQueue.add(56);
		System.out.println(myQueue.remove());
		System.out.println(myQueue.peek());
		
	}
	
	public static void problem5() {
		Stack<Integer> myStack = new Stack<Integer>();
		// 1, 2, 4, 9, 6, 3, 0, -3
		myStack.push(1);
		myStack.push(2);
		myStack.push(4);
		myStack.push(9);
		myStack.push(6);
		myStack.push(3);
		myStack.push(0);
		myStack.push(-3);
		System.out.println(myStack.pop());
		//myStack.push(123);
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
	}
	
	public static void main(String[] args) {
		problem5();
	}

}
