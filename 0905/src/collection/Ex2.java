package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 3. Map 계열 (= DTO)
		 * - 데이터 키(Key)와 값(Value) 한 쌍의 형태로 관리하는 자료 구조
		 * - 키는 중복이 불가능하며, 값은 중복이 가능함 
		 *   => 키 관리 객체 : Set(중복 제거에 효과적)
		 * - 구현체 클래스 : HashMap, Properties 등  
		 * */
		
		Map map =  new HashMap();
		
		map.put(1, "Java");
		map.put(2, "JSP");
		map.put(3, "Android");
		
		System.out.println("map 객체의 모든 키와 값 출력 : " + map); // toString 생략
		
		// 중복 키로 다른 값 저장하는 경우 : 덮어씌워짐
		// => 제거되는 값이 Object 타입으로 리턴됨
		System.out.println("기존 3번 키 값 : " + map.put(3, "Oracle"));
		System.out.println("map 객체의 모든 키와 값 출력 : " + map);
		
		// 새로운 키에 중복된 값을 저장하는 경우
		// 값 중복은 상관 없음!
		map.put(4, "JSP");
		System.out.println("map 객체의 모든 키와 값 출력 : " + map);
		
		// get(Object key) : key에 해당하는 value 리턴 (리턴타입 : Object)
		// => key 가 존재하지 않으면 null 값 리턴됨
		System.out.println("정수 2에 해당하는 키의 데이터 : " + map.get(2));
		System.out.println("정수 6에 해당하는 키의 데이터 : " + map.get(6)); // null 리턴
		
		// keySet() : Map 객체 내의 모든 키 리턴 (리턴타입 : Set)
		Set keySet = map.keySet();
		System.out.println("map 객체 내의 모든 키 : " + keySet);
		
		// values() : Map 객체 내의 모든 값 리턴 (리턴타입 : Collection)
		// => Set 타입 또는 List 타입 등의 변수에 할당 불가능 (다운캐스팅도 불가능!)
		System.out.println("map 객체 내의 모든 값 : " + map.values());
		
		// 불가능! 원래 객체 자체가 Collection 이어서 다운캐스팅 불가
		// List list = (List)map.values();
		// Set set = (Set)map.values();
		
		Collection c = map.values();
		// 생성자 파라미터로 보내는 건 가능!
		Set values = new HashSet(c);
		List values2 = new ArrayList(c);
		System.out.println("map 객체 내의 모든 값 (Set) : " + values); // 중복 제거되므로 "JSP" 는 한 번만 나옴! (주의!)
		System.out.println("map 객체 내의 모든 값 (List) : " + values2);
		
		// entrySet() : 키와 값을 한 쌍으로 갖는 Map.Entry 객체의 모임 (리턴타입 : Set)
		// 키와 값의 한 쌍이 중복될 수 없으므로 Set 타입으로 관리됨
		Set entrySet = map.entrySet();
		System.out.println(entrySet);
		
		System.out.println("map 객체가 비어있는가? : " + map.isEmpty());
		System.out.println("map 객체에 저장된 요소 갯수 : " + map.size());
		
		// remove() : 요소 제거 (리턴타입 : Object or boolean)
		// Object : remove(Object key) : key 에 해당하는 요소 제거
		// 존재하지 않는 키를 지정할 경우 null 값 리턴됨
		System.out.println("4번 key에 해당하는 요소 제거 : " + map.remove(4));
		System.out.println("map 객체 내의 모든 값 : " + map);
		System.out.println("4번 key에 해당하는 요소 제거 : " + map.remove(4)); // null
		
		// boolean remove(Object key, Object value) : key 와 value 모두 일치하는 요소 제거
		System.out.println("3번 key 의 Oracle 값에 해당하는 요소 제거 : " + map.remove(3, "Oracle"));
		System.out.println("map 객체 내의 모든 값 : " + map);
		
		// 키와 값이 일치하지 않거나 존재하지 않는 키를 지정할 경우 => false 리턴
		System.out.println("3번 key 의 Oracle 값에 해당하는 요소 제거 : " + map.remove(3, "Oracle"));
		System.out.println("2번 key 의 Java 값에 해당하는 요소 제거 : " + map.remove(2, "Java"));
		System.out.println("map 객체 내의 모든 값 : " + map);
		
		System.out.println("-------------------------------------------------------------------------");
		
		Map map2 = new HashMap();
		map2.put("010-1111-1111", "홍길동");
		map2.put("010-2222-2222", "이순신");
		map2.put("010-3333-3333", "강감찬");
		
		// map2 객체 내의 모든 key와 value를 다음 형식으로 출력
		// 이름: XXX, 전화번호: XXX
		
		// Map 객체 반복하는 법
		// 1. Iterator 사용 시
		// => Map 객체의 keySet() 메서드를 호출하여 모든 키를 꺼낸 다음
		//    해당 Key가 저장된 Set 객체의 iterator() 메서드를 호출하여
		//    Iterator 객체 리턴 받아 사용
		Set keySet2 = map2.keySet();
		Iterator keyIterator = keySet2.iterator();
		
		while(keyIterator.hasNext()) {
			// 다음 요소 (키) 가 존재할 동안 반복
			// 1) 키를 꺼내기 위해서 next() 메서드로 반복자의 키 하나씩 접근
			// => 이때, next() 메서드 리턴타입이 Object 이므로 상황에 따라 형변환 필요
			
			// toString으로 String 타입으로 변환 (next() 리턴타입은 Object)
			String phone = keyIterator.next().toString();
			String name = map2.get(phone).toString();
			
			System.out.println("이름 : " + name + ", 전화번호 : " + phone);
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		// Key를 사용하여 반복하지 않고 Map.Entry 객체를 통한 반복
		Set entrySet2 = map2.entrySet();
		Iterator entryIterator = entrySet2.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry entry = (Map.Entry)entryIterator.next();
			
			String phone = entry.getKey().toString();
			String name = entry.getValue().toString();
			
			System.out.println("이름 : " + name + ", 전화번호 : " + phone);
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		// 2. 향상된 for 문
		for(Object phone : map2.keySet()) {
			Object name = map2.get(phone);
			System.out.println("이름 : " + name + ", 전화번호 : " + phone);
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		Map<String, String> map3 = new HashMap(map2);
		
		for(Map.Entry<String, String> entry : map3.entrySet()) {
			System.out.println("이름 : " + entry.getValue() + ", 전화번호 : " + entry.getKey());
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		// containsKey(Object key) : 해당 key 값 존재하는지 판별 (리턴타입 : boolean)
		System.out.println("전화번호 010-1111-1111 이 존재하는가? : " + map2.containsKey("010-1111-1111"));
		
		// containsValue(Object value) : 해당 value 값 존재하는지 판별 (리턴타입 : boolean)
		System.out.println("이름 홍길동이 존재하는가? : " + map2.containsValue("홍길동"));
		System.out.println("이름 김감자가 존재하는가? : " + map2.containsValue("김감자"));
		
		// clear() : 모든 값 제거 (리턴타입 없음)
		map2.clear();
		System.out.println("map2 객체 내의 모든 값 : " + map2);
	}

}
