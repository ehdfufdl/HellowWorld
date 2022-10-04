package co.edu.inherit.friend;

public abstract class Animal { // �߻�Ŭ����
	private String kind; // �����ڷ� �ν��Ͻ� ������ ���Ѵ�. ��Ģ�� ����
	public Animal() {
		
	}
	public Animal(String kind) {
		this.kind = kind;
	}
	public void move() {
		System.out.println("�����Դϴ�.");
	}
	public abstract void eat(); // �߻�޼ҵ�: �ڽ�Ŭ�������� �ݵ�� ����.
	public abstract void speak(); // eat, speak����� �ڽ�Ŭ�������� ����.
}
