import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
	
	public static void main(String[] args) {
		problem2();
	}

}
