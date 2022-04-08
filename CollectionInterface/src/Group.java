import java.util.TreeSet;

public class Group extends TreeSet{

	public static void main(String[] args) {
		Group g = new Group();
		g.add(new Person("Hans"));
		g.add(new Person("Jane"));
		g.add(new Person("Hans"));
		System.out.println("Total: "+g.size());
	}
	
	public boolean add(Object o) {
		System.out.println("Adding: "+o);
		return super.add(o);
	}

}
