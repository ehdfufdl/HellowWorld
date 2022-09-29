package co.edu.variable;

public class MethodExample {
	// ����, ���� => �ʺ� 
	public static int getArea(int w, int h) {
		int result = w* h;
		return result;
	}
	
	// �迭����� �� ���� ��.
	public static int sumAry(int[] ary) {
		int sum = 0;
		for(int i=0; i<ary.length; i++) {
		sum = sum + ary[i];
		}
		return sum;
	}
	
	
	// �μ��� ��������� ��ȯ.
	public static double divide(double n1, double n2) {
		double result = n1 / n2;
		return result;
	}
	
	//�μ��� ������ �۾�. �Ű������� int ����.
	public static double divide(int n1, int n2) {
		// 1bit * 8 => 1byte. 1bit= 0 �Ǵ� 1
		// ���� ����: byte(1), short(2byte), int(4byte), long(8byte)
		// �Ǽ� ����: float(4byte), double(8byte)
		if(n2 == 0) {
			return 0;
		}
		double result = (double)n1 / n2; // 3/2 => 1.5(�Ǽ���)
		return result;
	}
	
	public static void main(String[] args) {
		int result = getArea(10, 15);
		System.out.println("��ü �ʺ�� " + result + " �Դϴ�");
		
		int[] intAry = {23, 45, 12};
		result = sumAry(intAry);
		System.out.println("��ü �迭����� �հ�� " + result);
		
		// �Ǽ�. float, double(java������ doubleŸ�� ���̾���.)
		double d1 = 23.4567;
		double d2 = 12.34;
		double d3 = d1 + d2;
		
		d3 = divide(d1, d2);
		System.out.println("���� ����� " + d3 + " �Դϴ�");
		
		d3 = divide(3, 0);
		System.out.println("���� ����� " + d3 + " �Դϴ�");
	}	

//		int[] intAry2 = {22, 33, 44, 55};
//		result = sumAry(intAry2);
//		System.out.println("��ü �迭����� �հ�� " + result);
	
}
