package ExamQuestions;

public class Employee {
	private double salary = 15000.0;
	
	public double getSalary(int salary) {
		return salary;
	}
	public static void main(String[] args) {
		Employee employee = new Employee();
		double result = employee.getSalary(23000);
		System.out.println(result);
	}

}
