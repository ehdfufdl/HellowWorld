package co.edu.api;

import java.util.ArrayList;

public class ListExe {
	public static void main(String[] args) {
		// 컬렉션.
		int[] intAry = new int[5];
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		list.add(100);
		//list.add(new Integer(100));
		
		int a = 5; // 기본데이터 타입
		
		Integer b = 10; // 클래스. int=> Integer. 박싱
		a = b; // 언박싱
		
	}
}
