package co.edu.inherit.friend;

public class Cat extends Animal { // �߻�Ŭ������ ���
	
	// AnimalŬ������ �߻�޼ҵ带 �ݵ�� ����������Ѵ�.
	@Override
	public void eat() {
		System.out.println("����̰� ���̸� �Խ��ϴ�.");
	}
	
	@Override
	public void speak() {
		System.out.println("�߿˾߿�.");
	}
}
