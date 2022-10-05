package co.edu.emp;

import java.util.ArrayList;
import java.util.Scanner;

// 컬렉션(ArrayList)을 활용해서 데이터를 저장.
public class EmployeeArrayList implements EmployeeService {
	// 저장공간 생성.
	ArrayList<Employee> list;
	int idx = 0;
	Scanner scn = new Scanner(System.in);

	@Override
	public void init() {
		list = new ArrayList<Employee>();
		System.out.println("초기화 완료.");
	}

	@Override
	public void input() {
		System.out.println("사번>> ");
		int eId = -1;
		while (true) {
			try {
				eId = Integer.parseInt(scn.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
			}
		}
		
		System.out.println("이름>> ");
		String name = scn.nextLine();
		
		System.out.println("부서>> ");
		int deptId = -1;
		while(true) {
			try {
				deptId = Integer.parseInt(scn.nextLine());
			}catch(NumberFormatException e1) {
				System.out.println("부서번호는 숫자입니다.");
			}
		}	
		System.out.println("급여>> ");
		int sal = -1;
		while(true) {
			try {
				sal = Integer.parseInt(scn.nextLine());
			}catch(NumberFormatException e2) {
				System.out.println("숫자로 입력하세요.");
			}
		}
		System.out.println("이메일>> ");
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
