package co.edu.inherit.dbinterface;

public class MysqlDAO implements DaoService {
	
	@Override
	public void insert() {
		System.out.println("mysql ����.");
	}
	
	@Override
	public void modify() {
		System.out.println("mysql ����.");
	}
	
	@Override
	public void remove() {
		System.out.println("mysql ����.");
	}
	
	@Override
	public void search() {
		System.out.println("mysql ��ȸ.");
	}
	
//	public void insert() {
//		System.out.println("mysql ����.");
//	}
//	public void search() {
//		System.out.println("mysql ��ȸ");
//	}
//	public void delete() {
//		System.out.println("mysql ����");
//	}
//	public void update() {
//		System.out.println("mysql ����");
//	}
}
