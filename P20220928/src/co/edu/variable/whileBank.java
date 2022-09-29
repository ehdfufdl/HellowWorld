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
		// 메뉴: 1:예금, 2:출금, 3:잔고, 4:종료
		// 10만원이 넘으면 예금을 못받음.
		while(run) {
			System.out.println("메뉴: 1:예금, 2:출금, 3:잔고, 4:종료");
			int menu = scn.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("예금처리하는 메뉴.");
				System.out.println("10만원이상은 예금할 수 없습니다. ");
				System.out.println("예금액을 입력>>> ");
				int input = scn.nextInt();
				money = money + input;   //money = money + input
				if(money >= 100000) {
					money -= input;
					System.out.println("10만원이상은 예금할 수 없습니다. ");
				}
				break;
			case 2:
				System.out.println("출금처리하는 메뉴.");
				System.out.println("출금액을 입력>>> ");
				int input1 = scn.nextInt();
				 // money = money - input1
				if(input1 > money) {
					System.out.println("잔고가 부족합니다. ");
					break;
				}
				money = money - input1;
				break;
			case 3:
				System.out.println("잔고조회하는 메뉴.");
				System.out.println("현재잔고는 : "+ money);
				break;
			case 4:
				System.out.println("종료하는 메뉴.");
				run = false;
			}	
			
		} // end of while
		System.out.println("end of pgm");
	} // end of backApp()
}
