package ExamQuestions;

public class App {
	public static void display(String name) {
		if("null".equals(name)){
			System.out.println("Hi Jack");
		}
	}
	public static void main(String[] args) {
		display(null);
	}

}
