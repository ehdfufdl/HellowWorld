package co.edu.api;

//1
//2 3
//4 5 6
//7 8 9 10

//
//		1
//	  2 3
//  4 5 6
//7 8 9 10

public class MorningExe {
	public static void main(String[] args) {
		int cnt = 1;
//		for(int i=0; i<4; i++) {
//			if(i == 0) {
//				System.out.println("1");
//			}else if(i == 1) {
//				cnt = 1;
//				System.out.println("2 3");
//			}else if(i == 2) {
//				cnt = 1;
//				System.out.println("4 5 6");
//			}else if(i == 3) {
//				cnt = 1;
//				System.out.println("7 8 9 10");
//			}
//			for(int j=0; j<4; j++) {
//				System.out.printf("%3d", cnt);
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<5; i++) {
//			for(int j=1; j<=i; j++) {
//			System.out.printf("%3d", cnt);
//			cnt++;
//			}
//			System.out.println(" ");
//		}
		
		for(int i=5; i>1; i--) {
			for(int j=1; j<i; j++) {
				for(int b=1; b<i+1; b++) {
					
					System.out.println(cnt);
				}
			}			
		}
	}
}
