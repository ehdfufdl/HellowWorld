package co.edu;

// �ϳ��� ����Ŭ������ �������� ���̺귯��Ŭ������ �ʿ�.
//����Ŭ����(main)
public class AppMain {
	public static void main(String[] args) {
		// Object -> class -> Instance
		Person kim = new Person(); // �ν��Ͻ� ����.
		kim.name = "��α�";
		kim.age = 20;
		kim.sleep();
		kim.eat("���");
		
//		System.out.println(kim);
		
		Person lee = new Person(); // �ν��Ͻ� ����.
		lee.name = "�̼���";
		lee.age = 25;
		lee.sleep();
		lee.eat("����");
		
		
		Student park = new Student(); // �ν��Ͻ� ����.
//		park.id = 123123;
		park.setId(123123);
//		park.setId() = 123123 // �ȵȴ�
//		park.name = "��OO";
		park.setName("park");
//		park.major = "��ǻ�Ͱ���";
		park.setMajor("��ǻ�Ͱ���");
		park.study("����");
		park.play("��");
		
		Student jung = new Student(); // �ν��Ͻ� ����.
//		jung.id = 123456;
		jung.setId(123456);
//		jung.name = "��OO";
		jung.setName("jung");
//		jung.major = "��ȸ�а�";
		jung.study("����");
		jung.setMajor("��ȸ�а�");
		jung.play("�౸");
		
		Student kang = new Student(); // �ν��Ͻ� ����.
//		kang.id = 567890;
		kang.setId(456456);
//		kang.name = "��OO";
		kang.setName("kang");
//	    kang.major = "�����а�";
		kang.setMajor("�����а�");
	    kang.study("����");
		kang.play("�߱�");
		
	
		
		Student[] students;
		students = new Student[] {park, jung, kang};
		for(Student member : students) {
			System.out.println("�й�: " + member.getId() + ", �л��̸�: " + member.getName()
								+ ", ����: " + member.getMajor()) ;
		}
		
		// ��� = �θ� ���� �ʵ�, �޼ҵ带 �Ȱ��� �� �� �ִ�.
		WorkMan wman = new WorkMan();
		wman.name = "������";
		wman.age = 30;
		
		StudMan sman = new StudMan();
		sman.school = "����б�";
		sman.height = 164.3;
	}
}
