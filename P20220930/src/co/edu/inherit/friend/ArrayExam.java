package co.edu.inherit.friend;

import java.util.ArrayList;

public class ArrayExam {
	public static void main(String[] args) {
		// �迭�� �ѹ� ũ�Ⱑ �������� ����Ұ�.
		String[] flowers = new String[3];
		flowers[0] = "���";
		flowers[1] = "�عٶ��";
		flowers[2] = "����ȭ";
//		flowers[3] = "���";

		// flowers2 ����.
		String[] flowers2 = new String[6];

		flowers[0] = flowers2[0];
		flowers[1] = flowers2[1];
		flowers[2] = flowers2[2];
//		flowers[3] = "���";

		for (String str : flowers2) {
			if (str != null) {
				System.out.println(str);
			}
		}

		// �迭�� ũ�� ���� => �÷���(ArrayList);
		// Object ��� Ŭ������ �ֻ��� Ŭ����.
		// add �޼ҵ带 ���� ����ؼ� �߰��� , ��� ����ȯ ������Ѵ�.

		ArrayList flowers3 = new ArrayList(); // ũ��10�� ��������.
		flowers3.add("���"); // ù��° ��ġ�� �������.
		flowers3.add("�عٶ��");
		flowers3.add("����ȭ");
		flowers3.add("����ȭ");
		flowers3.add("����ȭ");
		flowers3.add("����ȭ");
		flowers3.add("����ȭ");
		flowers3.add("����ȭ");
		flowers3.add("����ȭ");
		flowers3.add("����ȭ");
		flowers3.add("����ȭ");
		flowers3.add("����ȭ");
//		flowers3.add(123);
		
//		for (Object str : flowers3) {
//			String result = (String) str; // ���� ����ȯ ��������Ѵ�.(ĳ����)
//			System.out.println(result);
//		}

		// �÷����� ũ�� : size()
		for (int i = 0; i < flowers3.size(); i++) {
			String result = (String) flowers3.get(i);
			System.out.println(result);
		}
	}
}
