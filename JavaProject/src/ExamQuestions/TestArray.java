package ExamQuestions;

public class TestArray {
	String[] arr = {"Infy","java","ETA"};
	public void show() {
		for(int i = 0;i <arr.length;i++) {
			if(arr[i].length()==4&&arr[i].equals("java"))
				System.out.println("Name of a language");
				else
				System.out.println("Language not found");
			}
		}
	public static void main(String[] args) {
		TestArray t = new TestArray();
		t.show();
	}

}
