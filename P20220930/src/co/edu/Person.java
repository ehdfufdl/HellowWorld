package co.edu;

// ����� Ư¡ : �Ӽ�(�̸�, ����, Ű, ������)
//			  ���(�޸���, �Դ´�, �����ܴ�)
public class Person {
	// �Ӽ� => �ʵ�.
	String name;
	int age;
	double height;
	double weight;	
	// ��� => �޼ҵ�. ��ġ�°� ������ �ͼ� �ٲ�����Ѵ�.
	void run() {
		System.out.println(name + "�� �޸��ϴ�.");
	}
	void eat(String food) {
		System.out.println(name + "�� " + food + "�� �Խ��ϴ�.");
	}
	void sleep() {
		System.out.println(name + "�� ������ϴ�.");
	}
}
