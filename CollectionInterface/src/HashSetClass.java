import java.util.HashSet;
import java.util.Set;

public class HashSetClass {

	public static void main(String[] args) {
		Set numbers = new HashSet();
		numbers.add(new Integer(45));
		numbers.add(null);
		numbers.add(88);		
		numbers.add(789L);
		for(Object object: numbers) {
			System.out.println(object);
		}
	}

}
