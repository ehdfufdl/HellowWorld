package co.edu.collect;

import java.util.Scanner;

public class ExcitingGame {
	public static void main(String[] args) {

		long gameStart = System.currentTimeMillis();
		
		String target = "Defines the AWT and Swing user interface tollkits";
		String[] targetAry = target.split(" ");	
		System.out.println(target);
		boolean check = false;
		
		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.println("삭제할 단어>> ");
			String del = scn.nextLine();
			for (int i = 0; i < targetAry.length; i++) {
				if (del.equals(targetAry[i])) {
					targetAry[i] = null;
				}
			}
			for (String str : targetAry) {
				if (str != null) {
					System.out.printf("%s ", str);
				}
				
			}
			if(check) {
				break;
			}
		}
		

		long gameEnd = System.currentTimeMillis();
		
		long during = (gameEnd - gameStart); // 1*60*1000 + 30*1000 = 63000/60000 분, 63000%6000 나머지 초.
		System.out.println((during / 60000) + "뷴" + (during / 6000)+"초 가 걸렸습니다.");
	}
}
