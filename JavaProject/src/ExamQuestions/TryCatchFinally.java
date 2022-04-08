package ExamQuestions;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
			throw new Error();
		} catch(Throwable e) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally");
		}
	}

}
