package co.edu;

import java.util.Arrays;

public class Student {
	// 필드
	private int id; //private은 외부에서 볼 수 없도록 숨기는 기능
	private String name;
	private String major;
	private int age; // 정수값 23, 0, -12 들어올 수는 있다.
	private String[] hobbies = new String[5]; // 여러개의 값을 담을수 있도록 배열로.
	
	// 정적메소드.
	public static void staticMethod() {
		System.out.println("staticMethod call.");
	}
	
	// 취미 get, set
	void setHobbies(String[] hobbies) { // 매개값 hobbies
//		this.hobbies = hobbies;
		for(String hobby : hobbies) {
			for(int i=0; i<this.hobbies.length; i++) { 
				if(this.hobbies[i] == null) {
					this.hobbies[i] = hobby;
					break;
				}
			}
		}
	}
	String[] getHobbies() {
		return this.hobbies;
	}
	String getHobb() {
		String str = "취미는 ";
		for(String hobby : hobbies) {
			if(hobby != null)
			str += hobby + " ";
		}
		str += "입니다.";
		return str;
	}
	// 취미를 추가.
	void addHobby(String hobby) {
		System.out.println(hobbies.length);
		for(int i=0; i<hobbies.length; i++) {
			if(hobbies[i] == null) {
				hobbies[i] = hobby;
				break;
			}
		}
	}
	
	// 학번 set, get
	void setId(int id) {
		this.id = id;
	}
	int getId() {
		return this.id;
	}
	// 학생이름 set, get
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return this.name;
	}
	// 전공 set, get
	void setMajor(String major) {
		this.major = major;
	}
	String getMajor() {
		return this.major;
	}
	// 학생나이 set, get
	void setAge(int age) {
		if(age < 0) {
			this.age = 0; // this는 인스턴스의 필드를 가르킨다.
		}else{
			this.age = age;
		}
	}
	int getAge() {
		return this.age;
	} 
	// showInfo()
	public String showInfo() {
		return "이름은 " + this.name + "이고 학번은 " + this.id + "이고 " + 
			   "전공은 " + this.major + "입니다.";
	}
	
	// 생성자(필드의 값을 초기화) 생성자 오버로딩(동일한 이름의 생성자를 여러번 정의) 필요한 만큼 오버로딩해서 사용하면 된다.
	public Student() {
		//매개값이 없는 생성자 => 기본 생성자.
		this.name = "기본값";
		this.id = 000;
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Student(int id, String name, String major) {
		this(id, name); // 기본생성자 호출
		this.major = major;
	}
	
	
	// 메소드(반드시 반환타입을 정해줘야한다.)
	void study(String study) {
		System.out.println(name + "가 " + study + "를 공부합니다.");
	}
	void play(String play) {
		System.out.println(name + "가 " + play + "를 합니다.");
	}
	void sleep() {
		System.out.println(name + "가 잠을잡니다.");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + ", age=" + age + ", hobbies="
				+ Arrays.toString(hobbies) + "]";
	}
	
}
