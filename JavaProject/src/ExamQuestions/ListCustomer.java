package ExamQuestions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListCustomer {
	public static void main(String[] args) {
		String[] customers = new String[] { "john", "jack", "jacklin", "jasmine" };
		List customersList = Arrays.asList(customers);
		for (Iterator itr = customersList.iterator(); itr.hasNext();)
			System.out.println(itr.hasNext());
	}
}
