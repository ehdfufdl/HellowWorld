package co.edu.inherit;

public class Child extends Parent {
	String field1;
	Child(){
		super("args"); // �θ�Ŭ������ ������ȣ��. super�� �θ�� Ŭ������ ��Ī�ϴ°�.
		System.out.println("Child() call");
	}
	
	void method1() {
		System.out.println("method1() call."); //Child Ŭ������ ������ �ִ� �޼ҵ�
	}
	
	//�θ�Ŭ������ �޼ҵ带 ������. overriding.
	//�ڽ�Ŭ�������� �θ�Ŭ������ �޼ҵ带 �״�� �������� �����ְ� �ڽ�Ŭ�������� �޼ҵ带 �������ؼ� ����� ���� �ִ�.
	//�θ���Ŭ������ ����Ÿ���̶� �Ű����� ���ƾ��Ѵ�.
	@Override // ������̼�: �θ�Ŭ������ �޼ҵ�(��ȯ����, �޼ҵ��� �̸�, �Ű���)üũ
	void method() {
		System.out.println("Child method() call.");
	}
	
	@Override
	public String toString() {
		return "Child [field1=" + field1 + "]";
	}	
	
}
