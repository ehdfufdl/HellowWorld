package co.edu.emp;

import java.util.ArrayList;
import java.util.Scanner;

// �÷���(ArrayList)�� Ȱ���ؼ� �����͸� ����.
public class EmployeeArrayList implements EmployeeService {
	// ������� ����.
	ArrayList<Employee> list;
	int idx = 0;
	Scanner scn = new Scanner(System.in);

	@Override
	public void init() {
		list = new ArrayList<Employee>();
		System.out.println("�ʱ�ȭ �Ϸ�.");
	}

	@Override
	public void input() {
		System.out.println("���>> ");
		int eId = -1;
		while (true) {
			try {
				eId = Integer.parseInt(scn.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
			}
		}
		
		System.out.println("�̸�>> ");
		String name = scn.nextLine();
		
		System.out.println("�μ�>> ");
		int deptId = -1;
		while(true) {
			try {
				deptId = Integer.parseInt(scn.nextLine());
			}catch(NumberFormatException e1) {
				System.out.println("�μ���ȣ�� �����Դϴ�.");
			}
		}	
		System.out.println("�޿�>> ");
		int sal = -1;
		while(true) {
			try {
				sal = Integer.parseInt(scn.nextLine());
			}catch(NumberFormatException e2) {
				System.out.println("���ڷ� �Է��ϼ���.");
			}
		}
		System.out.println("�̸���>> ");
		String email = scn.nextLine();

		Employee emp = new Employee(eId, name, sal, deptId, email);
		list.add(emp);
	}
	

	@Override
	public String search(int employeeId) {
		String result = null;
		for (int i = 0; i < list.size(); i++) {
			Employee emp = list.get(i); // list[i];
			if (emp.getEmployeeId() == employeeId) {
				result = emp.getName();
				break;
			}
		}
//		for(Employee emp : list) {
//			if(emp.getEmployeeId() == employeeId) {
//				result = emp.getName();
//				break;
//			}
//		}
		return result;
	}

	@Override
	public void print() {

	}

	@Override
	public int searchSal(int employeeId) {
		int salary = 0;
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i).getEmployeeId() == employeeId) {
//				salary = list.get(i).getSalary();
//				break;
//			}
//		}
		for (Employee emp : list) {
			if (emp.getEmployeeId() == employeeId) {
				salary = emp.getSalary();
				break;
			}
		}
		return salary;
	}
}
