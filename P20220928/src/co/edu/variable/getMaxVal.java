package co.edu.variable;

public class getMaxVal {
	public static void main(String[] args) {
		int[] randomAry = new int[5];
		randomAry[0] = (int) (Math.random() * 100) + 1;
		randomAry[1] = (int) (Math.random() * 100) + 1;
		randomAry[2] = (int) (Math.random() * 100) + 1;
		randomAry[3] = (int) (Math.random() * 100) + 1;
		randomAry[4] = (int) (Math.random() * 100) + 1; // Math.random = 0~1 ������ ���Ǽ� ����(�Ǽ�Ÿ��)
		//�ڹٿ����� �迭 ũ�⸦ ���ϸ� �� �ø� �� ����.
//		int maxVal = 0; // �迭��� �� ���� ū���� ����.
		int minVal = 100; 
		for (int i = 0; i < 5; i++) {
			System.out.println(randomAry[i]);
			// maxVal ������ �� ���� ���ؼ� ū ���� ���.
			if (randomAry[i] < minVal) {
				minVal = randomAry[i];
			}
		}
		System.out.println("������ �迭�� ������ ���� �ּҰ� => " + minVal);
	}
}
