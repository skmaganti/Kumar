package ExamQuestions;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeTester {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.of(2020, 12, 12, 21, 45);
		System.out.println(localDateTime.get(ChronoField.DAY_OF_MONTH)+localDateTime.getMinute());
	}

}
