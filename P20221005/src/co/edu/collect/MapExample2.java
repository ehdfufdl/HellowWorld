package co.edu.collect;

import java.util.HashMap;
import java.util.Map;

class Book{
	String bookCode;
	String author;
	String publish;
	
	public Book(String bookCode, String author, String publish) {
		this.bookCode = bookCode;
		this.author = author;
		this.publish = publish;
	}
	
// hashCode, equals �޼ҵ尡 ������ ���̸�.
	@Override
	public int hashCode() {
		return bookCode.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book target = (Book) obj;
			return this.bookCode.equals(target.bookCode);
		}else {
			return false;
		}
	}
}

public class MapExample2 {
	public static void main(String[] args) {
		Map<Book, Integer> map = new HashMap<>();
		map.put(new Book("239208", "ȫ�浿", "�������ǻ�"), 2000); // "239208", "ȫ�浿", "�������ǻ�") = key��, 2000 = val��
		map.put(new Book("wewew8", "��μ�", "�������ǻ�"), 3000);
		map.put(new Book("abdedf", "ȫ����", "�������ǻ�"), 4000);
		
		Integer val = map.get(new Book("239208", "ȫ�浿", "�������ǻ�"));
		System.out.println("��: " + val);
		
	}
}
