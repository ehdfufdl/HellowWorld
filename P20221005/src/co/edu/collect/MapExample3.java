package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample3 {
	public static void main(String[] args) {
		// 1.���� 2.��ȸ 3.����
		Map<String, Integer> students = new HashMap<String, Integer>();
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.���� 2.��ȸ 3.����");
			System.out.println("����>> ");
			
			int menu = scn.nextInt();
			if(menu == 1) {
				System.out.print("�л��̸��Է�>> ");
				scn.nextLine();
				String name = scn.nextLine();
				System.out.print("�л������Է�>> ");
				int score = scn.nextInt();
				students.put(name, score); // �߰�
				
			}else if(menu == 2) {
				System.out.print("�л��̸��Է�>> ");
				scn.nextLine();
				String searchName = scn.nextLine(); 
				System.out.println("����: " + students.get(searchName));
								
			}else if(menu == 3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}// end of while
		System.out.println("���α׷� ����.");
	}
}
