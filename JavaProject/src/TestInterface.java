@FunctionalInterface
public interface TestInterface {
	public void test();
	default void testDefault() {
		System.out.println("Default method");
	}
}
