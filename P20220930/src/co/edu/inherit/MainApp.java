package co.edu.inherit;

public class MainApp {
	public static void main(String[] args) {
		Child child = new Child(); // field1, method1()
		child.method(); // Parent�� �޼ҵ�.  //Child���� �������ؼ� ����Ҽ����ִ�.
		child.method1(); // Child�� �޼ҵ�.
		
		Child2 child2 = new Child2();
		child2.method(); // Child2�� �޼ҵ�
		child2.method2();
		
		Parent c1 = new Parent(); // 
		c1 = new Child(); // �θ�Ŭ������ ������ �ڽ�Ŭ������ �ν��Ͻ� ���� ����.
		c1 = new Child2(); // �ڵ�����ȯ(�ڽ��ν��Ͻ� -> �θ�Ŭ������ �ν��Ͻ��� �ڵ�����ȯ�� �̷������.)
		
//		c1.method2(); // �θ�Ŭ������ ����鸸 ȣ��.
		
		if(c1 instanceof Child2) {
			Child2 c2 = (Child2) c1; // ������ ����ȯ(casting)
			c2.method2();
		}
		
		Parent c3 = new Parent();
		if(c3 instanceof Child2) {
		Child2 c4 = (Child2) c3; // casting.�۾�
		c4.method2();
		}
	}
}
