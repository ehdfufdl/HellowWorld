package co.edu.inherit.friend;

public abstract class Animal { // 추상클래스
	private String kind; // 생성자로 인스턴스 만들지 못한다. 규칙만 제공
	public Animal() {
		
	}
	public Animal(String kind) {
		this.kind = kind;
	}
	public void move() {
		System.out.println("움직입니다.");
	}
	public abstract void eat(); // 추상메소드: 자식클래스에서 반드시 구현.
	public abstract void speak(); // eat, speak기능을 자식클래스에서 구현.
}
