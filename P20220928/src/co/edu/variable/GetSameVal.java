package co.edu.variable;

import java.util.Scanner;
import java.lang.System; //���Ͼ� ��Ű�� �ȿ� �ִ� ��ɾ�� ����Ʈ ���� �ʾƵ� �ȴ�.
// java.lang �� ���̽� ��Ű��.

public class GetSameVal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // ������Է°��� ����.
		System.out.println("�̸��� �Է��ϼ���>>>");
		String name = scn.nextLine(); //������Է°��� ��ȯ.
		
		String[] names = {"������", "������", "������", "������"};
		//
		boolean isChecked = false;
		for(int i = 0; i < names.length; i++) { //length �迭�� ũ��
			//"����� ��ġ�� �ֽ��ϴ�." ���
			if(names[i].equals(name)) { //���ڿ��񱳴� ���ڿ�.equal /name�� ���� �Է��ϴ� ��
				System.out.println((i + 1) + "��°�� �ֽ��ϴ�.");
				isChecked = true;
				break;
			}	
		}
		if (!isChecked) {
			System.out.println("ã�� �̸��� �����ϴ�.");
		}
		System.out.println("�Է°�: " + name);
		scn.close();
	}
}
