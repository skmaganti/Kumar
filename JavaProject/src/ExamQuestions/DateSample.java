package ExamQuestions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateSample {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(2020, 06, 7, 1, 1, 1).plusHours(30);
		System.out.println(dateTime);
		DateTimeFormatter formatterPattern = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String str = dateTime.format(formatterPattern);
		System.out.println(str);		
	}

}
