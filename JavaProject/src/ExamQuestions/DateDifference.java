package ExamQuestions;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(1984, 10, 22);
		System.out.println(date2.until(date1, ChronoUnit.YEARS));
	}

}
