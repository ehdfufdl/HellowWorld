package co.edu.inherit.friend;

import java.util.ArrayList;

public class ArrayExam {
	public static void main(String[] args) {
		// 배열은 한번 크기가 정해지면 변경불가.
		String[] flowers = new String[3];
		flowers[0] = "장미";
		flowers[1] = "해바라기";
		flowers[2] = "무궁화";
//		flowers[3] = "목련";

		// flowers2 선언.
		String[] flowers2 = new String[6];

		flowers[0] = flowers2[0];
		flowers[1] = flowers2[1];
		flowers[2] = flowers2[2];
//		flowers[3] = "목련";

		for (String str : flowers2) {
			if (str != null) {
				System.out.println(str);
			}
		}

		// 배열의 크기 고정 => 컬렉션(ArrayList);
		// Object 모든 클래스의 최상위 클래스.
		// add 메소드를 쓰면 계속해서 추가됨 , 대신 형변환 해줘야한다.

		ArrayList flowers3 = new ArrayList(); // 크기10개 공간생성.
		flowers3.add("장미"); // 첫번째 위치에 장미저장.
		flowers3.add("해바라기");
		flowers3.add("무궁화");
		flowers3.add("무궁화");
		flowers3.add("무궁화");
		flowers3.add("무궁화");
		flowers3.add("무궁화");
		flowers3.add("무궁화");
		flowers3.add("무궁화");
		flowers3.add("무궁화");
		flowers3.add("무궁화");
		flowers3.add("무궁화");
//		flowers3.add(123);
		
//		for (Object str : flowers3) {
//			String result = (String) str; // 강제 형변환 시켜줘야한다.(캐스팅)
//			System.out.println(result);
//		}

		// 컬렉션의 크기 : size()
		for (int i = 0; i < flowers3.size(); i++) {
			String result = (String) flowers3.get(i);
			System.out.println(result);
		}
	}
}
