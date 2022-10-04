package co.edu.inherit.friend;

public class Cat extends Animal { // 추상클래스를 상속
	
	// Animal클래스의 추상메소드를 반드시 구현해줘야한다.
	@Override
	public void eat() {
		System.out.println("고양이가 먹이를 먹습니다.");
	}
	
	@Override
	public void speak() {
		System.out.println("야옹야옹.");
	}
}
