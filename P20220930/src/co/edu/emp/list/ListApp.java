package co.edu.emp.list;

import java.util.ArrayList;

import co.edu.emp.Employee;

public class ListApp {
	public static void main(String[] args) {
		// �迭 -> �÷���(ArrayList, HashSet, HashMap)
		String[] strAry = new String[10]; // �迭�� ũ�Ⱑ ���� but ArrayList�� ��� ���� �� �ִ�.
		// Object <- ������ ��� Ŭ����
		ArrayList<String> list = new ArrayList<String>(); // ���ڿ� Ÿ�Ը� ���� �� �ִ� ArrayList
//		ArrayList list = new ArrayList();
		list.add("Hello");
		list.add("Employee");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // �ε�����
		}
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
		


		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(100);
//		intList.add("100");

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(100, "ȫ�浿", 1000));
		empList.add(new Employee(200, "��μ�", 2000));
		empList.add(new Employee(300, "���α�", 3000));
		empList.add(new Employee(400, "Ȳ����", 4000));
//		empList.add(100);
		
		String result = null;
		int salary = 0;
		for(int i=0; i<empList.size(); i++) {
			if(empList.get(i).getEmployeeId() == 200) {
				result = empList.get(i).getName();
				salary = empList.get(i).getSalary();
			}
		}
		System.out.println("�̸��� " + result + "�̰� �޿��� " + salary + "�Դϴ�.");
	}
}
