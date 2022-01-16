
public class TestPrimitives {

	public static void main(String[] args) {
		TestPrimitives t = new TestPrimitives();
		t.m1(20, (float) 20.7);
	}
	public void m1(int i, float f)
	{
		System.out.println("int float method");
	}
	public void m1(float f, int i)
	{
		System.out.println("float int method");
	}

}
