package Book;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-2230123";
		char sex = ssn.charAt(7); // 7��° �ε����� ��
		switch(sex) {
		case '1':
		case '3':
			System.out.println("�����Դϴ�."); // 7��° �ε����� ���ڰ� 1 �Ǵ� 3�̸� ����
			break;
		case '2':
		case '4':
			System.out.println("�����Դϴ�."); // 7��° �ε����� ���ڰ� 2 �Ǵ� 4�̸� ����
			break;
		}
	}
}
