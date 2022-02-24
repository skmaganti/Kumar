
public class copyVariable {
		int size = 7;
	public static void main(String[] args) {
		copyVariable c = new copyVariable();
		copyVariable cv = c;
		int i1 = 10;
		int i2 = i1;
		System.out.println(c.size+" "+i1);
		go(cv,i2);		
		System.out.println(cv.size+" "+i1);
		
	}
	
	static void go(copyVariable m, int i) {
		m.size = 8;
		i = 12;
	}

}
