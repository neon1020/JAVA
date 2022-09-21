package covariant;

import java.beans.beancontext.BeanContext;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 공변(Covariant)
		 * - 공변의 사전적 의미는 "하나가 변하면 다음것이 따라 변한다" 라는 뜻.
		 * 
		 * 오버라이딩 시에 "공변 리턴 타입" (다형성 polymorphism 의 일종)
		 * - 오버라이딩이란 "부모 메소드와 시그니처가 완전히 동일한 메소드를 재정의하는 것"
		 *   => 시그니처: 리턴타입, 메소드명, 매개변수(갯수, 데이터타입, 순서)
		 *   
		 * - 하지만, 부모메소드의 리턴타입이 부모클래스일 경우 오버라이딩 시
		 *   자식클래스 범위안에서 자유롭게 수정 가능하다!!  
		 * 
		 * */
		
		// 실제 객체와 참조변수 타입 같은 상황
		A a = new A();
		B b = new B();
		
		// 실제 객체와 참조변수 타입 다른 상황
		A a2 = new B(); // 업캐스팅 : (A 타입에 저장되어 있지만 실제 객체는 B)
		B b2 = (B)a2; // 다운캐스팅 : (실제 객체도 B)
		
		// 각각의 참조변수로 print() 메소드 호출
		a.print(); // A
		b.print(); // B
		a2.print(); // B
		b2.print(); // B
		
		// => print() 메소드가 오버라이딩 되어 있기 때문에
		//    동적 바인딩으로 인해 실행시점에서 실제 객체의 메소드가 실행된다!
		// 결론 : 어느 타입에 저장되어 있느냐가 중요한것이 아니라 "실제 객체가 무엇이냐"가 중요
		
		System.out.println("---------------------------");
		
		A aType;
		B bType;
		
		// 실제 객체와 참조변수 타입 같은 상황
		aType = a.method();
		// bType =  (B)a.method(); // 실행시점에 오류 발생
		bType = b.method();
		aType = b.method(); // 업캐스팅
		
		System.out.println("---------------------------");
		
		// 실제 객체와 참조변수 타입 다른 상황
		aType = a2.method();
		
		// bType = a2.method();
		// => 참조변수 a2에 저장되어있는 실제 객체는 B타입이다.
		//	  그렇다면 오버라이딩된 method()가 호출되어 B타입이 리턴되어야 하지만!
		// => 어디까지나 동적바인딩의 원리를 우리가 알고 있기 때문에 B클래스의 method()가 실행된다고 알고있는 것이고
		//    컴파일시점 즉, 번역시점(문법적으로는)에는 A타입 참조변수로 method()를 호출하고 있기 때문에 A가 리턴되는 것으로 번역됨
		//    = 문법적오류, 즉 컴파일오류가 발생!
		
		bType = (B)a2.method(); // 문법적 오류로 다운캐스팅 해줘야 함!
		// => 실제 리턴된 객체가 B타입이므로
		//    실행시점 즉, 런타입 오류도 발생하지 않음
		//    (단, 위와같은 강제형변환은 필수!)
		
		// 공변활용 X
			if(b2.method() instanceof B) {
				bType = (B)b2.method();
			}
		
		// 공변활용 O
		bType = b2.method();
		aType = b2.method(); // 업캐스팅
	}

	
	
}

class A {
	public void print() {
		System.out.println("A 메소드가 실행됨");
	}
	
	public A method() {
		// 호출한 객체의 주소 리턴
		return this;
	}
}

class B extends A {
	@Override
	public void print() {
		System.out.println("B 메소드가 실행됨");
	}
	
	// 오버라이딩이지만 리턴타입을 자식 타입으로 변경 가능!
	// (원래 오버라이딩에서는 같은 리턴타입, 메소드명, 파라미터 사용해야함)
	@Override
	public B method() {
		return this;
	}
}
