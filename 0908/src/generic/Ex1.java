package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 제네릭 (Generic, 일반화)
		 * - 객체에서 사용할 데이터타입을 클래스 정의 시 미리 명시하지 않고
		 *   실제 객체 생성 시 데이터타입을 지정하여 사용하도록 하는 기법
		 *   => 객체를 생성할 때마다 각각 다른 데이터타입으로 사용 가능함
		 *   => 데이터타입 지정 시 반드시 참조데이터타입만 지정 가능함 (기본형 사용 불가)
		 *      ex) int(X) -> Integer
		 *      
		 * - 데이터를 저장하는 시점에서 미리 저장 데이터에 대한 타입을 판별 가능하므로
		 *   데이터 저장시점에서 안정성을 향상시키고,
		 *   데이터를 꺼내는 시점에서 지정된 데이터타입만 저장된다는 보장이 생기므로
		 *   별도의 판별이나 형변환 없이 해당 타입 그대로 사용 가능하게 된다!
		 *     
		 * - 주로, Collection API 들은 대부분 제네릭 타입으로 클래스가 설계되어 있음
		 * 
		 * - 만약, 제네릭 타입 지정을 생략하는 경우 모든 데이터타입은 Object로 고정됨   
		 * */
		
		
		// Collection Framework API의 객체들은 파라미터로 Object 타입을 주로 사용
		List list = new ArrayList();
		list.add(1);
		list.add("TWO");
		list.add(3.14);
		
		// -------------------------------------------------------------------------
		
		// 제네릭 타입 지정하여 Collaction Framwork 객체들을 사용할 수 있다.
		// 데이터 타입은 반드시 참조형 데이터타입만 지정 가능! (기본형 사용 불가)
		// 좌우 데이터타입 맞춰주는 것이 좋음!!
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		for(int data : list2) {
			System.out.println(data);
		}
		
		System.out.println("-------------------------------------------------");
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "홍길동");
	}

}