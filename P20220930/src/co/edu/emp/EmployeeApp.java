package co.edu.emp;

import java.util.InputMismatchException;
import java.util.Scanner;

// ����Ŭ����.
public class EmployeeApp {
	public static void main(String[] args) {
		// 1.�����(�ʱ�ȭ) 2.��������Է� 3.����˻� 4.�������Ʈ 9.����
		Scanner scn = new Scanner(System.in);
		EmployeeArrayList service = new EmployeeArrayList();
		
		while(true) {
			System.out.println(" 1.�����(�ʱ�ȭ) 2.��������Է� 3.����˻� 4.�������Ʈ 5.����޿� 9.����");
			System.out.println("����>>> ");
			int menu = 0;
			try {
				 menu = Integer.parseInt(scn.nextLine()); // "1" -> 1
			}catch(NumberFormatException e){
				System.out.println("���ڸ� �Է��ϼ���.");
			}
			if(menu == 1) {
				service.init();
			}else if(menu == 2) {
				service.input();
			}else if(menu == 3) {
				System.out.println("�˻��� �����ȣ �Է�>>> ");
				int eId = Integer.parseInt(scn.nextLine()); // "100"Enter.
				service.search(eId);
				String name = service.search(eId);
				if(name == null) {
					System.out.println("ã�� ��������� �����ϴ�.");
				}else {
					System.out.println("����� �̸��� " + name);
				}				
			}else if(menu == 4) {
				service.print();
			}else if(menu == 5) {
				// ����� �Է��ϸ� �޿����� ��ȯ.
				System.out.println("�����ȣ �Է�>> ");
				int eId = Integer.parseInt(scn.nextLine());
				int sal = service.searchSal(eId);
				if(sal == -1) {
					System.out.println("ã�� ��������� �����ϴ�.");
				}else {
					System.out.println("����� �޿��� " + sal);
				}
			}
			else if(menu == 9) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		System.out.println("���α׷� ����.");
	} // end of main()
} // end of class
