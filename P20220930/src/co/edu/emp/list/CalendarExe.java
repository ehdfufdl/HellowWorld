package co.edu.emp.list;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
//		today.set(2022, 9, 1); // 2022년 10월 1일의 요일 정보
		today.set(2020, 1, 1); // 2022년 1월 1일의 요일 정보
		System.out.println("요일정보: " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("날짜정보: " + today.get(Calendar.DATE));
		System.out.println("월정보: " + (today.get(Calendar.MONTH) + 1));
		System.out.println("월말정보: " + today.getActualMaximum(Calendar.DATE));
	}
}
