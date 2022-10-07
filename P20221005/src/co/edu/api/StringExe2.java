package co.edu.api;

import java.io.IOException;

public class StringExe2 {
	public static void main(String[] args) {
		System.out.println("abcDEF".toLowerCase());
		while (true) {
			try {
				int bytes = System.in.read(); // System.in 키보드(입력장치) read : 키보드로 입력한 값을 아스키값을 반환
				if (bytes == 122)
					break;

				System.out.println("입력값 : " + bytes);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end of prog.");
	}

	public static void changeCapital(String msg) {
	// 대문자->소문자, 소문자->대문자 (소문자 - 32 = 대문자, 대문자 + 32 = 소문자)
	// aBcD => AbCd 97:65, 98:66  
	// 소문자: 97 ~ 122, 대문자 65 ~ 90
	
	
	}
}
