package co.edu.inherit.friend;

public class AnimalMain {
	public static void main(String[] args) {
//		Animal animal = new Animal(); // �߻�Ŭ������ �ν��Ͻ� ���� �Ұ���.(new�� ����°� �Ұ���)
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.speak();
		dog.speak();
	}
}
