package generic;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 사용자 정의 클래스에 대한 제네릭 타입 적용
		 * */
		
		// int 만 저장 가능
		NormalIntegerClass nic = new NormalIntegerClass();
		nic.data = 10;
		// nic.data = "홍길동";
		
		// => 여러 데이터타입 데이터를 모두 저장하려면 최소한 Object 타입 변수 선언해야함
		// ----------------------------------------------------------
		
		// Object 타입 변수이므로 모든 데이터타입 저장 가능
		// 단, 객체 내의 데이터 꺼내서 사용할 때 타입 판별 필수!
		NormalObjectClass noc = new NormalObjectClass();
		noc.data = 10;
		noc.data = 3.14;
		noc.data = "홍길동";
		
		// ----------------------------------------------------------
		// 사용자 정의 클래스에 대한 제네릭 타입 적용
		// 제네릭을 사용한 클래스의 인스턴스 생성
		// => 제네릭 타입 지정 시 반드시 클래스 타입(참조형)으로 명시!
		GenericClass<Integer> gc = new GenericClass<Integer>();
		// => GenericClass 내의 모든 T 타입이 Integer로 변경됨
		
		gc.setData(1);
		System.out.println(gc.getData());
		int num = gc.getData(); // 오토언박싱 일어남
		
		// 제네릭 타입 Double로 변경 (대체)
		GenericClass<Double> gc2 = new GenericClass<Double>();
		gc2.setData(3.14);
		double num2 = gc2.getData(); // 오토언박싱
		System.out.println(num2);
		
		// 제네릭 타입 String으로 변경 (대체)
		GenericClass<String> gc3 = new GenericClass<String>();
		gc3.setData("홍길동");
		String str1 = gc3.getData();
		System.out.println(str1);
		
		// 제네릭타입 미설정 시 : Object 타입으로 지정됨
		// 단, 미설정 시 경고 메세지가 표시되므로 제네릭 표기 권고
		GenericClass gc4 = new GenericClass();
		GenericClass<Object> gc5 = new GenericClass<Object>();
		
	}

}

/*
 * 제네릭을 사용한 클래스 정의
 * - 클래스 정의 시점에서 클래스명 뒤에 <> 기호를 쓰고, 기호 사이에 '가상의 데이터타입' 명시
 *   => 보통 1글자 영문 대문자 사용(주로 E(Element), T(Type) 등을 사용)
 *   => 가상의 데이터타입이므로 실제 데이터타입으로 사용은 불가능하나
 *      제네릭 타입에서 '임시'로 설정 하여 관리함
 * - 지정된 가상의 자료형은 클래스 내부에서 실제 데이터타입 명시하는 부분에 대체가 가능함     
 * 
 * */

// 제네릭을 적용하지 않은 일반 클래스 정의
// 1) 사용할 데이터타입을 특정 타입으로 관리하는 일반 클래스
class NormalIntegerClass {
	int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}

//1) 사용할 데이터타입을 Object 타입으로 관리하는 일반 클래스
class NormalObjectClass {
	Object data; // 모든 데이터 타입 저장 가능
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
}

// 제네릭을 사용한 클래스 정의
// 클래스 정의 시점에서 클래스명 뒤에 <> 기호 쓰고 그 사이에 '가상의 데이터타입' 명시
//   => 보통 1글자 영문 대문자 사용 (주로 E(Element) 또는 T(Type))
//   => 가상의 데이터타입이므로 실제 데이터타입으로 사용은 불가능하나
//		제네릭 타입에서 '임시'로 설정하여 관리함
// 지정된 가상의 자료형은 클래스 내부에서 실제 데이터타입 명시하는 부분에 대체 가능

class GenericClass<T> {
	// 제네릭타입 T로 지정 시 클래스 내의 데이터타입 부분을 T로 지정하여
	// 임시 데이터타입으로 클래스 정의 가능(실제 사용 가능한 데이터타입은 아님!)
	// => 차후 객체 생성 시점에서 제네릭 타입에 대한 실제 데이터타입을 명시할 경우
	//	  현재 클래스 내의 제네릭타입(T) 부분이 지정된 데이터타입으로 대체됨
	// => 실제 인스턴스 생성 시점에서 어떠한 데이터타입으로도 바꿀 수 있다!
	T data;
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}
