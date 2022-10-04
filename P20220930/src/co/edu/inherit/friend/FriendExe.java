package co.edu.inherit.friend;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendExe {
	Scanner scn = new Scanner(System.in);
//	Friend[] friends = new Friend[10];
	ArrayList friends = new ArrayList();

	// ģ����� - �б�/ȸ��/ģ��...
	public void exe() {

		while (true) {
			System.out.println("1.��� 2.��ȸ 3.����");
			System.out.println("����>> ");

			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.println("1.ȸ��ģ�� 2.�б�ģ�� 3.ģ��");
				int subMenu = scn.nextInt();
				scn.nextLine();
				if (subMenu == 1) {
					addComFriend();
				} else if (subMenu == 2) {
					addUnivFriend();
				} else if (subMenu == 3) {
					addFriend();
				}
			} else if (menu == 2) {
				searchFriend();
			} else if (menu == 3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸��� �޴��� �����߽��ϴ�.");
			}
		}
		System.out.println("���α׷� ����.");
	} // end of exe()

	// �߰��޼ҵ�.
	public void addComFriend() {
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scn.nextLine();
		System.out.println("����ó�� �Է��ϼ���.");
		String phone = scn.nextLine();
		System.out.println("ȸ����� �Է��ϼ���.");
		String comp = scn.nextLine();
		System.out.println("�μ��� �Է��ϼ���.");
		String dept = scn.nextLine();
		ComFriend comFrnd = new ComFriend(name, phone, comp, dept);
//		for (int i = 0; i < friends.size(); i++) {
//			if (friends.add[i] == null) {
//				friends[i] = comFrnd;
//				break;
//			}
//		}
		friends.add(comFrnd);
	}

	public void addUnivFriend() {
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scn.nextLine();
		System.out.println("����ó�� �Է��ϼ���.");
		String phone = scn.nextLine();
		System.out.println("�б����� �Է��ϼ���.");
		String univ = scn.nextLine();
		System.out.println("�а��� �Է��ϼ���.");
		String major = scn.nextLine();
		UnivFriend univFrnd = new UnivFriend(name, phone, univ, major);
//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i] == null) {
//				friends[i] = univFrnd;
//				break;
//			}
//		}
		friends.add(univFrnd);
	}

	public void addFriend() {
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scn.nextLine();
		System.out.println("����ó�� �Է��ϼ���.");
		String phone = scn.nextLine();
		Friend frnd = new Friend(name, phone);
//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i] == null) {
//				friends[i] = frnd;
//				break;
//			}
//		}
		friends.add(frnd); // ������ִ� ��ġ�� �Ѱ� ���.
	}

//	public void searchFriend() {
//		System.out.println("ã�� ģ���̸� �Է�>>> ");
//		String searchKey = scn.nextLine();
//		for(int i=0; i<friends.length; i++) {
//			if(friends[i] != null && friends[i].getName().contains(searchKey))
//				System.out.println(friends[i].showInfo());
//		}
//	}
	public void searchFriend() {
		for (int i = 0; i < friends.size(); i++) { // frnd ������ Ÿ���� � ������ Ŭ�������� ����
			// Friend Ŭ������ ���.Friend, ComFriend, UnivFriend
			Object frnd = (Friend) friends.get(i); // ObjectŸ��
			
			if (frnd instanceof Friend) {
				Friend friend = (Friend) frnd;
				System.out.println(friend.showInfo());
				
			} else if (frnd instanceof ComFriend) {
				ComFriend friend = (ComFriend) frnd;
				System.out.println(friend.showInfo());
				
			} else if (frnd instanceof UnivFriend) {
				UnivFriend friend = (UnivFriend) frnd;
				System.out.println(friend.showInfo());
			}
		}
	}
}
