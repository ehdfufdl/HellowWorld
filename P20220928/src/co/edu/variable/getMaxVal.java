package co.edu.variable;

public class getMaxVal {
	public static void main(String[] args) {
		int[] randomAry = new int[5];
		randomAry[0] = (int) (Math.random() * 100) + 1;
		randomAry[1] = (int) (Math.random() * 100) + 1;
		randomAry[2] = (int) (Math.random() * 100) + 1;
		randomAry[3] = (int) (Math.random() * 100) + 1;
		randomAry[4] = (int) (Math.random() * 100) + 1; // Math.random = 0~1 사이의 임의수 생성(실수타입)
		//자바에서는 배열 크기를 정하면 더 늘릴 수 없다.
//		int maxVal = 0; // 배열요소 중 가장 큰값을 저장.
		int minVal = 100; 
		for (int i = 0; i < 5; i++) {
			System.out.println(randomAry[i]);
			// maxVal 변수에 두 값을 비교해서 큰 값을 담기.
			if (randomAry[i] < minVal) {
				minVal = randomAry[i];
			}
		}
		System.out.println("생성된 배열의 임의의 값중 최소값 => " + minVal);
	}
}
