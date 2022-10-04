package co.edu.emp;

import java.util.Scanner;

// �迭�� Ȱ���ؼ� ��������.
public class EmployeeArray implements EmployeeService {
	// ������� ����.
	Employee[] list;
	int idx;
	Scanner scn = new Scanner(System.in);

	@Override
	public void init() {
		System.out.println("����� �Է�>> ");
		int cnt = Integer.parseInt(scn.nextLine());
		list = new Employee[cnt]; // 5�� �ν��Ͻ��� ������ �� �ִ� ��������
	}

	@Override
	public void input() {

		if (idx >= list.length) {
			System.out.println("�� �̻� �ԷºҰ�.");
			return; // �޼ҵ� ����
		}

		System.out.println("���>> ");
		int eId = Integer.parseInt(scn.nextLine());
		System.out.println("�̸�>> ");
		String name = scn.nextLine();
		System.out.println("�μ�>> ");
		int deptId = Integer.parseInt(scn.nextLine());
		System.out.println("�޿� ");
		int sal = Integer.parseInt(scn.nextLine());
		System.out.println("�̸���");
		String email = scn.nextLine();

		Employee emp = new Employee(eId, name, sal, deptId, email);
		list[idx++] = emp;
	}

	@Override
	public String search(int employeeId) {
		return null;
	}

	@Override
	public void print() {
		for (int i = 0; i < idx; i++) {
			System.out.printf("%5d %10s %7d\n", list[i].getEmployeeId()
					, list[i].getName()
					, list[i].getSalary());
		}
	}

}
