package co.edu.inherit.friend;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendExe {
	Scanner scn = new Scanner(System.in);
//	Friend[] friends = new Friend[10];
	ArrayList friends = new ArrayList();

	// 친구등록 - 학교/회사/친구...
	public void exe() {

		while (true) {
			System.out.println("1.등록 2.조회 3.종료");
			System.out.println("선택>> ");

			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.println("1.회사친구 2.학교친구 3.친구");
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
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
		}
		System.out.println("프로그램 종료.");
	} // end of exe()

	// 추가메소드.
	public void addComFriend() {
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		System.out.println("연락처를 입력하세요.");
		String phone = scn.nextLine();
		System.out.println("회사명을 입력하세요.");
		String comp = scn.nextLine();
		System.out.println("부서를 입력하세요.");
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
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		System.out.println("연락처를 입력하세요.");
		String phone = scn.nextLine();
		System.out.println("학교명을 입력하세요.");
		String univ = scn.nextLine();
		System.out.println("학과를 입력하세요.");
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
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		System.out.println("연락처를 입력하세요.");
		String phone = scn.nextLine();
		Friend frnd = new Friend(name, phone);
//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i] == null) {
//				friends[i] = frnd;
//				break;
//			}
//		}
		friends.add(frnd); // 비워져있는 위치에 한건 등록.
	}

//	public void searchFriend() {
//		System.out.println("찾을 친구이름 입력>>> ");
//		String searchKey = scn.nextLine();
//		for(int i=0; i<friends.length; i++) {
//			if(friends[i] != null && friends[i].getName().contains(searchKey))
//				System.out.println(friends[i].showInfo());
//		}
//	}
	public void searchFriend() {
		for (int i = 0; i < friends.size(); i++) { // frnd 변수의 타입이 어떤 유형의 클래스인지 구분
			// Friend 클래스의 상속.Friend, ComFriend, UnivFriend
			Object frnd = (Friend) friends.get(i); // Object타입
			
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
