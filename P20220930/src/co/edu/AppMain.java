package co.edu;

// 하나의 실행클래스와 여러개의 라이브러리클래스가 필요.
//실행클래스(main)
public class AppMain {
	public static void main(String[] args) {
		// Object -> class -> Instance
		Person kim = new Person(); // 인스턴스 생성.
		kim.name = "김민기";
		kim.age = 20;
		kim.sleep();
		kim.eat("사과");
		
//		System.out.println(kim);
		
		Person lee = new Person(); // 인스턴스 생성.
		lee.name = "이순신";
		lee.age = 25;
		lee.sleep();
		lee.eat("피자");
		
		
		Student park = new Student(); // 인스턴스 생성.
//		park.id = 123123;
		park.setId(123123);
//		park.setId() = 123123 // 안된다
//		park.name = "박OO";
		park.setName("park");
//		park.major = "컴퓨터공학";
		park.setMajor("컴퓨터공학");
		park.study("영어");
		park.play("농구");
		
		Student jung = new Student(); // 인스턴스 생성.
//		jung.id = 123456;
		jung.setId(123456);
//		jung.name = "정OO";
		jung.setName("jung");
//		jung.major = "사회학과";
		jung.study("수학");
		jung.setMajor("사회학과");
		jung.play("축구");
		
		Student kang = new Student(); // 인스턴스 생성.
//		kang.id = 567890;
		kang.setId(456456);
//		kang.name = "강OO";
		kang.setName("kang");
//	    kang.major = "보건학과";
		kang.setMajor("보건학과");
	    kang.study("국어");
		kang.play("야구");
		
	
		
		Student[] students;
		students = new Student[] {park, jung, kang};
		for(Student member : students) {
			System.out.println("학번: " + member.getId() + ", 학생이름: " + member.getName()
								+ ", 전공: " + member.getMajor()) ;
		}
		
		// 상속 = 부모가 가진 필드, 메소드를 똑같이 쓸 수 있다.
		WorkMan wman = new WorkMan();
		wman.name = "직장인";
		wman.age = 30;
		
		StudMan sman = new StudMan();
		sman.school = "고등학교";
		sman.height = 164.3;
	}
}
