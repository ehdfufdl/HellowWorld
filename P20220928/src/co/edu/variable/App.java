package co.edu.variable;

//�ڹٴ� class ����.
//Ŭ������ main�޼ҵ�� ����.

public class App {
	public static void main(String[] args) {
		System.out.println("�Ű����� ���."); //(�Ű����� ���)
		
		//������ Ÿ�� ����. => ����(int, long), �Ǽ�(double, float)
		//��or����(boolean), ���ڿ�: (String)
		
		int myAge = 25; // ���� = ������ Ÿ���� �׻� �����ؾ��Ѵ�.
//		myAge = "�����ټ�"; // ������ ����.
//		String ������ = "�����ټ�";
//		������ = "28"; //���ڿ� 28.

		int result = myAge + 30;
		System.out.println(myAge + "���� 30�� ���ϸ� " + result + "�Դϴ�.");
		
		//�迭.
		//let numAry = [];
		int[] numAry = {20, 29, 13, 44, 88, 33}; // �迭 ����.
		int sum = 0;
//		1) �迭�� �հ�.
		for (int i = 0; i < 6; i++) {
//			System.out.println(numAry[i]);
		
			if (i % 2 == 0) {// ¦�������� ��쿡�� �հ�.
			sum = sum + numAry[i];
			}
		}
		System.out.println("¦���� �հ�=> " + sum);
		
//		2) �迭 ����.
		sum = 0; // 0������ �ʱ�ȭ. 
//		����: sum �� ���� 100�� �Ѿ�� ���� break;
		for (int i = 0; i < 6; i++) {
			sum += numAry[i];
			if (sum > 100)
				break;
		}
		System.out.println("100�� �Ѿ�� ������ sum => " + sum);
		
		System.out.println("����Ŀ�ԿϷ�.");
	}
}
