package co.edu.variable;

public class MethodExe {
	
	// main �޼ҵ� : ù��°�� ����.
	public static void main(String[] args) { //void ��ȯ��
//		printStar();
//		printStar(3); // ����κ��� int�� ���� �ʿ����. �ٷ� �Ű����� �Է�
//		printCircle("$$$");
//		printCircle("��", 5);
		int result = sum(sum(2, 3), sum(3, 4));
		System.out.println("�������� " + result);
	}
	
	public static void printStar() { // ��ȯ�� : ����. �Ű����� : ����.
		System.out.println("��");
	}
	
	public static void printStar(int times) { // ��ȯ�� : ���� �Ű����� : ����.
		for(int i=0; i<times; i++) {
			System.out.println("��");
		}
	}
	
	public static void printCircle(String circle) { //
		System.out.println(circle);
	}
	
	// ����ϴ� ���, ������ �Ű������� �޾ƿ��ڽ��ϴ�.
	public static void printCircle(String circle, int times) {
		for(int i=0; i<times; i++) {
			System.out.println(circle);
		}
	}
	
	// ��ȯ���� ������ �޼ҵ�.
	public static int sum(int n1, int n2) {
		int result = n1 * 2 + n2 * 3;
		System.out.println("������� " +  result);
		return result; // ��ȯ���� ������ int�� �����ϰڽ��ϴ�.
	}
}
