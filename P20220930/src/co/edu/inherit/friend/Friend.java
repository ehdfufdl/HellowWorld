package co.edu.inherit.friend;

public class Friend {
	private String name;
	private String phone;
	
	public Friend() {} // 기본생성자 정의.
	public Friend(String name, String phone) {
		super(); // Object 라는 생성자를 호출.
		this.name = name;
		this.phone = phone;
	}
	
	//public이 없으면 디폴트접근제한 = 동일한 패키지안에서만 접근가능.
	//protected는 상속관계면 public과 동일, 패키지가 다르면 default와 동일
	
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
		return "친구의 이름은 " + name + ", 연락처는 " + phone;
	}
	
}
