package co.edu.inherit.friend;

public class Friend {
	private String name;
	private String phone;
	
	public Friend() {} // �⺻������ ����.
	public Friend(String name, String phone) {
		super(); // Object ��� �����ڸ� ȣ��.
		this.name = name;
		this.phone = phone;
	}
	
	//public�� ������ ����Ʈ�������� = ������ ��Ű���ȿ����� ���ٰ���.
	//protected�� ��Ӱ���� public�� ����, ��Ű���� �ٸ��� default�� ����
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return this.name;
	}
	public String getPhone() {
		return this.phone;
	}
	public String showInfo() {
		return "ģ���� �̸��� " + name + ", ����ó�� " + phone;
	}
	
}
