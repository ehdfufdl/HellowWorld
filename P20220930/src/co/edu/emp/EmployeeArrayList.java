package co.edu.emp;

// 컬렉션을 활용해서 데이터를 저장.
public class EmployeeArrayList implements EmployeeService {
	//저장공간 생성.
	Employee[] list;
	
	@Override
	public void init() {
		System.out.println("사원수 입력");
	}

	@Override
	public void input() {

	}

	@Override
	public String search(int employeeId) {
		return null;
	}

	@Override
	public void print() {

	}

}
