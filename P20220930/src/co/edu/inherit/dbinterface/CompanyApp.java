package co.edu.inherit.dbinterface;

public class CompanyApp {
	public static void main(String[] args) {
		// �߰�,����,����,��ȸ���.
//		MysqlDAO dao = new MysqlDAO();
//		dao.insert();
//		dao.update();
//		dao.search();
//		dao.delete();

//		OracleDAO dao = new OracleDAO();
//		dao.add();
//		dao.modify();
//		dao.find();
//		dao.remove();

		DaoService dao = new MysqlDAO(); // ver1.0
		dao = new OracleDAO(); // ver2.0
		dao.insert();
		dao.modify();
		dao.remove();
		dao.search();

		System.out.println("-------------�͸�����ü------------");
		// �͸�����ü : �������̽� �����ϴ� �ڵ常.
		DaoService anonym = new DaoService() {

			@Override
			public void insert() {
				System.out.println("�͸�db �Է�.");
			}

			@Override
			public void modify() {
				System.out.println("�͸�db ����.");
			}

			@Override
			public void remove() {
				System.out.println("�͸�db ����.");
			}

			@Override
			public void search() {
				System.out.println("�͸�db ��ȸ.");
			}

		};
		anonym.insert();
		anonym.search();
	}
}
