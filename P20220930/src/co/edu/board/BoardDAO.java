package co.edu.board;

import java.util.Scanner;

// ��ɸ�.
public class BoardDAO {
	// Singleton ����� �ν��Ͻ� ����.
	private static BoardDAO instance = new BoardDAO();
	private BoardDAO() {}
	public static BoardDAO getInstance() {
		return instance;
	}
	
	Scanner scn = new Scanner(System.in);
	Board[] myBoards = new Board[100];
	
	// 1.�۵��
	public void addBoard() {
		System.out.println("�۵�� ���.");
		System.out.print("�۹�ȣ �Է� >> ");
		int bNo = scn.nextInt();
		scn.nextLine();
		System.out.print("������ �Է� >> ");
		String title = scn.nextLine();
		System.out.print("�۳��� �Է� >> ");
		String content = scn.nextLine();
		
		Board brd = new Board(bNo, title, content);
		// �迭 ���.
		for(int i=0; i<myBoards.length; i++) {
			if(myBoards[i] == null) {
				myBoards[i] = brd;
				break;
			}
		}
	}
	
	// 2.�۸��
	public void boardList() {
		System.out.println("�۸�� ���.");
		for(Board brd :myBoards) {
			if(brd != null) {
				System.out.println(brd.toString());
			}
		}
	}
	
	// 3.�ۻ󼼺���
	public void boardDetail() {
		System.out.println("�󼼺��� ���.");
		System.out.print("�۹�ȣ �Է� >> ");
		int bNo = scn.nextInt();
		for(Board brd : myBoards) {
			if(bNo == brd.getBoardNo()) { 
			System.out.println(brd.toString());
			break;
		    }
		}
	}
	
	// 4.�ۻ���
	public void delBoard() {
		System.out.println("�ۻ��� ���.");
		System.out.print("�۹�ȣ �Է� >> ");
		int bNo = scn.nextInt();
		for(Board brd : myBoards) {
			if(bNo == brd.getBoardNo()){ 
			System.out.println();
		    }
		}
	}
	
	// 5.��ü �޴�
	public void exe() {
		
		boolean run = true;
		while(run) {
			System.out.println("1.�۵�� 2.�۸�� 3.�ۻ󼼺��� 4.�ۻ��� 9.����");
			System.out.print("����>> ");
			
			int menu = scn.nextInt();
			switch(menu) {
			case 1: 	
				addBoard(); 
				break;
			case 2: 
				boardList(); 
				break;
			case 3: 
				boardDetail();
				break;
			case 4:
				delBoard();
				break;
			case 9:
				run = false;
				break;
				default: //break �ʿ����.
					System.out.println("�߸��� �޴��Դϴ�.");
			}
			
		} // end of while
		System.out.println("���α׷� ����.");
	} // end of exe()
}
