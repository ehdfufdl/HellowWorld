package co.edu.emp;

// ������ �Ѱ� ó��.
public class Employee {
	// �ʵ� : �����ȣ, ����̸�, �μ���ȣ, �μ���, �޿�, �̸���
	private int employeeId; //���.
	private String name; //�̸�.
	private int deptId; //�μ���ȣ. 10:�λ� 20:���� 30:����(�⺻��)
	private String deptName; //�μ���
	private int salary; //�޿�
	private String email; //�̸���
	
	
	//������.
	public Employee() {
		// �⺻������.(�Ű������� �⺻������.)
		this.deptId = 30;
		this.deptName = "����";
	}
	
	// �Ű����� 4�� �ִ� ������.
	public Employee(int employeeId, String name, int salary, int deptId) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.deptId = deptId;
		if(this.deptId == 10) {
			this.deptName = "�λ�";
		}else if(this.deptId == 20) {
			this.deptName = "����";
		}else {
			this.deptName = "����";
		}
	}
	
	// �Ű����� 3���ִ� ������.
	public Employee(int employeeId, String name, int salary){
		this(employeeId, name, salary, 30);
	}
	
	// �Ű����� 2���ִ� ������.
	public Employee(int employeeId, String name) {
		this(employeeId, name, 0);
	}
	
	// �Ű����� 5���ִ� ������.
	public Employee(int employeeId, String name, int salary, int deptId, String email) {
		this(employeeId, name, salary, deptId);
		this.email = email;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
		if(this.deptId == 10) {
			this.deptName = "�λ�";
		}else if(this.deptId == 20) {
			this.deptName = "����";
		}else {
			this.deptName = "����";
		}
	}

	public String getDeptName() {
		return deptName;
	}

//	public void setDeptName(String deptName) {
//		this.deptName = deptName;
//	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
