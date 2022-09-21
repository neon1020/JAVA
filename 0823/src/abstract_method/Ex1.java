package abstract_method;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 추상메소드 (abstract Method)
		 * - 메소드 구현부 (= 바디{}) 가 없는 메소드 (미완성 메소드)
		 * - 메소드의 동작을 기술하는 구현부가 없는 추상메소드는
		 *   실행할 수 있는 코드가 없으므로 외부로 부터 호출하면 안됨
		 *   => 따라서, 추상메소드를 갖는 클래스는 반드시 추상클래스로 선언되어야 한다!
		 * - 메소드 정의 시 선언부의 접근제한자 뒤에 abstract 키워드를 붙여서 정의
		 *   => abstract 키워드가 붙은 메소드는 추상메소드 이므로 바디{} 를 가질수 없다!
		 *      (따라서, 메소드 선언부 마지막에 바디{} 대신 세미콜론(;)으로 끝냄)
		 * - 서브클래스에서 반드시 오버라이딩 하도록 강제성을 부여해야하는 메소드는
		 *   슈퍼클래스에서 추상메소드로 선언하면 서브클래스가 무조건 오버라이딩 필수!
		 *   => 강제성을 통해 업캐스팅 시 코드의 통일성을 더욱 향상 시킬 수 있다!       
		 * 
		 * < 추상메소드 정의 기본 문법 >
		 * [접근제한자] abstract [리턴타입] 메소드명([매개변수...]);
		 * 
		 * ----------------------------------------------------------------------
		 * 
		 * 추상클래스 (Abstract Class)
		 * - 객체를 생성할 수 없는 클래스(미완성 클래스)
		 *   => 따라서, new 연산자를 통해 생성자 호출 불가능
		 * - 추상메소드를 가질 수 있는 클래스
		 *   => 상속받는 서브클래스에서 반드시 오버라이딩 해야한다!
		 * - 추상클래스는 추상메소드, 일반메소드, 생성자, 멤버변수를 모두 가질 수 있음
		 * - 상속을 통해 서브클래스에서 사용가능하며
		 *   업캐스팅을 통한 다형성 활용 가능
		 * - 구현의 강제성 부여를 통해 코드의 통일성이 향상됨
		 *   (일부 메소드에 대한 구현의 강제)
		 *   
		 * < 추상클래스 정의 기본 문법 >
		 * abstract class 클래스명 {
		 * 		// 멤버변수	(인스턴스멤버, 클래스(static) 멤버)
		 * 		// 생성자
		 *		// 메소드 (abstract 추상 메서드 포함!)
		 * }
		 *     
		 * */
		// 추상클래스의 인스턴스 생성
		// 추상클래스는 인스턴스 생성이 불가능한 클래스이다!
		// AbstractClass ac = new AbstractClass(); => 오류!
	
		// 추상클래스는 상속받아 추상메소드를 구현한 서브클래스의 인스턴스 생성
		
		// 서브클래스의 인스턴스 생성
		SubClass sc = new SubClass();
		sc.abstractMethod();
		
		// 업캐스팅
		AbstractClass ac = sc;
		ac.abstractMethod(); // 오버라이딩된 메소드가 호출됨!
		
		System.out.println("-------------------------------------------------------------");
		
		// 추상클래스는 인스턴스 생성 불가!
		// MiddleClass mc = new MiddleClass(); 오류
		
		SubClass2 sc2 = new SubClass2();
		sc2.abstractMethod();
		
		// 업캐스팅
		// 추상클래스는 인스턴스 생성은 불가능하지만, 다형성 활용은 가능
		// => 즉, 변수의 클래스 타입으로 사용할 수 있다!
		AbstractClass ac2 = sc2;
		
		// 업캐스팅 시 참조영역이 축소되지만, 추상메소드는 반드시 구현되어 존재하므로
		// 슈퍼클래스 타입으로 상속되어 구현된 추상메소드 호출이 가능하다!
		ac2.abstractMethod();
		
		// 다운캐스팅
		if(ac2 instanceof MiddleClass) {
			MiddleClass mc = (MiddleClass)ac2;
			mc.abstractMethod();
		}
	} // main() 끝

}

abstract class AbstractClass {
	// 추상메소드 => 추상클래스에서 추가적으로 가질 수 있는 것!
	// 주의! abstract 키워드가 붙은 메소드는 추상메소드 이므로 바디를 가질 수 없다!
	public abstract void abstractMethod();
	
	// -------------------------------------------------------
	
	// 추상클래스도 멤버변수, 일반 메소드(static 메소드 포함), 생성자 가질 수 있음
	int a; // 인스턴스 멤버변수
	static int b; // static 멤버변수
	
	public AbstractClass() {} // 생성자
	public void print() {} // 일반 메서드
	public static void print2() {} // static 메서드
}

// 추상클래스를 상속 받는 서브클래스 (= 실체(구현체) 클래스)
//=> 추상클래스는 인스턴스 생성은 불가능하지만 상속은 가능!
class SubClass extends AbstractClass {
	
	// 추상클래스를 상속받은 서브클래스는 추상클래스에 추상메소드가 존재할 경우
	// 반드시 오버라이딩을 통해 추상메소드의 구현부(바디{})를 정의 해야한다!
	// => 오버라이딩을 통해 메소드 바디를 정의하면 나머지 모든 상속이 적용됨
	// => 만약, 오버라이딩을 하지 않을 경우 상속이 불가능하며
	//    현재의 서브클래스도 추상클래스로 선언해야한다!
	
	// 추상메소드 오버라이딩 필수!
	@Override
	public void abstractMethod() {
		// 메소드 오버라이딩을 통해 바디만 구현하면 메소드 내의 코드는
		// 서브클래스에서 자유롭게 기술할 수 있다!
		System.out.println("서브클래스에서 오버라이딩을 통해 구현한 추상메소드!");
	}
	
}

abstract class MiddleClass extends AbstractClass {}

//추상메소드를 포함하는 추상클래스를 상속 받은 경우 오버라이딩이 필수지만
// 만약 오버라이딩을 하지 않을 경우 서브클래스도 추상클래스로 선언해야한다!
// => 추상클래스로 선언하게 되면 해당 서브클래스도 인스턴스 생성 불가!
//    현재 서브클래스를 상속받는 다른 서브클래스를 통해 추상메소드 구현 강제

class SubClass2 extends MiddleClass {

	// 추상클래스의 서브클래스가 추상클래스로 선언된 상태에서
	// 해당 클래스를 상속받은 서브클래스에서 추상메소드를 구현
	
	@Override
	public void abstractMethod() {
		System.out.println("AbstractClass -> MiddleClass -> SubClass2 상속을 통해 구현");
	}
	
}
