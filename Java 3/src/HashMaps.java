import java.util.HashMap;

public class HashMaps {
	
	public static void firstHash() {
		HashMap<String, Integer> person = new HashMap();
		person.put("Leslie", 25);
		person.put("Anna", 25);
		person.put("John", 45);
		System.out.println(person.get("Leslie"));
		person.remove("Anna");
		System.out.println(person.containsKey("Liz"));
		System.out.println(person.containsValue(65));
		person.put("Leslie", 78);
		System.out.println(person);
		//{ [Leslie -> 25]}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstHash();

	}

}
