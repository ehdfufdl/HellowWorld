package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// key:���׸� Ÿ��, value:���׸� Ÿ��
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// �߰�
		map.put(100, "ȫ�浿");
		map.put(200, "��⿵");
		map.put(300, "�ڹ���");
		// ������ Ű���� ������ �ȵȴ�.
		map.put(300, "������"); // �������� �������.
		
		// ����
				map.remove(300);
						
		System.out.println("�÷���: " + map.size());
		
		System.out.println("val: " + map.get(300)); // key���� 300���� val���� ���
		
		// �ݺ��� ����.
		Set<Integer> keySet = map.keySet(); // key�� ���ο� set�÷��ǿ� ����.
		for(Integer key : keySet) {
			System.out.println("Ű: " + key + ", ��: " + map.get(key));
		}
		
		Set<Entry<Integer, String>> entSet = map.entrySet(); // entry = key + value.
		for(Entry<Integer, String> ent : entSet) {
			System.out.println("Ű: " + ent.getKey() + ", ��: " + ent.getValue());
		}
	}
}
