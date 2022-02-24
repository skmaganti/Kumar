public class Example {

	public static void main(String[] args) {
		int a = 1;
		Rectangle r = new Rectangle(5,10);
		Rectangle copyValue = r;
		Example example = new Example();
		example.modify(a);
		System.out.println("Before r.getBreadth() = "+r.getBreadth());
		example.xyz(r);
		System.out.println("After r.getBreadth() = "+r.getBreadth());
		r = new Rectangle(30,30);
		System.out.println("r.getBreadth() = "+r.getBreadth());
		System.out.println("copyValue = "+copyValue.getBreadth());
		System.out.println("a = "+a);
	}
	private void xyz(Rectangle value) {
		value.setBreadth(100);
	}
	public void modify(int a) {
		a = a+1;
		System.out.println("a = "+a);
	}
}
