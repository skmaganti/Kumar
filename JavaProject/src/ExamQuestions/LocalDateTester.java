package ExamQuestions;

import java.time.LocalDate;

public class LocalDateTester {

	public static void main(String[] args) {
		LocalDate local = LocalDate.of(2020, 3, 30);
		local = local.minusWeeks(-4L);
		System.out.println(local);
	}

}
