package co.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee {
	int empId;
	String name;
	int salary;

	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	// ������ ��ü.
	@Override
	public int hashCode() {
		return empId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee target = (Employee) obj; // casting.
//			return this.empId == target.empId;
			return (this.empId == target.empId && this.name.equals(target.name) && this.salary == target.salary);
		} else {
			return false;
		}

	}
}

public class SetExample {
	public static void main(String[] args) {
		// Set �÷���
		Set<Employee> employees = new HashSet<Employee>();
		// �߰�
		employees.add(new Employee(100, "ȫ�浿", 1000));
		employees.add(new Employee(200, "�Ӳ���", 2000));
		employees.add(new Employee(300, "����", 3000));
		employees.add(new Employee(100, "��浿", 4000));

		// ����
		employees.remove(new Employee(100, "��浿", 4000));

		System.out.println(employees.size());

		Iterator<Employee> iter = employees.iterator();
		while (iter.hasNext()) {
			Employee emp = iter.next();
			System.out.printf("����� %d, �̸��� %s, �޿��� %d\n", emp.empId, emp.name, emp.salary);
		}

		Set<Integer> set = new HashSet<Integer>();
		
		// �ߺ����X.
		while(set.size() < 7) {
			set.add((int) (Math.random() * 45) + 1);
		}
		for(int n : set) {
			System.out.println(n);
		}

		// �ߺ����� �Ұ�.
//		int[] lotto = new int[7];
//		for (int i = 0; i < lotto.length; i++) {
//			int temp = (int) (Math.random() * 7) + 1;
//			// ���� �ε��� ������ ���� ��ġ�� temp�� ���� ���� �ִ� üũ.
//			boolean exists = false;
//			for (int j = 0; j < i; j++) {
//				// ���� ���� ������..
//				exists = true;
//				if (lotto[i] != temp) {
//					break;
//				}
//			}
//			// continue;
//			if (lotto[i] == temp) {
//				continue;
//			}
//			lotto[i] = temp;
//		}
//		for (int n : lotto) {
//			System.out.printf("%d ", n);
//		}
	}
}
