package co.edu;

public class AppMain2 {
	public static void main(String[] args) {
		
		Student.staticMethod();
		
		Math.random();
		Math.round(.5);
		
		Student s1 = new Student();
//		s1.staticMethot(); // error �ƴѵ� warning.
		
		s1.setId(123123);
		s1.setName("ȫ�浿");
		s1.setMajor("��ǻ�Ͱ���");
		s1.setAge(20);
		
		System.out.println(s1.getId()); // �ʱⰪ���.
		System.out.println(s1.getAge()); // int = 0;
		System.out.println(s1.showInfo());
		
		System.out.println("�����=>>>" + s1);
		
		Student s2 = new Student();
		
		s2.setName("��μ�");
		s2.setId(123456);
		s2.setMajor("�����а�");
		System.out.println(s2.showInfo());
		
		String[] hob = {"����", "������"};
		s1.setHobbies(hob);
		s1.addHobby("���ǵ��");
		System.out.println(s1.getHobb());
		
		s2.addHobby("�");
		System.out.println(s2.getHobb());
		
		Student s3 = new Student();
		System.out.println(s3.getName());
		
		Student s4 = new Student(789789, "choi");
		System.out.println(s4.showInfo());
		
		Student s5 = new Student(456789, "kong", "�濵�а�");
		System.out.println(s5.showInfo());
	}
	
	
}
