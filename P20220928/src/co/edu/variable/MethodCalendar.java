package co.edu.variable;

public class MethodCalendar {

	public static void main(String[] args) {
		makeCal(); // ȣ��.
	}
	
	public static void makeCal(input) {
		String[] days = {"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		//���� ���.
		for(String day : days) {
			System.out.printf("%4s",day);
		}
		System.out.println();
		
		//1���� ��ġ����.
		for(int i=0; i< getFirstDay(8); i++) {
			System.out.printf("%4s", " ");
		}
		//��¥ ���.
		for(int i=1; i<=getLastDate(8); i++) {
			System.out.printf("%4d", i);
			if((i + getFirstDay(8)) % 7 == 0) {
				System.out.println();
			}
		}
	} // end of makeCal()
	
	public static int getFirstDay(int month) {
		if(month == 9) {
			return 4;
		}else if(month == 8) {
			return 1;
		}else {
			return 0;
		}
	}// end of getFirstDay()
	
	public static int getLastDate(int month) {
		// switch..case..����.
		switch(month) {
		case 9:
			return 30;
		case 8:
			return 31;
		case 7:
			return 30;
		case 6:
			return 30;
		default:
			return 30;
			
		}
	}
} // end of class.
