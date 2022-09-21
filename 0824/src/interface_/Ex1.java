package interface_;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 인터페이스(Interface)
		 * - 클래스가 아니므로 선언 시 class 키워드 대신 interface 키워드 사용
		 * - 인터페이스는 추상메소드와 상수만 가질 수 있다.
		 *   => 모든 메소드는 public abstract 가 붙은 추상메소드로 취급됨 (생략가능)
		 *      (메소드 바디를 가질 수 없으며, public 으로 인해 누구나 접근 가능)
		 *      
		 *   => 모든 멤버변수는 public static final 이 붙은 상수로 취급됨 (생략가능)
		 *      (final로 인해 값 변경 불가, static으로 인해 클래스명만으로 접근 가능하며,
		 *       public 으로 인해 누구나 접근 가능)
		 *       
		 * - 추상클래스와 마찬가지로 객체 생성이 불가능 (추상메소드 때문)
		 *   => 단, 참조변수 타입으로는 사용 가능 = 다형성 활용(업캐스팅) 가능
		 *   
		 * - 추상메소드 구현을 강제하고, 변수를 상수로 강제하여,
		 *   코드의 통일성이 향상됨 = 추상클래스와 유사하나
		 *   추상클래스보다 더 강력한 강제성을 부여하는 것이 목적
		 *   (모든 메소드는 추상메소드이고, 모든 멤버변수는 상수)
		 *   
		 * - 서브클래스에서 인터페이스를 상속 받아 구현해야할 경우 implements 키워드 사용
		 *   => 클래스는 상속받아 확장(extends)의 개념이 강하지만,
		 *      인터페이스는 상속받아 추상메소드 구현(implements)하는 개념이 강함
		 *      
		 * - 클래스는 다중상속이 불가능 하지만, 인터페이스는 다중 구현(implements) 가능함
		 *   => 두 개 이상의 부모 인터페이스로부터 상속(구현) 가능
		 *   => class 서브클래스명 implements 부모인터페이스1, 부모인터페이스2, ... {}
		 *   
		 * - 인터페이스 끼리 상속받을 경우 extends 키워드 사용       
		 * 
		 * */
		
		// 인터페이스는 인스턴스 생성 불가능!
		// new MyInterface();
		
		// 인터페이스를 구현한 구현체 클래스(서브클래스)를 통해 사용해야함
		MySubClass ms = new MySubClass();
		ms.method1();
		ms.method2();
		
		// 인터페이스 내의 모든 변수는 상수이므로 값 변경 불가
		// => 인터페이스를 구현한 구현체 클래스에도 동일한 상수가 상속됨
		//	MyInterface.NUM1 = 10;	// 변경불가
		//	MyInterface.NUM2 = 20;  // 변경불가
		//	MySubClass.NUM1 = 10;	// 변경불가
		//	msc.NUM1 = 10;			// 변경불가
		
		int num = MySubClass.NUM;
		num = ms.NUM2;
		
		// 인터페이스는 인스턴스 생성은 불가능하지만, 참조변수 타입으로 사용 가능
		// => 클래스의 인스턴스를 인터페이스 타입으로도 업캐스팅 가능함(상속 관계이므로)
		MyInterface mi = new MySubClass();
		
		// 업캐스팅 후에는 참조영역이 축소되므로 상속된 메소드만 호출 가능함
	 	// => 하지만, 인터페이스가 정의한 추상메소드를 모두 오버라이딩 했기 때문에
	 	//    인터페이스의 모든 메소드는 참조영역이 축소되더라도 호출 가능함 (공통 메소드)
		mi.method1();
		mi.method2();
		
		// 객체보다는 MyInterface 클래스 명으로 상수 접근하는 것이 좋음
		// 또한, 상수도 인터페이스에서 선언 했으므로 접근가능!
		System.out.println(MyInterface.NUM);
		System.out.println(MySubClass.NUM2);
		
		
	}

}

interface MyInterface {
	
	// 인터페이스 내의 모든 멤버변수는 상수(public static final) 이다.
	public static final int NUM = 10;
	
	// public static final 생략된 "상수"
	int NUM2 = 20;
	
	// 인터페이스 내의 모든 메소드는 추상메소드 => public abstract 생략
	public abstract void method1();
	void method2();
}

class MySubClass implements MyInterface {
	
	// 인터페이스를 상속받아 구현하는 서브클래스에서 반드시 추상메서드 오버라이딩 필수!
	@Override
	public void method1() {
		System.out.println("서브클래스에서 구현한 추상메소드 method1()");
	}

	// 상속관계에서 오버라이딩 시 부모의 접근제한자보다 좁아질 수 없다!
	// => 인터페이스 메소드는 public이므로 더 좁아질 수 없다!
	@Override
	public void method2() {
		System.out.println("서브클래스에서 구현한 추상메소드 method2()");
	}
}
