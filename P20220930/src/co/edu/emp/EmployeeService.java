package co.edu.emp;

// CRUD��� ó��.
public interface EmployeeService {
	// �ʱ�ȭ(init)
	public void init();
	// �߰�
	public void input();
	public String search(int employeeId); // �����ȣ�� �ش��ϴ� �̸��� ��ȯ.
	public void print(); // ��ü ������� ���.
}
