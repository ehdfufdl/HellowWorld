package Book;

import java.io.IOException;

public class ByteToStringExample {
	public static void main(String[] args) {

			byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

			String str1 = new String(bytes); // bytes�� ��ȯ.
			System.out.println(str1);
			
			String str2 = new String(bytes, 6, 4); // bytes�� 6��° 74�� �ε��� ��ġ �������� 4��
			System.out.println(str2);
			
			
		}
}

