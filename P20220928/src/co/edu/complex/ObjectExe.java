package co.edu.complex;

import java.util.Scanner;

public class ObjectExe {
	public static void main(String[] args) {
	
		String s1 = "ȫ�浿";
		int i1 = 20;
		double d1 = 162; // 162.0(promotion = �ڵ� ����ȯ)
		
		Person p1 = new Person(); // �ν��Ͻ� ����.
		p1.name = "��α�";
		p1.age = 22;
		p1.height = 172.3;
		System.out.println(p1);
		
		Person p2 = new Person();
		p2.name = "����";
		p2.age = 23;
		p2.height = 163.2;
		
		Person p3 = new Person(); // �ν��Ͻ� ����.
		p3.name = "�ּҿ�";
		p3.age = 22;
		p3.height = 172.3;
		System.out.println(p3);
		
		System.out.println("�̸�: " + p1.name);
		System.out.println("����: " + p1.age);
		System.out.println("Ű: " + p1.height);
		
		Person[] persons = {p1, p2, p3};
		System.out.println(persons[1].name);
		System.out.println(persons[1].age);
		System.out.println(persons[1].height);
		
//		persons[2].name = "������";
//		p3.name = "��ö��";
		
		//p1�������� persons[0]���� ��.
		System.out.println(persons[0] == p1); // true.
		
		// ���� �̸��� ã�Ƽ� ���̸� 22��� ����.
		// �ݺ� for ==(o,x) => equals
//		String kim = "����"; // ���ڿ����ͷ� 
		Scanner scn = new Scanner(System.in);
		System.out.println("������ �̸�>>> ");
		String name = scn.nextLine();
		System.out.println("������ ����>>> ");
		int age = scn.nextInt();
		for(int i = 0; i < persons.length; i++) {
			if (persons[i].name.equals(name)) {
				persons[i].age = age;
			}			
		}
		
		for(int i=0; i<persons.length; i++) {
			System.out.println(i+ 1 + "��° �̸�: " + persons[i].name + ", ����: " + persons[i].age);
		}
		
//		String n1 = new String("ȫ�浿");
//		String n2 = new String("ȫ�浿");
//		String m1 = "ȫ�浿";
//		String m2 = "ȫ�浿";
//		
//		System.out.println(n1 == n2);
//		System.out.println(m1 == m2);		
		
		
	}
}
