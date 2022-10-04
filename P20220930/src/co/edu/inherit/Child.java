package co.edu.inherit;

public class Child extends Parent {
	String field1;
	Child(){
		super("args"); // 부모클래스의 생성자호출. super는 부모는 클래스를 지칭하는것.
		System.out.println("Child() call");
	}
	
	void method1() {
		System.out.println("method1() call."); //Child 클래스만 가지고 있는 메소드
	}
	
	//부모클래스의 메소드를 재정의. overriding.
	//자식클래스에서 부모클래스의 메소드를 그대로 물려받을 수도있고 자식클래스에서 메소드를 재정의해서 사용할 수도 있다.
	//부모의클래스의 리턴타입이랑 매개값이 같아야한다.
	@Override // 어노테이션: 부모클래스의 메소드(반환ㄱ밧, 메소드의 이름, 매개값)체크
	void method() {
		System.out.println("Child method() call.");
	}
	
	@Override
	public String toString() {
		return "Child [field1=" + field1 + "]";
	}	
	
}
