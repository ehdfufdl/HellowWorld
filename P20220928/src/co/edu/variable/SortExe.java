package co.edu.variable;

public class SortExe {
	public static void main(String[] args) {
		int[] numAry = {34, 21, 12};
		
		// �ݺ����� ó��.
//		numAry = {12, 21, 34}
		// ���̽� : n1 > n2 > n3 =>
		// ���̽� : n1 < n2 > n3 =>
		
		if(numAry[0] > numAry[1]){ //34�� > 21�� ��
			int temp = numAry[0];
			numAry[0] = numAry[1]; //21
			numAry[1] = temp; //
		}
		
		for(int n : numAry) {
			System.out.println(n);
		}
	}
}
