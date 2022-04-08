package ExamQuestions;

public class App1 {
	
	public static void main(String[] args) {
		String s1 = new String("smart"); //one object is created in heap and one object in SCP area
		String s2 = s1;
		if(s1==s2) {
			System.out.println("==smart");
		}
		if(s1.equals(s2)) {
			System.out.println("equals.smart");
		}
	}

}
