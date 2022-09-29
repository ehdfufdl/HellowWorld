package co.edu.complex;

import java.util.Scanner;

public class ObjectExe {
	public static void main(String[] args) {
	
		String s1 = "홍길동";
		int i1 = 20;
		double d1 = 162; // 162.0(promotion = 자동 형변환)
		
		Person p1 = new Person(); // 인스턴스 생성.
		p1.name = "김민기";
		p1.age = 22;
		p1.height = 172.3;
		System.out.println(p1);
		
		Person p2 = new Person();
		p2.name = "김경미";
		p2.age = 23;
		p2.height = 163.2;
		
		Person p3 = new Person(); // 인스턴스 생성.
		p3.name = "주소영";
		p3.age = 22;
		p3.height = 172.3;
		System.out.println(p3);
		
		System.out.println("이름: " + p1.name);
		System.out.println("나이: " + p1.age);
		System.out.println("키: " + p1.height);
		
		Person[] persons = {p1, p2, p3};
		System.out.println(persons[1].name);
		System.out.println(persons[1].age);
		System.out.println(persons[1].height);
		
//		persons[2].name = "송지은";
//		p3.name = "김철수";
		
		//p1변수값과 persons[0]값을 비교.
		System.out.println(persons[0] == p1); // true.
		
		// 김경미 이름을 찾아서 나이를 22살로 변경.
		// 반복 for ==(o,x) => equals
//		String kim = "김경미"; // 문자열리터럴 
		Scanner scn = new Scanner(System.in);
		System.out.println("변경할 이름>>> ");
		String name = scn.nextLine();
		System.out.println("변경할 나이>>> ");
		int age = scn.nextInt();
		for(int i = 0; i < persons.length; i++) {
			if (persons[i].name.equals(name)) {
				persons[i].age = age;
			}			
		}
		
		for(int i=0; i<persons.length; i++) {
			System.out.println(i+ 1 + "번째 이름: " + persons[i].name + ", 나이: " + persons[i].age);
		}
		
//		String n1 = new String("홍길동");
//		String n2 = new String("홍길동");
//		String m1 = "홍길동";
//		String m2 = "홍길동";
//		
//		System.out.println(n1 == n2);
//		System.out.println(m1 == m2);		
		
		
	}
}
