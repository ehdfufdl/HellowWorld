package co.edu.inherit.interfaces;

public interface DaoService {
	// 필드x, 생성자x
	// 추상메소드.
	// 필드 대신에 상수값을 정의.
	
	public abstract void insert(); // 추상메소드. 
	public void search(); // 추상메소드. 인터페이스에서는 굳이 abstract 붙일 필요가 없다.
	public void delete(); // 추상메소드. 
	
}
