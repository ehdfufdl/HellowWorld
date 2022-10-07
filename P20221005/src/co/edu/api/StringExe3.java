package co.edu.api;

import java.util.ArrayList;
import java.util.List;

class Box<T> { // <T> 타입 parameter
	T obj; // 어떤 형태도 다 받아들이겠다.

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

class Member {
	private String name;
	private String id;
	private int point;

	public Member(String name, String id, int point) {
		super();
		this.name = name;
		this.id = id;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}

class Employee {
	private String empName;
	private String empId;
	private int salary;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

public class StringExe3 {
	public static void main(String[] args) {

		Box<String> box = new Box<String>(); // 클래스를 선언한 시점이 아닌 사용하는 시점에 탕비을 정하겠습니다.
		box.set("Hello");
//		box.set(200); // 200은 정수타입, 따라서 get으로 불러올때도 타입을 맞춰줘야한다. 숫자타입은 error.
		String result = box.get();
		System.out.println(result);

		String[] stAry; // 문자열을 담을 수 있는 배열
		List<String> list = new ArrayList<String>(); // 컬렉션타입 <데이터타입>
		list.add("Hello");
//		list.add(200);

		List<Member> members = new ArrayList<Member>();
		members.add(new Member("홍길동", "hong", 10000));
		members.add(new Member("김민기", "kim", 20000));
		members.add(new Member("박인기", "park", 30000));

		List<Employee> employees = changeType(members); // Member = Employee
		for (Employee emp : employees) {
			System.out.println("name: " + emp.getEmpName() + ", id: " + emp.getEmpId());
		}
	}

	public static List<Employee> changeType(List<Member> collect) {
		// 3 -> 3개.
		// coding
		List<Employee> empls = new ArrayList<Employee>();
		for (Member member : collect) {
			Employee emp = new Employee();
			emp.setEmpId(member.getId());
			emp.setEmpName(member.getName());
			emp.setSalary(member.getPoint());

			empls.add(emp);
		}
		return empls;
	}
}
