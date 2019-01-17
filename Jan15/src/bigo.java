
public class bigo {
	
	//Big O Notation - describes performance or complexitiy of code
	//Assume the worst case scenario
	//Looks at extremes
	
	public static void constant() {
		//O(1) - any code that will always use the same amout of space, regardless of how big the input is 
		String name = "Leslie";
		//the time complexity of the line above is O(1)
		System.out.println("Hello" + name); 
		//O(1)
		System.out.println("Hello");
		
		int num = 5; //O(1)
		
		if(num == 5) { //O(1)
			System.out.println("Hello");//O(1)
		}else{
			System.out.println("Goodbye"); //(O(1)
		}
		//O(3) is the time complexity -> Minimized to O(1)
	}
	
	//ANother example of O(1) 
	public static String getName(String[] names) {
		return names[0];
	}
	//Let's talk about O(n)
	public static void ofN() {
		//Unlike O(1) which doesn't care what your input is, O(n) cares a lot because the n is the amount of input. 
		//The bigger your n gets the more space and memory you're going to need and you're going to use
		String[] stringArray = new String[] { "Leslie", "John", "Mary", "Zack", "Doc", "Jane" };
		
		int n = 10; 
		for(int i = 0; i < stringArray.length; i++) {
			if(stringArray[i].equals("Dom")) {
				System.out.println("Hello");
				//Other complicated code
			}else {
				System.out.println("Bye");
			}
	
		}
	}
	
	public static void littleNest() {
		int n = 50; 
		//O(n^2)
		for(int i = 0; i <= n; i++) {
			for(int j= 0; j <= n; j++) {
				System.out.println("The sum of " + i + " and " + j + " is " + (i +j));
				
			}
		}
	}
	
	public static void twoN() {
		int n = 10; 
		for(int i = 1; i <= Math.pow(2, n); i++) {
			System.out.println("The number of time is: " + i);
		}
		for(int i = 1; i <= Math.pow(2, n); i++) {
			System.out.println("The number of time is: " + i);
		}
	}
	
	public static void logN() {
		int n = 8; 
		//O(log(n)) = log(8) = 3
		//O(n(log(n)) = 8 * log(8) = 24
		for(int i = 1; i < n; i = i * 2) {
			System.out.println(i);
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logN();
	}

}
