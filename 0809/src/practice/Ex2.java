package practice;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 멤버변수 대한 오버라이딩
		 * - Parent 클래스로 부터 상속 받은 멤버변수와
		 *   동일한 이름의 변수를 서브클래스에서 선언하면
		 *   메소드 오버라이딩과 마찬가지로 멤버변수에 대한 은닉이 발생하여
		 *   슈퍼클래스의 멤버변수는 보이지 않고, 서브클래스의 멤버변수에만 접근 가능해진다!
		 * 
		 * 레퍼런스 super
		 * - 레퍼런스 this와 마찬가지로 인스턴스의 주소를 저장하는 참조변수
		 * - 레퍼런스 this는 자신의 인스턴스 주소를 저장하는 반면,
		 *   레퍼런스 super는 부모의 인스턴스 주소를 저장함
		 * - 메소드(또는 변수) 오버라이딩으로 인해 슈퍼클래스의 멤버가 은닉되었을 때
		 *   서브클래스에서 슈퍼클래스의 은닉된 멤버에 접근하기 위해 사용
		 * - super.super 형식처럼 super 키워드를 중첩해서 사용할 수 없다!   
		 * 
		 *  < 기본 사용 문법 >
		 *  서브클래스의 메소드 내에서
		 *  super.부모의 멤버변수 또는 super.부모의 메소드()
		 *  
		 *  < 변수 사용 시 선언 방법에 따른 접근 순서 >
		 *  1. 변수명만 지정했을 경우
		 *     현재 선언된 메소드 내에서 먼저 탐색 -> 없을 경우 자신의 멤버변수에서 탐색
		 *     -> 부모의 멤버변수에서 탐색
		 *     
		 *  2. this.변수명을 지정했을 경우
		 *     자신의 멤버변수에서 탐색 -> 부모의 멤버변수에서 탐색
		 *     
		 *  3. super.변수명을 지정했을 경우
		 *     부모의 멤버변수에서 탐색      
		 *  
		 * */
		
		// 멤버변수에 대한 오버라이딩
		Child c = new Child();
		System.out.println("우리집 TV : " + c.tv); // 내가 구입한 TV
		
		c.watchTv();
		c.watchMyParentTv();
		
		System.out.println("--------------------------------------------");
		
		c.scope();
		
		System.out.println("--------------------------------------------");
		
		SonOfChild s = new SonOfChild();
		s.scope();
		System.out.println("--------------------------------------------");
		
		C c1 = new C();
		c1.method();
		
		
	}

}

class Parent {
	String tv = "부모님이 구입한 TV";
	
	public void watchTv() {
		System.out.println("부모님 댁에서 " + tv + "를 보자!");
	}
	
	// ---------------------------------------------------------------
	String name = "Parent의 멤버변수 name";
}



class Child extends Parent {
	String tv = "내가 구입한 TV";

	@Override
	public void watchTv() {
		System.out.println("우리집에서 " + tv + "를 보자!");
	}
	
	public void watchMyParentTv() {
		super.watchTv();
	}
	
	// ------------------------------------------------
	String name = "Child의 멤버변수 name";
	
	public void scope() {
		String name = "Child 클래스 메소드 내의 로컬변수 name";
		
		System.out.println("name = " + name); // 로컬변수
		System.out.println("this.name = " + this.name); // 자신의 멤버변수 (Child)
		System.out.println("super.name = " + super.name); // 부모의 멤버변수 (Parent)
	}
}



class SonOfChild extends Child {
	String name = "SonOfChild의 멤버변수 name";

	@Override
	public void scope() {
		System.out.println("name = " + name); // 자신의 멤버변수 (SonOfChild)
		System.out.println("this.name = " + this.name); // 자신의 멤버변수 (SonOfChild)
		System.out.println("super.name = " + super.name); // 부모의 멤버변수 (Child)
//		System.out.println("super.super.name = " + super.super.name); => super 키워드는 중첩 사용이 불가능!
	}
	
}

// -------------------------------------------

class G {
	String name = "할아버지";
}

class P extends G {
	String name = "아버지";
	
	// C 에서 G의 name 에 접근하고 싶을 경우
	public String parentName() {
		return super.name;
	}
}

class C extends P {
	String name = "나"; // 멤버변수
	public void method() {
		String name = "로컬변수"; // 로컬변수
		System.out.println("name = " + name); // 로컬변수
		System.out.println("this.name = " + this.name); // 나
		System.out.println("super.name = " + super.name); // 아버지
		System.out.println(super.parentName()); // 할아버지
	}
}
