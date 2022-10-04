package co.edu.emp;

// CRUD기능 처리.
public interface EmployeeService {
	// 초기화(init)
	public void init();
	// 추가
	public void input();
	public String search(int employeeId); // 사원번호에 해당하는 이름을 반환.
	public void print(); // 전체 사원정보 출력.
}
