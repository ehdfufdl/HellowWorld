package co.edu.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StringExe {
	public static void main(String[] args) {

		String fileName = "src/co/edu/api/Birth.txt";
		File file = new File(fileName);

		// indexof ���ڿ� ã�� , replace ���ڿ� ��ü
		String searchKey = "�� ��"; // �� ��or �� �� => �ν��Ҽ��ֵ��� if�� �Ẹ��
		searchKey = searchKey.replace(" ", ""); // ������ ����

		Scanner scn = null;
		try {
			scn = new Scanner(file);
			while (true) {
				String str = scn.nextLine();
				if (str == null)
					break;

				// �����Դϴ�. �����Դϴ�.
				if(str.replace("-", "").charAt(6)%2 == 1) {
					System.out.println("�����Դϴ�.");
				}else if(str.replace("-", "").charAt(6)%2 == 0) {
					System.out.println("�����Դϴ�.");
				}else {
					System.out.println("�߸��� ��ȣ�Դϴ�.");
				}
//				char sex = fileName.charAt(7);
//				switch(sex) {
//				case 1:
//				case 3:
//					System.out.println("�����Դϴ�.");
//					break;
//					
//				case 2:
//				case 4:
//					System.out.println("�����Դϴ�.");
//					break;
//				}
//								
				if (str.indexOf(searchKey) != -1) { // �� �ٷ� �ᵵ ��� ������ if��
					System.out.println(str);
				}
				// System.out.println(str); // searchKey�� ������ �ε�����ȣ ��� , searchKey�� ������ -1�� ��ȯ.
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {

		}
		System.out.println("end of prog.");
	}
}
