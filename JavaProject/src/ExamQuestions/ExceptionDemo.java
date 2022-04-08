package ExamQuestions;

public class ExceptionDemo {
	static class Car implements AutoCloseable{
		public void close() {
			System.out.println("Car door close");
			throw new RuntimeException();
		}
	}
	public static void main(String[] args) {
		try {
			Car car = new Car();
			System.out.println("try block");
		} catch(Exception e) {
			System.out.println("catch exception");
		} finally {
			System.out.println("finally");
		}
	}

}
