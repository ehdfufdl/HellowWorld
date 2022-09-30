package co.edu;

public class Singleton {
	// private �����ʵ�
	private static Singleton singleton = new Singleton();
	
	// private ������.
	private Singleton() {
				
	}
	
	// public getInstance(); �����ڸ� ���� �� ����.
	public static Singleton getInstance() {
		return singleton;
	}
}
