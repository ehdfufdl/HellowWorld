package co.edu.api;

import java.io.IOException;

public class StringExe2 {
	public static void main(String[] args) {
		System.out.println("abcDEF".toLowerCase());
		while (true) {
			try {
				int bytes = System.in.read(); // System.in Ű����(�Է���ġ) read : Ű����� �Է��� ���� �ƽ�Ű���� ��ȯ
				if (bytes == 122)
					break;

				System.out.println("�Է°� : " + bytes);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end of prog.");
	}

	public static void changeCapital(String msg) {
	// �빮��->�ҹ���, �ҹ���->�빮�� (�ҹ��� - 32 = �빮��, �빮�� + 32 = �ҹ���)
	// aBcD => AbCd 97:65, 98:66  
	// �ҹ���: 97 ~ 122, �빮�� 65 ~ 90
	
	
	}
}
