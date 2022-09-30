package co.edu0;

public class Phone {
	private String name;
	private int number;
	private String nick;
	
	public Phone() {} // �Ű������� ���� �⺻������.

	public Phone(String name, int number, String nick) {
		super(); // ���
		this.name = name;
		this.number = number;
		this.nick = nick;
	}
	
	// �̸�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// ��ȣ
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	// ����
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", number=" + number + ", nick=" + nick + "]";
	}
	
}
