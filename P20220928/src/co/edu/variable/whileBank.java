package co.edu.variable;

import java.util.Scanner;

public class whileBank {
	public static void main(String[] args) {
		bankApp();
	}
	
	public static void bankApp() {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int money = 0;
		// �޴�: 1:����, 2:���, 3:�ܰ�, 4:����
		// 10������ ������ ������ ������.
		while(run) {
			System.out.println("�޴�: 1:����, 2:���, 3:�ܰ�, 4:����");
			int menu = scn.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("����ó���ϴ� �޴�.");
				System.out.println("10�����̻��� ������ �� �����ϴ�. ");
				System.out.println("���ݾ��� �Է�>>> ");
				int input = scn.nextInt();
				money = money + input;   //money = money + input
				if(money >= 100000) {
					money -= input;
					System.out.println("10�����̻��� ������ �� �����ϴ�. ");
				}
				break;
			case 2:
				System.out.println("���ó���ϴ� �޴�.");
				System.out.println("��ݾ��� �Է�>>> ");
				int input1 = scn.nextInt();
				 // money = money - input1
				if(input1 > money) {
					System.out.println("�ܰ� �����մϴ�. ");
					break;
				}
				money = money - input1;
				break;
			case 3:
				System.out.println("�ܰ���ȸ�ϴ� �޴�.");
				System.out.println("�����ܰ�� : "+ money);
				break;
			case 4:
				System.out.println("�����ϴ� �޴�.");
				run = false;
			}	
			
		} // end of while
		System.out.println("end of pgm");
	} // end of backApp()
}
