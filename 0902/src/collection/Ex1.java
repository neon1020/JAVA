package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 2. List 계열 (배열)
		 * - 인덱스 번호를 사용하여 저장 순서가 유지됨
		 * - 데이터 중복 허용
		 * - 배열과 유사하나, 배열과는 달리 저장 공간이 자동으로 확장됨
		 * - List 계열의 구현체 클래스 : ArrayList, Vector, LinkedList 등
		 * - 기본적인 메소드는 대부분 Set 계열과 동일함 (= 부모가 동일하기 때문에)
		 * 
		 * < ArrayList vs Vector >
		 * - 기본적인 구조가 동일하며, 메소드가 동일함
		 * - ArrayList 와 Vector 의 다른점은 Vector의 경우 멀티쓰레드 환경에서 안전하게 객체를 사용할 수 있다!
		 *   => ArrayList는 멀티쓰레드 환경을 지원하지 않음
		 *   
		 * < ArrayList vs LinkedList >
		 * - 기본적인 구조가 완전히 다르며, 메소드는 동일함
		 * - ArrayList는 배열 구조로써 인덱스를 활용하므로
		 *   데이터 탐색이나 순차적인 추가/삭제에 빠르다
		 *   
		 * - LinkedList는 다음 데이터의 위치를 현재 데이터가 갖고있는 형태이며
		 *   항상 시작점부터 순차적으로 다음 데이터를 추적해가는 형식의 구조
		 *   => 중간 데이터 추가/삭제는 빠르지만 데이터 탐색이나 순차적인 작업은 느림
		 *   
		 * 결론! ArrayList는 데이터를 탐색(select, get)
		 *       LinkedList는 데이터를 추가(insert, add)
		 * */
		
		List list = new ArrayList(); // 업캐스팅
		
		list.add("ONE");
		list.add(2);
		list.add(3.14);
		
		System.out.println("list 객체가 비어있는가? : " + list.isEmpty());
		System.out.println("list 객체에 저장된 요소의 갯수 : " + list.size());
		System.out.println("list 객체의 모든 요소 출력 : " + list); // toString() 생략 + 오버라이딩
		
		System.out.println("-------------------------------------------------------------");
		
		// list 객체의 중복 허용 확인
		System.out.println("중복 데이터 3.14 추가가 가능한가? : " + list.add(3.14));
		System.out.println("list 객체에 저장된 요소의 갯수 : " + list.size());
		System.out.println("list 객체의 모든 요소 출력 : " + list);
		
		System.out.println("-------------------------------------------------------------");
		
		// 특정 인덱스에 값 넣기 => 이런 경우는 Linkedlist 가 더 나음
		// add(int index, Object e)
		list.add(2, 3);
		System.out.println("list 객체의 모든 요소 출력 : " + list);
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("3번 인덱스 요소 : " + list.get(3));
		System.out.println("4번 인덱스 요소 : " + list.get(4));
		
		System.out.println("-------------------------------------------------------------");
		
		// List 객체의 모든 요소 꺼내기
		// 일반 for문 사용하여 List 객체의 get() 메소드로 인덱스 통해 접근 가능
		// => 특정 인덱스 범위 반복 가능하다는 장점 (배열 접근 방법과 동일)
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 향상된 for문도 가능
		for(Object o : list) {
			System.out.println(o);
		}
		
		System.out.println("-------------------------------------------------------------");
		
		// remove(int index) : index에 해당하는 요소 제거 (리턴타입 Object)
		// System.out.println("인덱스 사용하여 정수2 (인덱스1) 삭제 : " + list.remove(1));
		System.out.println("list 객체의 모든 요소 출력 : " + list); // 1번 자리가 null이 되는 것이 아니라 뒷 요소들이 앞으로 당겨짐!
		
		// remove(Object o) : o에 해당하는 객체 제거 (리턴타입 boolean)
		System.out.println("정수 2를 지정하여 해당 요소 직접 삭제 : " + list.remove((Object)2)); // 강제 형변환
		System.out.println("list 객체의 모든 요소 출력 : " + list);
		
		System.out.println("-------------------------------------------------------------");
		
		// set(int index, Object o) : 지정된 인덱스의 데이터를 교체 (덮어쓰기)
		System.out.println("3번 인덱스 요소를 문자 '4'로 교체 : " + list.set(3, '4'));
		System.out.println("list 객체의 모든 요소 출력 : " + list);
		
		System.out.println("-------------------------------------------------------------");
		
		// subList(int fromIndex, int toIndex)
		List subList = list.subList(1, 3); // 1<= index < 3 (마지막 번호는 포함 안 됨)
		System.out.println("1번 인덱스부터 3번 인덱스까지 리스트 추출 : " + subList);
		System.out.println("list 객체의 모든 요소 출력 : " + list);
		
		System.out.println("-------------------------------------------------------------");
		
		// toArray() : List 객체의 모든 요소를 Object[] 배열로 리턴 (리턴타입 Object[])
		Object[] arr = list.toArray();
		
		for(Object o : arr) {
			System.out.println(o);
		}
		
		System.out.println("-------------------------------------------------------------");
		
		list.add(3);
		System.out.println("list 객체의 모든 요소 출력 : " + list);
		
		// indexOf(Object o) : 요소 o의 인덱스를 리턴 (중복값 있을 시 첫인덱스 리턴)
		System.out.println("3이라는 요소의 인덱스 번호 : " + list.indexOf(3));
		
		// lastIndexOf(Object o) : 요소 o의 인덱스를 리턴 (끝 인덱스부터 탐색)
		System.out.println("3이라는 요소의 인덱스 번호 : " + list.lastIndexOf(3));
		
		// 존재하지 않는 요소 지정할 경우 인덱스 번호 -1 리턴 (데이터 없음)
		System.out.println("10이라는 요소의 인덱스 번호 : " + list.indexOf(10));
		
		System.out.println("-------------------------------------------------------------");
		
		// contains(Object o) : 요소 o의 존재 여부 리턴 (리턴타입 boolean)
		System.out.println("실수 3.14가 존재하는가? : " + list.contains(3.14));
		System.out.println("실수 5.0이 존재하는가? : " + list.contains(5.0));
		
		System.out.println("-------------------------------------------------------------");
		
		// List list2 = list;	// 주소저장
		List list2 = new ArrayList(list);
		System.out.println("list2 객체의 모든 요소 출력 : " + list2);
		System.out.println("list와 list2 객체는 동일한 객체인가? : " + (list == list2)); // 주소가 다르므로 false
		System.out.println("list와 list2 객체는 요소가 동일한 객체인가? : " + list.equals(list2)); // true (toString()메소드 오버라이딩 때문)
		
		System.out.println("-------------------------------------------------------------");
		
		// Arrays 클래스 asList() 메소드 호출하여 데이터를 연속적으로 전달하면
		// 해당 데이터들을 List 타입 객체로 변환해줌
		List arrayList = Arrays.asList(1, 2, 3, 4, 5, 6);		
		System.out.println(arrayList);
		
		// 기본 데이터타입 배열 자체를 asList() 메소드 파라미터로 전달하면
		// 정상적인 변환 불가능 (파라미터로는 클래스타입 배열을 전달해야 함!)
		int[] iArr = {1, 2, 3 , 4};
		List arrayList2 = Arrays.asList(iArr);
		System.out.println(arrayList2); // 주소가 출력됨
		
		// but int 타입 대신 클래스타입인 Integer 사용할 경우 사용 가능 (String 등등)
		Integer[] iArr2 = {1, 2, 3, 4, 5};
		List arrayList3 = Arrays.asList(iArr2);
		System.out.println(arrayList3);
		
		System.out.println("-------------------------------------------------------------");
		
		List list3 = Arrays.asList(3, 4, 1, 6, 5, 2);
		System.out.println("정렬 전 : " + list3);
		
		// list3.sort(null);
		// System.out.println("정렬 후 : " + list3);
		
		// Collections 클래스의 static 메소드 sort() 메소드 사용 시 List 객체 정렬 가능
		Collections.sort(list3); // 리턴타입 없음 (정렬만 하고 끝냄!)
		System.out.println("정렬 후 : " + list3);
		
		// Collections 클래스의 static 메소드 shuffle() 메소드 사용 시 List 객체 뒤섞기 가능
		Collections.shuffle(list3);
		System.out.println("셔플 후 : " + list3); // 실행 할 때마다 결과 랜덤으로 나옴
		
		System.out.println("-------------------------------------------------------------");
		
		// TreeSet, HashSet 등을 List 객체로 변환하여 sort, shuffle 등 가능
		Set set = new HashSet();
		set.add(1); set.add(20); set.add(10); set.add(5); set.add(7);
		System.out.println(set);
		
		// Set 객체 생성 시 Arrays.asList() 메소드 통해 List 객체 생성 후
		// 해당 객체를 Set 객체 생성자 파라미터로 전달해도 된다!
		// Set <-> List 상호 변환 가능
		Set set2 = new HashSet(Arrays.asList(1, 20, 10, 5, 7));
		System.out.println("Set 객체 : " + set);
		
		List list4 = new ArrayList(set);
		System.out.println("List 객체 : " + list4);
		Collections.sort(list4);
		System.out.println("List 객체 정렬 후 : " + list4);
		
		System.out.println("-------------------------------------------------------------");
		
		// 중복제거
		List list5 = new ArrayList();
		list5.add("ABCD");
		list5.add("A");
		list5.add("ABCD");
		list5.add("AB");
		list5.add("A");
		list5.add("AB");
		list5.add("ABC");
		
		// 일반 HashSet 으로는 순서 유지 불가
		// Set set2 = new HashSet(list5);
		// List list6 = new ArrayList(set2);
		// System.out.println(list6);
		
		// 순서를 유지하면서 중복을 제거하려면 LinkedHashSet
		Set set3 = new LinkedHashSet(list5);
		List list6 = new ArrayList(set3);
		System.out.println(list6);
	}
}
