import java.util.LinkedList;
import java.util.Queue;

public class DataStrucutresII {
	
	public static void linkedlist() {
		LinkedList<String> animalList = new LinkedList<String>();
		//This is how you add elements to a list
		animalList.add("frog");
		animalList.add("elephant");
		animalList.add("jellyfish");
		animalList.add("whale");
		
		System.out.println(animalList);
		//Has these two specific methods that add to the front and end of the list
		animalList.addFirst("shark");
		animalList.addLast("cuttlefish");
		
		System.out.println(animalList);
		//Two ways to remove: By Index and by element value
		animalList.remove(1);
		animalList.remove("elephant");
		System.out.println(animalList);
		
		animalList.removeFirst();
		animalList.removeLast();
		System.out.println(animalList);
	}
	
	public static void notQueue() {
		// [ a, b, c, d, e, f] Adds to back, and removes from the front 
		
		Queue<String> firstQueue = new LinkedList<String>();
		firstQueue.add("Hello");
		firstQueue.add("How are you?");
		firstQueue.add("I am doing fine thanks for asking");
		firstQueue.add("Today is Tuesday!");
		System.out.println(firstQueue);
		System.out.println(firstQueue.remove()); //return "Hello"
		System.out.println(firstQueue);
		System.out.println(firstQueue.remove()); //return "How are you"
		System.out.println(firstQueue);
		
		for(int i = firstQueue.size(); i > 0; i--) {
			System.out.println(firstQueue.remove());
		}
	}
	
	public static void main(String[] args) {
		//linkedlist();
		notQueue();
		
	}

}
