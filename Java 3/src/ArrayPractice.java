import java.util.ArrayList;

public class ArrayPractice {
	
	public static void firstArrayList() {
		ArrayList<Integer> first = new ArrayList<Integer>();
		ArrayList<String> names = new ArrayList<String>();
		//{ 0, 0, 0} 
		first.add(1);
		first.add(0, 5);
		first.add(4);
		first.add(3);
		first.add(9);
		first.add(6);
		//first.get(1);
		System.out.println(first);
		first.remove(4);
		System.out.println(first);
		System.out.println(first.contains(3));
		System.out.println(first.indexOf(4));
		first.size();
	}
	
	public static void firstArray() {
		String[] fruit; //Declaring
		fruit = new String[5];
		//[ hello, this, is, an ] 
		//[0, 1, 2, 3, 4]
//		String firstName = "Leslie"; 
//		System.out.println(firstName.charAt(3)); 
		fruit[0] = "apple";
		fruit[1] = "pear";
		fruit[2] = "plum";
		fruit[3] = "pineapple"; 
		fruit[4] = "mango";
		//[ apple, pear, plum, pineapple, mango ]
		System.out.println(fruit);
		System.out.println(fruit.length);
		System.out.println(fruit[0]);
	}
	

	public static void main(String[] args) {
		firstArray();
		firstArrayList();

	}

}
