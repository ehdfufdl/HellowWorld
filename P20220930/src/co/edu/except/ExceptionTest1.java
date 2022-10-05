package co.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {
	public static void main(String[] args) {
		// null pointer ����.
		String str = "Hello World!!";

		// ����ó��.(Runtime exception) �������� ������ ������, ����������� ����.
		try {
			String result = str.substring(0, 10);
			char chr = result.charAt(20);
			System.out.println(chr);
		} catch (NullPointerException | StringIndexOutOfBoundsException e) {
			System.out.println("�����ϴ� ���� �����ϴ�.");
//		} catch(StringIndexOutOfBoundsException e) {
//			System.out.println("�ε��������� ��� ���Դϴ�.");
		} catch(RuntimeException e2) {
			System.out.println("���࿹�ܰ� �߻��߽��ϴ�.");
		} catch(Exception e3) {
			System.out.println("�˼� ���� ���ܰ� �߻��߽��ϴ�."); // ���� ū������ ���ܴ� ���� ��������
		}
		
		// �Ϲݿ��� : Exception ��ӹ޾Ƽ� ó���ϴ� ����Ŭ����.
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		}
		
		Scanner scn = new Scanner(System.in);
		while(true) {
		System.out.println("�����Է�>>> ");
		
		try {
		int menu = scn.nextInt(); // InputMismatchException
			System.out.println("�Է°��� : " + menu);
			break;
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���!");
			scn.nextLine(); //abc (Enter)
		}finally { 
			System.out.println("�ݵ�� ������ �ڵ�.");
			// DB connection ����ϰ� resource ��ȯ.
		}
	}
	
		System.out.println("���α׷� ����.");
	}// end of main()
	
	public static void exceptMethod() throws ClassNotFoundException{
		// �Ϲݿ��� : Exception ��ӹ޾Ƽ� ó���ϴ� ����Ŭ����.
//		try {
			Class.forName("java.lang.String");
//		} catch (ClassNotFoundException e) {		
//			e.printStackTrace();
//		}
//		
//	}
	}
}