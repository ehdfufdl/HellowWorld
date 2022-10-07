package co.edu.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListExample {
	public static void main(String[] args) {
		// List 컬랙션
		ArrayList<String> strs = new ArrayList<String>();
		// 추가.
		strs.add("홍길동");
		strs.add("김민식");
		strs.add("박유식");

		// 삭제.
		strs.remove(0);
		strs.remove("박유식");

		// 특정위치에 추가.
		strs.add(0, "최기분");

		System.out.println("collect크기: " + strs.size());

		for (String str : strs) {
			System.out.println(str);
		}
		for (int i = 0; i < strs.size(); i++) {
			System.out.printf("%d번째의 값은 %s\n", i, strs.get(i));
		}
		// 반복자를 생성.
		Iterator<String> itr = strs.iterator(); // iterator = 컬렉션 메소드.
		while (itr.hasNext()) {
			String result = itr.next();
			System.out.println(result);
		}

		// 100만건.
		ArrayList<Integer> inAry = new ArrayList<Integer>();
		long start = System.nanoTime(); //
		for (int i = 0; i < 1000000; i++) {
			inAry.add(i);
		}
		long end = System.nanoTime();
		System.out.println("ary: " + (end - start));
		
		LinkedList<Integer> lnAry = new LinkedList<Integer>();
		 start = System.nanoTime(); //
		for (int i = 0; i < 1000000; i++) {
			inAry.add(i);
		}
		 end = System.nanoTime();
		System.out.println("lna: "+ (end - start));
	}
}
/*
 * 컬렉션 : 사전적 의미로 요소(객체)를 수집해 저장하는 것. list컬렉션 : 인덱스로 관리 , 중복해서 객체 저장 가능. 프레임워크 :
 * 사용방법을 정해놓은 라이브러리.
 */
