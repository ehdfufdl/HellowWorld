package co.edu.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StringExe {
	public static void main(String[] args) {

		String fileName = "src/co/edu/api/Birth.txt";
		File file = new File(fileName);

		// indexof 문자열 찾기 , replace 문자열 대체
		String searchKey = "자 바"; // 자 바or 자 바 => 인식할수있도록 if문 써보기
		searchKey = searchKey.replace(" ", ""); // 공백을 지움

		Scanner scn = null;
		try {
			scn = new Scanner(file);
			while (true) {
				String str = scn.nextLine();
				if (str == null)
					break;

				// 남자입니다. 여자입니다.
				if(str.replace("-", "").charAt(6)%2 == 1) {
					System.out.println("남자입니다.");
				}else if(str.replace("-", "").charAt(6)%2 == 0) {
					System.out.println("여자입니다.");
				}else {
					System.out.println("잘못된 번호입니다.");
				}
//				char sex = fileName.charAt(7);
//				switch(sex) {
//				case 1:
//				case 3:
//					System.out.println("남자입니다.");
//					break;
//					
//				case 2:
//				case 4:
//					System.out.println("여자입니다.");
//					break;
//				}
//								
				if (str.indexOf(searchKey) != -1) { // 자 바로 써도 출력 가능한 if문
					System.out.println(str);
				}
				// System.out.println(str); // searchKey가 있으면 인덱스번호 출력 , searchKey가 없으면 -1을 반환.
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {

		}
		System.out.println("end of prog.");
	}
}
