package co.edu;

public class AppMain2 {
	public static void main(String[] args) {
		
		Student.staticMethod();
		
		Math.random();
		Math.round(.5);
		
		Student s1 = new Student();
//		s1.staticMethot(); // error 아닌데 warning.
		
		s1.setId(123123);
		s1.setName("홍길동");
		s1.setMajor("컴퓨터공학");
		s1.setAge(20);
		
		System.out.println(s1.getId()); // 초기값출력.
		System.out.println(s1.getAge()); // int = 0;
		System.out.println(s1.showInfo());
		
		System.out.println("여기는=>>>" + s1);
		
		Student s2 = new Student();
		
		s2.setName("김민숙");
		s2.setId(123456);
		s2.setMajor("역사학과");
		System.out.println(s2.showInfo());
		
		String[] hob = {"독서", "자전거"};
		s1.setHobbies(hob);
		s1.addHobby("음악듣기");
		System.out.println(s1.getHobb());
		
		s2.addHobby("운동");
		System.out.println(s2.getHobb());
		
		Student s3 = new Student();
		System.out.println(s3.getName());
		
		Student s4 = new Student(789789, "choi");
		System.out.println(s4.showInfo());
		
		Student s5 = new Student(456789, "kong", "경영학과");
		System.out.println(s5.showInfo());
	}
	
	
}
