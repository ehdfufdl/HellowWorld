package co.edu.variable;

import java.util.Scanner;

public class WhileExe {
	
	public static void main(String[] args) {
		whileFnc3();
	}
	
	public static void whileFnc3() {
		// ������� ���� �Է�. �����ϰ��� �ϸ� 9�� �Է�.
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("���� �����ϼ���. ����� -1");
			int input = scn.nextInt();
			if(input == -1) {
				break;
			}
			MethodCalendar.makeCal(input);
		}
		System.out.println("end of pgm");
		scn.close();
	}
	
	public static void whileFnc2() {
		//while ����.
		Scanner scn = new Scanner(System.in); // import: ctrl+shf+O
		while(true) {
			System.out.println("���� �Է��ϼ���. �����Ϸ��� stop�Է�.");
			String inputVal = scn.nextLine();
			if(inputVal.equals("stop")) {
				break;
			}
			System.out.println("������Է°�> " + inputVal);
		}
		System.out.println("end of program");
		scn.close(); // �ý����ڿ��� ��ȯ.
	}
	
//	public static void whileFnc() {
//		//for�ݺ���: �ݺ�ȸ�� �˰������� ���� ���ϴ�. for(int i=0; int<10; i++){}
//		int i = 0;
//		while(i < 4) {
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("end of program");
//	}

}