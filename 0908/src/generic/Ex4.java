package generic;

public class Ex4 {

	public static void main(String[] args) {
		subClass<Integer, String, Object> sc = new subClass<Integer, String, Object>();
		sc.var1 = 1;
		sc.var2 = "홍길동";
		sc.var3 = 3.14;
		
		// -------------------------------------------------------------------------------
		
		GenericClass3<Integer> gc; // 가능
		GenericClass3<Double> gc1; // 가능
		GenericClass3<Number> gc2; // 가능
		// GenericClass3<String> gc2; // 불가능 => Number 클래스 하위 타입이 아님
		// GenericClass3<Object> gc3; // 불가능 => Number 클래스 하위 타입이 아님
		
		// -------------------------------------------------------------------------------
	}

}

// 제네릭 타입의 상속과 구현
class Class1<P>{}

interface Interface1<Q> {}

// 부모 타입에 제네릭 타입이 지정되어 있을 경우
// 서브클래스에서 상속 받을 때 부모의 타입 파라미터를 서브클래스 타입파라미터로 명시 해야한다!

// <P, Q> <Q, P> 순서 상관 없음! => 대신 생성 시 파라미터 지정 순서는 신경써야함!
// R 은 subClass 자체의 제네릭 타입
class subClass<P, Q, R> extends Class1<P> implements Interface1<Q> {
	P var1; // 슈퍼클래스 Class1 의 타입
	Q var2; // 슈퍼클래스 Interface1의 타입
	R var3; // 자신의 타입
}


/*
 * 제네릭 타입에 대한 사용 가능한 파라미터 타입 제한
 * - 제네릭 타입 파라미터 선언 시 Object 타입과 그 자식 타입들 모두 사용 가능
 * - 필요에 따라 파라미터 타입에 올 수 있는 데이터타입을 제한할 수 있음
 * 
 * < 기본 문법 >
 * - 파라미터에 대한 서브클래스 타입으로 제한하는 경우
 *   class 클래스명<타입파라미터 extends 클래스타입> {}
 *   => 타입 파라미터(ex. E 또는 T등)는 extends 뒤에 클래스 타입이나 하위 타입만 지정 가능
 * */

class GenericClass3<E extends Number> {}
// => Number 타입 또는 Number 클래스 하위 타입(Integer, Double 등) 으로만 변환 가능

