package co.edu.collect;

import java.util.ArrayList;
import java.util.Scanner;

class Employ {
	int empId;
	String empName;
	int salary;

	public Employ(int empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}

public class MorningCode {
	public static void main(String[] args) {
//		String tok = "Hello World Good";
//		Scanner scn = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);

		ArrayList<Employ> list = new ArrayList<>();
		
		System.out.println("�Է�>> ex) 100 ȫ�浿 2500");
		while(true) {
		System.out.println(">> ");
		String inputVal = scanner.nextLine();
		String[] inputs = inputVal.split(" ");

		// quit => ����.
		if (inputs[0].equals("quit")) {
			break;
		}

		if (inputs.length != 3) {
			System.out.println("�ٽ� �Է�...");
			continue;
		}

		list.add(new Employ(Integer.parseInt(inputs[0]), inputs[1], Integer.parseInt(inputs[2])));
		}
		
		for (Employ emp : list) {
			System.out.println(emp);
		}
		System.out.println("end of prog");
		/*
		 * System.out.println(scn.next()); System.out.println(scn.next());
		 * System.out.println(scn.next()); System.out.println(scn.next()); // ������ ��������
		 * �ϳ��� ���. = Hello / World / Good / Friend ���
		 * 
		 */

//		while(scn.hasNext())
//			System.out.println(scn.next());

//		String[] toks = tok.split(" ");
//		for(String str : toks) {
//			System.out.println(str);
//		}

		// ù��° �� => empId, �ι�° �� => empName, ����° ���� salary
		// EmployeeŬ������ �ν��Ͻ� ����.
		// ArrayList�� ����.
		// ���Ḧ �ϰ� ������ quit ����.
		// for(�ݺ���) ���.
	}
}
