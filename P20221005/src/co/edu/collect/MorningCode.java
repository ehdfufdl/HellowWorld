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
		
		System.out.println("입력>> ex) 100 홍길동 2500");
		while(true) {
		System.out.println(">> ");
		String inputVal = scanner.nextLine();
		String[] inputs = inputVal.split(" ");

		// quit => 종료.
		if (inputs[0].equals("quit")) {
			break;
		}

		if (inputs.length != 3) {
			System.out.println("다시 입력...");
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
		 * System.out.println(scn.next()); System.out.println(scn.next()); // 공백을 기준으로
		 * 하나씩 출력. = Hello / World / Good / Friend 출력
		 * 
		 */

//		while(scn.hasNext())
//			System.out.println(scn.next());

//		String[] toks = tok.split(" ");
//		for(String str : toks) {
//			System.out.println(str);
//		}

		// 첫번째 값 => empId, 두번째 값 => empName, 세번째 값은 salary
		// Employee클래스의 인스턴스 생성.
		// ArrayList에 저장.
		// 종료를 하고 싶으면 quit 종료.
		// for(반복문) 출력.
	}
}
