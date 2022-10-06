package Book;

import java.io.IOException;

public class ByteToStringExample {
	public static void main(String[] args) {

			byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

			String str1 = new String(bytes); // bytes를 반환.
			System.out.println(str1);
			
			String str2 = new String(bytes, 6, 4); // bytes의 6번째 74의 인덱스 위치 에서부터 4개
			System.out.println(str2);
			
			
		}
}

