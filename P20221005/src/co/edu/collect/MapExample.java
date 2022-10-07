package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// key:제네릭 타입, value:제네릭 타입
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// 추가
		map.put(100, "홍길동");
		map.put(200, "김기영");
		map.put(300, "박문식");
		// 동일한 키값이 있으면 안된다.
		map.put(300, "윤문식"); // 기존값이 사라진다.
		
		// 제거
				map.remove(300);
						
		System.out.println("컬렉션: " + map.size());
		
		System.out.println("val: " + map.get(300)); // key값이 300번인 val값을 출력
		
		// 반복자 생성.
		Set<Integer> keySet = map.keySet(); // key만 새로운 set컬렉션에 저장.
		for(Integer key : keySet) {
			System.out.println("키: " + key + ", 값: " + map.get(key));
		}
		
		Set<Entry<Integer, String>> entSet = map.entrySet(); // entry = key + value.
		for(Entry<Integer, String> ent : entSet) {
			System.out.println("키: " + ent.getKey() + ", 값: " + ent.getValue());
		}
	}
}
