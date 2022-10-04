package co.edu.inherit;

public class Parent{ // 기본적으로 모든 클래스는 Object를 상속
	String field;
	Parent(){
		System.out.println("Parent() call.");
	}
	Parent(String args){
		System.out.println("Parent(String args) call.");
	}	
	void method() {
		System.out.println("parent method() call.");
	}
	@Override
	public String toString() {
		return "Parent [field=" + field + "]"; //Object가 가지고 있는 메소드.
	}
	
}
