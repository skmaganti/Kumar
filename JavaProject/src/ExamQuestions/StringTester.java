package ExamQuestions;

public class StringTester {

	public static void main(String[] args) {
		String str1 = null;
		String str2 = new String("null");
		System.out.println("null".equals(str1));
		System.out.println("null".equals(str2));
		System.out.println(str1.equals(null));
	}

}
