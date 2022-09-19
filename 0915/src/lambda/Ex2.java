package lambda;

// 1. 파라미터 X, 리턴타입 X
@FunctionalInterface // 이 어노테이션을 쓰려면 (= 람다식으로 표현할 인터페이스)
interface MyFunc1 {
	public void methodA();
	// public void methodB(); => 함수형 인터페이스는 반드시 하나의 추상메소드(abstract method)를 가져야함
}

// 2. 파라미터 O
interface MyFunc2 {
	public void methodB(String msg);
}

// 3. 파라미터 O, 리턴타입 O
interface MyFunc3 {
	public String methodC(String msg);
}

// -------------------------------------------------------------------------------------

public class Ex2 {
	
	// 1. 파라미터 X, 리턴타입 X
	public static void useFINethodA(MyFunc1 fi) {
		fi.methodA();
	}
	// 2. 파라미터 O
	public static void useFINethodB(MyFunc2 fi) {
		fi.methodB("홍길동");
	}
	
	// 3. 파라미터 O, 리턴타입 O
	public static String useFINethodC(MyFunc3 fi) {
		return fi.methodC("홍길동");
	}

// -------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		/*
		 * 함수형 인터페이스(functional interface) 또는 타겟 타입(target type)
		 * - 람다식은 결과적으로 "인터페이스 타입의 클래스를 손쉽게 구현하는 방법" 이다.
		 * - 반드시 하나의 abstract 메소드만 존재
		 * - 만약 abstract 메소드가 없거나 두 개 이상 존재한다면 람다식으로 대체할 수 없다!
		 * - 함수형 인터페이스 @FunctionalInterface 어노테이션 선언
		 * */
		
		useFINethodA(new MyFunc1() {
			@Override
			public void methodA() {
				System.out.println("익명 내부클래스 형태");
			}
		});
		
		// 1. 파라미터 X, 리턴타입 X
		useFINethodA(() -> { System.out.println("람다식1"); });
		
		// 축약 버전 (중괄호 생략)
		useFINethodA(() -> System.out.println("람다식1"));
		
		// -----------------------------------------------------------------------------
		
		// 2. 파라미터 O
		useFINethodB((String msg) -> { System.out.println("람다식2 : " + msg); });
		
		// 파라미터 1, 실행문 1, 데이터타입 추론 가능 : 소괄호, 중괄호, 데이터타입 생략 가능
		useFINethodB(msg -> System.out.println("람다식2 : " + msg));
		
		// -----------------------------------------------------------------------------
		
		// 3. 파라미터 O, 리턴타입 O
		String result = useFINethodC((String msg) -> { return "람다식3 : " + msg; });
		System.out.println(result);
		
		// 파라미터 1, 실행문 1, 데이터타입 추론 가능 : 소괄호, 중괄호, 데이터타입 생략 가능
		System.out.println(useFINethodC(msg -> "람다식3 : " + msg));
	}

}
