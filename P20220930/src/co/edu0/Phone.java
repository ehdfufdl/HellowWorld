package co.edu0;

public class Phone {
	private String name;
	private int number;
	private String nick;
	
	public Phone() {} // 매개변수가 없는 기본생성자.

	public Phone(String name, int number, String nick) {
		super(); // 상속
		this.name = name;
		this.number = number;
		this.nick = nick;
	}
	
	// 이름
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// 번호
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	// 별명
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
