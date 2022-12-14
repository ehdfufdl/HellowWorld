package co.edu.emp.list;

import java.util.ArrayList;

import co.edu.emp.Employee;

public class ListApp {
	public static void main(String[] args) {
		// 배열 -> 컬렉션(ArrayList, HashSet, HashMap)
		String[] strAry = new String[10]; // 배열은 크기가 고정 but ArrayList는 계속 담을 수 있다.
		// Object <- 하위의 모든 클래스
		ArrayList<String> list = new ArrayList<String>(); // 문자열 타입만 담을 수 있는 ArrayList
//		ArrayList list = new ArrayList();
		list.add("Hello");
		list.add("Employee");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // 인덱스값
		}
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
		


		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(100);
//		intList.add("100");

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(100, "홍길동", 1000));
		empList.add(new Employee(200, "김민수", 2000));
		empList.add(new Employee(300, "박인기", 3000));
		empList.add(new Employee(400, "황석용", 4000));
//		empList.add(100);
		
		String result = null;
		int salary = 0;
		for(int i=0; i<empList.size(); i++) {
			if(empList.get(i).getEmployeeId() == 200) {
				result = empList.get(i).getName();
				salary = empList.get(i).getSalary();
			}
		}
		System.out.println("이름은 " + result + "이고 급여는 " + salary + "입니다.");
	}
}
