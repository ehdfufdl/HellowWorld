package co.edu.variable;

public class SortExe {
	public static void main(String[] args) {
		int[] numAry = {34, 21, 12, 9, 8, 7, 6, 5, 4, 3, 2}; // {12, 21, 34}�� �迭��ġ ����
		
		// �ݺ����� ó��.
//		numAry = {12, 21, 34}
		// ���̽� : n1 > n2 > n3 =>
		// ���̽� : n1 < n2 > n3 =>
		
		// 1) 4�� -> 3����, 2����, 1����.
	for(int j=0; j<numAry.length - 1; j++) { 		
		for(int i=0; i < numAry.length - 1; i++) {
			if(numAry[i] > numAry[i + 1]) { // i:0�̸� 1��°�� 2��°�� ��, i:1�̸� 2��°�� 3��°�� ��
				int temp = 0;
				temp = numAry[i]; // ������ ���� �ִ� ���� temp�� ����.
				numAry[i] = numAry[i + 1];
				numAry[i + 1] = temp;
			}
		}
	}
//		if(numAry[0] > numAry[1]){ //34�� > 21�� ��
//			int temp = numAry[0];
//			numAry[0] = numAry[1]; //21
//			numAry[1] = temp; //
//		} 
//		
//		// 2). 2,3 ��ġ��ȯ
//		if(numAry[1] > numAry[2]){
//			int temp = numAry[1];
//			numAry[1] = numAry[2]; //21
//			numAry[2] = temp; //
//		} 
//		
//		// 3). 1,2 ��ġ��ȯ
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
		
		// 4). ���� ���
		for(int n : numAry) {
			System.out.print(n + " "); // ln�� �ٹٲ�
		}
		
	}
}

// �޼ҵ�(���) : ������Ʈ ���.
// public static ��ȯ�� printHello(�Ű�����){
// 		... ���๮ ...
// }