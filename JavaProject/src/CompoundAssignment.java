
public class CompoundAssignment {
	
	public static void main(String[] args) {
	int x=5;
	long y=7L;
	//x = x*y; //does not compile
	x *= y;
	System.out.println(x); //compiler will automatically cast the variable
	}
}
