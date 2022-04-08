import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<Integer,Integer> myMap = new HashMap<Integer, Integer>();
		myMap.put(1001, 5);
		myMap.put(1002, 8);
		myMap.put(1002, 5);
		myMap.replace(1002, 5,100);
		System.out.println(myMap);
	}

}
