package co.edu.api;

import java.util.HashSet;
import java.util.Set;

class Student {
	String name;
	int age;
	
	// Set �÷��� : ������ �ν��Ͻ��� ��������ʴ� �÷���.
	@Override
	public int hashCode() { // hashCode : ��ü�� �������ִ� ����ũ�� ���� ��ȯ.
		return age; 
	}
	
	@Override
	public String toString() {
		return "�л��� �̸��� " + name + ", ���̴� " + age + "�Դϴ�.";
	}

	@Override // Override : �θ�Ŭ������ ������ �ִ� �޼ҵ带 �ڽ�Ŭ������ ������.
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) {
			return false;
		}
		Student str = (Student) obj;
		if (this.name.equals(str.name) && this.age == str.age) // equals�� ����Ÿ�� , int ����Ÿ���� == ���.
			return true;

		return false;

	}
}

// ��� Ŭ������ �ֻ��� Object.
public class ObjectExe {

	public static void main(String[] args) {

		Object obj = new Object();
		Object obj2 = new Object();

		System.out.println(obj.equals(obj2)); // obj == obj2 �ּҰ� ��

		Student s1 = new Student();
		s1.name = "Hong";
		s1.age = 10;
		Student s2 = new Student();
		s2.name = "Hong";
		s2.age = 11;
		String s3 = "Hong";

//		System.out.println(s1.equals(s3)); // �����߻�.
//		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		// Set �÷��� : �������̽� 
		Set<Integer> set = new HashSet<Integer>(); // �������̽��� �ν��Ͻ� ���� �Ұ��� -> ����Ŭ������ ���ؼ� �ν��Ͻ� ����.
		set.add(new Integer(100));
		set.add(new Integer(110));
		set.add(new Integer(100));
		
		System.out.println("�÷����� ũ��: " + set.size());
		
		// Set �÷��ǿ� Student �ν��Ͻ� ����� �������� ������ �ν��Ͻ� �Ǵ�.
		// hashCode(), equals() => ����.
		Set<Student> students = new HashSet<Student>();
		students.add(s1);
		students.add(s2);
		System.out.println("�÷����� ũ��: " + set.size());

	}
}
