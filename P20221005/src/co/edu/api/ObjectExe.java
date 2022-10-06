package co.edu.api;

import java.util.HashSet;
import java.util.Set;

class Student {
	String name;
	int age;
	
	// Set 컬렉션 : 동일한 인스턴스는 담아주지않는 컬렉션.
	@Override
	public int hashCode() { // hashCode : 객체가 가지고있는 유니크한 값을 반환.
		return age; 
	}
	
	@Override
	public String toString() {
		return "학생의 이름은 " + name + ", 나이는 " + age + "입니다.";
	}

	@Override // Override : 부모클래스가 가지고 있는 메소드를 자식클래스가 재정의.
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) {
			return false;
		}
		Student str = (Student) obj;
		if (this.name.equals(str.name) && this.age == str.age) // equals는 문자타입 , int 정수타입은 == 사용.
			return true;

		return false;

	}
}

// 모든 클래스의 최상위 Object.
public class ObjectExe {

	public static void main(String[] args) {

		Object obj = new Object();
		Object obj2 = new Object();

		System.out.println(obj.equals(obj2)); // obj == obj2 주소값 비교

		Student s1 = new Student();
		s1.name = "Hong";
		s1.age = 10;
		Student s2 = new Student();
		s2.name = "Hong";
		s2.age = 11;
		String s3 = "Hong";

//		System.out.println(s1.equals(s3)); // 에러발생.
//		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		// Set 컬렉션 : 인터페이스 
		Set<Integer> set = new HashSet<Integer>(); // 인터페이스는 인스턴스 생성 불가능 -> 구현클래스를 통해서 인스턴스 생성.
		set.add(new Integer(100));
		set.add(new Integer(110));
		set.add(new Integer(100));
		
		System.out.println("컬렉션의 크기: " + set.size());
		
		// Set 컬렉션에 Student 인스턴스 저장시 논리적으로 동일한 인스턴스 판단.
		// hashCode(), equals() => 기준.
		Set<Student> students = new HashSet<Student>();
		students.add(s1);
		students.add(s2);
		System.out.println("컬렉션의 크기: " + set.size());

	}
}
