package interface_;

public class Ex2 {

	public static void main(String[] args) {
		고래상어 고래상어 = new 고래상어();
		고래상어.번식();
	}

}

// -------------------------------------------------------------

abstract class 동물 {
	public abstract void 번식();
}

class 고래 extends 동물 {
	@Override
	public void 번식() {
		System.out.println("새끼를 낳아 번식");
	}
}

class 상어 extends 동물 {
	@Override
	public void 번식() {
		System.out.println("알을 낳아 번식");
	}
}

// 자바에서는 다중상속 불가능!
//class 고래상어 extends 고래, 상어 {
//	번식(); // 어떤 부모의 번식() 메소드를 불러야할지 모름!
//}

// => 따라서, 자바에서는 모호한 상황을 차단하기 위해 애초부터 다중 상속을 허용하지 않음

// ----------------------------------------------------------------

interface 고래인터페이스 {
	public void 번식();
	public void method1();
}

interface 상어인터페이스 {
	public void 번식();
	public void method2();
}

// 인터페이스끼리는 다중 상속 가능!
interface 고래상어인터페이스 extends 고래인터페이스, 상어인터페이스 {
	public void method3();
}


// 고래인터페이스, 상어인터페이스, 고래상어인터페이스 전부 구현해야함!
class 고래상어 implements 고래상어인터페이스 {
	@Override
	// 모두 추상메소드이기 때문에 어느 부모의 번식() 메소드인지 구별할 필요 x
	// => 실행할 내용을 서브클래스에서 직접 정의하면 되기 때문에 부모의 메서드는 무관함
	// => 모든 구현은 서브클래스에게 맡기고, 인터페이스는 메서드 형식(표준)만 규정하는 역할
	public void 번식() {
		System.out.println("고래상어는 상어처럼 알을 낳아 번식한다!");
	}

	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
		
	}

	@Override
	public void method3() {
		
	}
}




