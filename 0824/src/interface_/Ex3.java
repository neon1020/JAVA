package interface_;

public class Ex3 {

	public static void main(String[] args) {
		
	}

}

interface IHello {
	void sayHello(String name);
}

interface IGoodbye {
	void sayGoodbye(String name);
}

// 인터페이스 끼리 상속을 받을 경우 extends 키워드를 사용해야한다!
// => 인터페이스가 가질 수 있는 메소드는 모두 추상메소드 이므로
// 부모 인터페이스를 상속받아 구현할 수 없기 때문에
// 인터페이스끼리의 상속은 구현(implements) 이 아닌 확장(extends)을 사용
// 또한, 클래스 상속과는 달리 2개 이상의 인터페이스를 상속받을 수 있다!
// => 부모 인터페이스의 모든 메소드가 추상메소드이므로
// 부모 인터페이스들 중 누구의 메소드인지 구별할 필요가 없이
// 서브인터페이스도 추상메소드 형태로 보관 하기 때문이다!

interface ITotal extends IHello, IGoodbye {
	// public void sayHello() {} // 오류 발생! 추상메소드 구현이 불가능!!
	void greeting(String name);
}


// 2개의 인터페이스를 상속받은 ITotal 인터페이스를
// 서브클래스에서 상속받아 구현하면 모든 인터페이스의 내용을 구현하게 된다.
// 만약, 하나라도 추상메소드를 구현하지 않으려면 추상클래스로 선언해야한다!
class ISay implements ITotal {

	@Override
	public void sayHello(String name) {}

	@Override
	public void sayGoodbye(String name) {}

	@Override
	public void greeting(String name) {}
}

// --------------------------------------------------------------------------------

abstract class ISay2 implements ITotal {

	@Override
	public void sayHello(String name) {}

	@Override
	public void sayGoodbye(String name) {}

	// 이 메소드를 구현하기 싫은 경우! => 클래스 자체를 abstract로 만들어주면 구현하지 않아도 추상메소드를 가질 수 있게 된다!
	// 이 경우 다른 실체 클래스를 만들어서 구현해줘야 함
//	@Override
//	public void greeting(String name) {
//		
//	}
}

class ISay2SubClass extends ISay2 {
	// 추상클래스인 ISay2 클래스를 상속받더라도 미구현된 greeting() 메소드만 구현하면 된다!
	// => 다른 메소드 오버라이딩도 가능하지만, 강제성은 greeting() 메소드에만 부여됨
	@Override
	public void greeting(String name) {}
}

// ------------------------------------------------------------------------------
// 추상클래스끼리의 상속
abstract class AbstractClass1 {
	public abstract void abstractMethod1();
}

abstract class AbstractClass2 extends AbstractClass1 {
	public abstract void abstractMethod2();
}

class NormalClass extends AbstractClass2 {
	// 추상메소드 2개를 갖는 AbstractClass2를 상속받으면 2개의 추상메소드 모두 오버라이딩 필수!
	// => 만약, 하나라도 구현하지 않을 경우 현재 클래스도 추상클래스가 되어야한다.
	
	@Override
	public void abstractMethod2() {}

	@Override
	public void abstractMethod1() {}
}
