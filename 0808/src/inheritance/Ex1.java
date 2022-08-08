package inheritance;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 상속 (Inheritance)
		 * - 슈퍼클래스(부모)의 모든 멤버를 서브클래스(자식)에서 물려받아 선언 없이 사용하는 것
		 *   => 상속을 받은 서브클래스에서 별도의 선언 및 정의 없이도
		 *      슈퍼클래스가 가진 멤버변수나 메소드 등을 자신의 멤버처럼 사용가능
		 *   => 상속을 활용하면 코드 중복이 제거되며, 유지 보수에 용이해진다!
		 * - 슈퍼클래스(Super Class) = 부모클래스(조상클래스) = 상위클래스
		 *   서브클래스(Sub Class) = 자식클래스(자손클래스) = 하위클래스 = 파생클래스
		 * - 서브클래스 정의 시 서브클래스명 뒤에 extends 키워드를 사용하고
		 *   extends 키워드 뒤에 슈퍼클래스의 이름을 명시함
		 *   => 슈퍼클래스가 가진 멤버를 물려받아 서브클래스에서 멤버를 추가하므로
		 *      기존 클래스를 확장(extends)하는 개념으로 사용됨   
		 * - private 접근제한자가 적용된 멤버는 상속 대상에서 제외됨!
		 * - 생성자는 상속되지 않음
		 *   (생성자는 자신의 클래스이름과 동일해야하는데 생성자가 상속되면 이름이 다르므로 원칙에 위배됨)
		 * - 자바는 "단일 상속"만 지원 하므로 동시에 2개 이상의 클래스를 상속 받을 수 없음
		 *   (class 서브클래스명 extends 슈퍼클래스1, 슈퍼클래스2 {} 형태로 상속 불가능! )
		 * - 클래스 정의 시 별도의 extends 키워드를 사용하지 않으면 (상속 명시하지 않으면)
		 *   자동으로 java.lang.Object 클래스를 상속받게 됨
		 *   => 따라서, Object 클래스는 모든 자바 클래스의 최상위 클래스이다!
		 *   => 즉, 모든 클래스에서 Object 클래스의 멤버에 접근 가능!
		 * 
		 * */
		
		Child c = new Child();
		c.childPrn();
		
		c.name = "홍길동";
		c.parentPrn();

		System.out.println("-------------------------------");
		
		Parent p = new Parent();
		p.name = "이순신";
		p.parentPrn();
//		p.childPrn(); 불가능
		
		System.out.println("----- 아버지 -----");
		아버지 아버지 = new 아버지();
		System.out.println(아버지.car);
		아버지.drawWell();
		
		// 할아버지 클래스에서 상속 받은 멤버
		System.out.println(아버지.house);
		아버지.singWell();
		
		System.out.println("----- 나 -----");
		나 나 = new 나();
		System.out.println(나.pc);
		나.programmingWell();
		
		// 아버지, 할아버지 클래스 멤버들 접근
		System.out.println(나.house);
		System.out.println(나.car);
		나.singWell();
		나.drawWell();
	}

}

// ---------------------------------------------------------------

class 할아버지 {
	String house = "이층집";
	public void singWell() {
		System.out.println("노래를 잘 한다!");
	}
}

class 아버지 extends 할아버지 {
	String car = "자동차";
	public void drawWell() {
		System.out.println("그림을 잘 그린다!");
	}
}

// 할아버지 멤버에도 접근 가능!
class 나 extends 아버지 {
	String pc = "컴퓨터";
	public void programmingWell() {
		System.out.println("프로그래밍을 잘 한다!");
	}
}

// --------------------------------------------------------------

// 슈퍼 클래스
class Parent {
	String name;
	
	public void parentPrn() {
		System.out.println("슈퍼클래스 Parent의 parentPrn()");
	}
}

// 서브 클래스
class Child extends Parent {
	public void childPrn() {
		System.out.println("서브클래스 Child의 childPrn()");
	}
}