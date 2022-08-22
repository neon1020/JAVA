package final_;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * final 키워드
		 * - 클래스, 메소드, 변수에 지정 가능
		 * - '마지막' 이라는 뜻
		 * 
		 * 1) 멤버변수에 final 이 붙은 경우
		 * 		- 마지막 변수 => 변수값 변경 불가 => 상수로 취급됨
		 *        => 즉, 기존에 저장된 값을 사용하는 것만 가능하고, 값을 변경할 수는 없다!
		 *      - 기본문법 : final 데이터타입 변수명
		 *      ex) 원주율 계산을 위한 파이(PI) 값
		 * 
		 * 2) 메소드에 final 이 붙은 경우
		 * 		- 마지막 메소드 => 메소드 변경 불가 => 오버라이딩 X
		 * 		  => 즉, 슈퍼클래스의 메소드를 상속받아 사용하는 것은 가능하나
		 * 			 오버라이딩을 통해 슈퍼클래스의 메소드를 변경(수정) 할수는 없다!
		 * 		- 기본문법 : [접근제한자] final 리턴타입 메소드명 (매개변수...) {}
		 * 
		 * 3) 클래스에 final 이 붙은 경우 
		 * 		- 마지막 클래스 => 클래스 변경 불가 => 상속 X
		 * 		  => 다른 클래스에서 해당 클래스를 상속 받을 수는 없다!
		 * 		  => 어떤 클래스 자체로 이미 완전한 클래스 기능을 수행하는 경우 상속을 금지시킴
		 * 		ex) String 클래스, Math 클래스 등
		 * 		- final 메소드보다 더 광범위한 제한을 두도록 할때 사용
		 * 		- 기본 문법 : [접근제한자] final class 클래스명 {}
		 * 
		 * */
		
		FinalMemberVariable fm = new FinalMemberVariable();
		fm.normalVar = 999;
		System.out.println(fm.normalVar);
		System.out.println(fm.finalVar);
		
		System.out.println("-----------------------");
		
		// 로컬변수는 final이어도 선언만 하는 것이 가능 (기본값으로 초기화 됨)
		final int a;
		a = 10;
	}

}


class FinalMemberVariable {
	int normalVar;
	// 멤버변수는 최초에 초기화도 같이 해줘야 함
	final int finalVar = 10;
}

class FinalMethod {
	public void normalMethod() {
		System.out.println("normalMethod()");
	}
	
	public final void finalMethod() {
		System.out.println("finalMethod()");
	}
}

class subClassFinalMethod extends FinalMethod {
	public void normalMethod() {
		System.out.println("서브 클래스에서 오버라이딩 된 normalMethod()");
		
		// final 메소드 사용은 가능!
		finalMethod();
	}
	
	// final 메소드는 오버라이딩 불가!
//	public void finalMethod() {
//		System.out.println("서브 클래스에서 오버라이딩 된 finalMethod()");
//	}
	
	
}

class A {}

final class FinalClass extends A {
	// 본인이 다른 클래스 상속 받는 건 상관 없음!
	// 하위 클래스 만드는 것만 불가
}

// final class는 상속 불가!
//class SubClassFinalClass extends FinalClass{}

class OtherClass {
	// 상속만 안 될 뿐 사용은 가능하다!
	// "상속 (is - a 관계)"은 불가능 하나 "포함(has - a)"은 가능하다.
	FinalClass fc = new FinalClass();
}

// String 클래스도 final이므로 상속 불가!
//class OtherClass2 extends String{}
