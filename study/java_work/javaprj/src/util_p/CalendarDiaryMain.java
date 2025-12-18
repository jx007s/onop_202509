package util_p;

import java.util.Calendar;
import java.util.Date;

public class CalendarDiaryMain {

	public static void main(String[] args) {
		
		Date now = new Date(2025-1900,12-1,19);
		
		Calendar today = Calendar.getInstance();
		
		int last = today.getActualMaximum(Calendar.DATE);
		today.set(Calendar.DATE, 1);
		int first = today.get(Calendar.DAY_OF_WEEK);
		
		for (int i = 1; i <first; i++) {
			System.out.print("\t");
		}
		
		
		for (int i = 1; i <=last; i++) {
			today.set(Calendar.DATE, i);
			System.out.print(i+"\t");
			if(today.get(Calendar.DAY_OF_WEEK)==7) {
				System.out.println();
			}
		}

	}

}
