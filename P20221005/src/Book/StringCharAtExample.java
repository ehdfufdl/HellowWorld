package Book;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-2230123";
		char sex = ssn.charAt(7); // 7번째 인덱스의 수
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자입니다."); // 7번째 인덱스의 숫자가 1 또는 3이면 남자
			break;
		case '2':
		case '4':
			System.out.println("여자입니다."); // 7번째 인덱스의 숫자가 2 또는 4이면 여자
			break;
		}
	}
}
