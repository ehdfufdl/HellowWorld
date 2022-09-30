package co.edu;

import java.util.Arrays;

public class Student {
	// �ʵ�
	private int id; //private�� �ܺο��� �� �� ������ ����� ���
	private String name;
	private String major;
	private int age; // ������ 23, 0, -12 ���� ���� �ִ�.
	private String[] hobbies = new String[5]; // �������� ���� ������ �ֵ��� �迭��.
	
	// �����޼ҵ�.
	public static void staticMethod() {
		System.out.println("staticMethod call.");
	}
	
	// ��� get, set
	void setHobbies(String[] hobbies) { // �Ű��� hobbies
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
		String str = "��̴� ";
		for(String hobby : hobbies) {
			if(hobby != null)
			str += hobby + " ";
		}
		str += "�Դϴ�.";
		return str;
	}
	// ��̸� �߰�.
	void addHobby(String hobby) {
		System.out.println(hobbies.length);
		for(int i=0; i<hobbies.length; i++) {
			if(hobbies[i] == null) {
				hobbies[i] = hobby;
				break;
			}
		}
	}
	
	// �й� set, get
	void setId(int id) {
		this.id = id;
	}
	int getId() {
		return this.id;
	}
	// �л��̸� set, get
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return this.name;
	}
	// ���� set, get
	void setMajor(String major) {
		this.major = major;
	}
	String getMajor() {
		return this.major;
	}
	// �л����� set, get
	void setAge(int age) {
		if(age < 0) {
			this.age = 0; // this�� �ν��Ͻ��� �ʵ带 ����Ų��.
		}else{
			this.age = age;
		}
	}
	int getAge() {
		return this.age;
	} 
	// showInfo()
	public String showInfo() {
		return "�̸��� " + this.name + "�̰� �й��� " + this.id + "�̰� " + 
			   "������ " + this.major + "�Դϴ�.";
	}
	
	// ������(�ʵ��� ���� �ʱ�ȭ) ������ �����ε�(������ �̸��� �����ڸ� ������ ����) �ʿ��� ��ŭ �����ε��ؼ� ����ϸ� �ȴ�.
	public Student() {
		//�Ű����� ���� ������ => �⺻ ������.
		this.name = "�⺻��";
		this.id = 000;
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Student(int id, String name, String major) {
		this(id, name); // �⺻������ ȣ��
		this.major = major;
	}
	
	
	// �޼ҵ�(�ݵ�� ��ȯŸ���� ��������Ѵ�.)
	void study(String study) {
		System.out.println(name + "�� " + study + "�� �����մϴ�.");
	}
	void play(String play) {
		System.out.println(name + "�� " + play + "�� �մϴ�.");
	}
	void sleep() {
		System.out.println(name + "�� ������ϴ�.");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + ", age=" + age + ", hobbies="
				+ Arrays.toString(hobbies) + "]";
	}
	
}
