package co.edu.variable;

public class SortExe {
	public static void main(String[] args) {
		int[] numAry = {34, 21, 12, 9, 8, 7, 6, 5, 4, 3, 2}; // {12, 21, 34}로 배열위치 변경
		
		// 반복적인 처리.
//		numAry = {12, 21, 34}
		// 케이스 : n1 > n2 > n3 =>
		// 케이스 : n1 < n2 > n3 =>
		
		// 1) 4개 -> 3번비교, 2번비교, 1번비교.
	for(int j=0; j<numAry.length - 1; j++) { 		
		for(int i=0; i < numAry.length - 1; i++) {
			if(numAry[i] > numAry[i + 1]) { // i:0이면 1번째와 2번째를 비교, i:1이면 2번째와 3번째를 비교
				int temp = 0;
				temp = numAry[i]; // 순서가 먼저 있는 값을 temp에 저장.
				numAry[i] = numAry[i + 1];
				numAry[i + 1] = temp;
			}
		}
	}
//		if(numAry[0] > numAry[1]){ //34랑 > 21을 비교
//			int temp = numAry[0];
//			numAry[0] = numAry[1]; //21
//			numAry[1] = temp; //
//		} 
//		
//		// 2). 2,3 위치교환
//		if(numAry[1] > numAry[2]){
//			int temp = numAry[1];
//			numAry[1] = numAry[2]; //21
//			numAry[2] = temp; //
//		} 
//		
//		// 3). 1,2 위치교환
//		if(numAry[2] > numAry[3]) {
//			int temp = numAry[2];
//			numAry[2] = numAry[3]; //21
//			numAry[3] = temp; //
//		}
//		
//		if(numAry[0] > numAry[1]) {
//			int temp = numAry[0];
//			numAry[0] = numAry[1]; //21
//			numAry[1] = temp; //
//		}
//		int temp = numAry[0];
//		numAry[0] = numAry[2];
//		numAry[2] = temp; 
		
		// 4). 순서 출력
		for(int n : numAry) {
			System.out.print(n + " "); // ln은 줄바꿈
		}
		
	}
}

// 메소드(기능) : 오브젝트 멤버.
// public static 반환값 printHello(매개변수){
// 		... 실행문 ...
// }