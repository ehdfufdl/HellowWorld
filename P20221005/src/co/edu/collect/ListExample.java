package co.edu.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListExample {
	public static void main(String[] args) {
		// List �÷���
		ArrayList<String> strs = new ArrayList<String>();
		// �߰�.
		strs.add("ȫ�浿");
		strs.add("��ν�");
		strs.add("������");

		// ����.
		strs.remove(0);
		strs.remove("������");

		// Ư����ġ�� �߰�.
		strs.add(0, "�ֱ��");

		System.out.println("collectũ��: " + strs.size());

		for (String str : strs) {
			System.out.println(str);
		}
		for (int i = 0; i < strs.size(); i++) {
			System.out.printf("%d��°�� ���� %s\n", i, strs.get(i));
		}
		// �ݺ��ڸ� ����.
		Iterator<String> itr = strs.iterator(); // iterator = �÷��� �޼ҵ�.
		while (itr.hasNext()) {
			String result = itr.next();
			System.out.println(result);
		}

		// 100����.
		ArrayList<Integer> inAry = new ArrayList<Integer>();
		long start = System.nanoTime(); //
		for (int i = 0; i < 1000000; i++) {
			inAry.add(i);
		}
		long end = System.nanoTime();
		System.out.println("ary: " + (end - start));
		
		LinkedList<Integer> lnAry = new LinkedList<Integer>();
		 start = System.nanoTime(); //
		for (int i = 0; i < 1000000; i++) {
			inAry.add(i);
		}
		 end = System.nanoTime();
		System.out.println("lna: "+ (end - start));
	}
}
/*
 * �÷��� : ������ �ǹ̷� ���(��ü)�� ������ �����ϴ� ��. list�÷��� : �ε����� ���� , �ߺ��ؼ� ��ü ���� ����. �����ӿ�ũ :
 * ������� ���س��� ���̺귯��.
 */
