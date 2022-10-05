package co.edu.emp.list;

import java.util.Calendar;

public class MethodCalendar {

	private static MethodCalendar instance = new MethodCalendar();

	private MethodCalendar() {
	}

	public static MethodCalendar getInstance() {
		return instance;
	}

	public void makeCal(int year, int month) {
		System.out.println("           -" + year + "년" + month + "-     ");
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		// 요일 출력.
		for (String day : days) {
			System.out.printf("%4s", day);
		}
		System.out.println();

		// 1일의 위치지정.
		for (int i = 0; i < getFirstDay(year, month); i++) {
			System.out.printf("%4s", " ");
		}
		// 날짜 출력.
		for (int i = 1; i <= getLastDate(year, month); i++) {
			System.out.printf("%4d", i);
			if ((i + getFirstDay(year, month)) % 7 == 0) {
				System.out.println();
			}
		}
	} // end of makeCal()
	
	
	public int getFirstDay(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		return cal.get(Calendar.DAY_OF_WEEK) - 1;

//		if(month == 9) {
//			return 4;
//		}else if(month == 8) {
//			return 1;
//		}else if(month == 7) {
//			return 5;
//		}else if(month == 6) {
//			return 3;
//		}else {
//			return 0;
//		}
	}// end of getFirstDay()

	public int getLastDate(int year, int month) {
		// switch..case..구문.
		Calendar cal = Calendar.getInstance();
		cal.set(year, month -1, 1);
		return cal.getActualMaximum(Calendar.DATE);
		
//		switch (month) {
//		case 9:
//			return 30;
//		case 8:
//			return 31;
//		case 7:
//			return 30;
//		case 6:
//			return 30;
//		default:
//			return 30;
//
//		}
	}
} // end of class.
