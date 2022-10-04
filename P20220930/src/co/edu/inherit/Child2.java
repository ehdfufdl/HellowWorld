package co.edu.inherit;

public class Child2 extends Parent { // extends 자식클래스가 상속할 부모 클래스를 짖어하는 키워드.
	String field2;
	Child2(){
		System.out.println("Child2() call.");
	}
	void method2() {
		System.out.println("method2() call.");
	}
}
