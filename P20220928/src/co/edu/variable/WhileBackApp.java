package co.edu.variable;

import java.util.Scanner;

// 계좌정보 선언: 계좌번호, 예금주, 잔고
// 은행 계좌생성: Account[] banks;
public class WhileBackApp {
	
	public static void main(String[] args) {
		//메뉴: 1.예금, 2:출금, 3:잔액, 4:종료
		Account[] banks = new Account[10]; // Account를 10개 담겠다.
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("0.계좌생성, 1.예금, 2:출금, 3:잔액, 4:종료");
			int menu = scn.nextInt();scn.nextLine();
			
			if(menu == 1) {
				// 예금기능. 계좌번호, 얼마?
				System.out.println("계좌번호>>> ");
				String accNo = scn.nextLine();
				System.out.println("예금할 금액>>> ");
				int money = scn.nextInt();
				
				for(int i=0; i<banks.length; i++) {
					if(banks[i] != null && banks[i].accNo.equals(accNo)) {
						banks[i].balance = banks[i].balance + money;
					}
				}
				
				
			} else if(menu == 2) {
				System.out.println("계좌번호>>> ");
				String accNo = scn.nextLine();
				System.out.println("출금할 금액>>> ");
				int money = scn.nextInt();
				
				for(int i=0; i<banks.length; i++) {
					if(banks[i] != null && banks[i].accNo.equals(accNo)) {
						if(banks[i].balance < money) {
							System.out.println("잔고가 부족합니다.");
							break;
					}
					banks[i].balance = banks[i].balance - money;
					}
				}		
			} else if(menu == 3) {
				System.out.println("조회할 계좌번호 입력>>> ");
				String accNo = scn.nextLine();
				for(int i=0; i<banks.length; i++) {
					if(banks[i] != null && banks[i].accNo.equals(accNo)) {
						System.out.println("잔액: " + banks[i].balance);
					}
				}
				
			} else if(menu == 4) {
				
			} else if(menu == 0) {
				System.out.println("계좌번호입력>>> ");
				String accNo = scn.nextLine();
				System.out.println("예금주>>> ");
				String owner = scn.nextLine();
				
				Account acc = new Account(); // 인스턴스 생성.
				acc.accNo = accNo;
				acc.owner = owner;
				
				//계좌번호 생성.
				for(int i=0; i<banks.length; i++) {
					if(banks[i] == null) {
						// 한건입력. break;
						banks[i] = acc;
						break;
					}
				}
				System.out.println("계좌생성완료.");
			}
		}
	}
}
