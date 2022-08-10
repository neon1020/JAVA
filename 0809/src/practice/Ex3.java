package practice;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 상속에서의 생성자
		 * - 생성자는 상속되지 않음
		 * - 서브클래스의 객체(인스턴스) 생성 시, 먼저 슈퍼클래스의 인스턴스를 생성한 후
		 *   서브클래스의 인스턴스가 생성됨
		 *   => 이때, 서브클래스의 생성자 내에서 먼저 자동으로 슈퍼클래스의 기본생성자를 호출
		 *   	(생성자 super() 코드가 생략되어 있을 경우에도 암묵적으로 호출됨)
		 *   => 슈퍼클래스의 생성자 내에서 작업이 모두 끝나면
		 *      다시 서브클래스의 생성자로 돌아와서 다음 코드들을 실행하게 됨
		 *      즉, 슈퍼클래스 생성자의 코드가 먼저 실행된 후 서브클래스 생성자 코드가 실행됨
		 *  
		 * 생성자 super()
		 * - 서브클래스의 생성자 내에서 슈퍼클래스의 생성자를 명시적으로 호출하는 코드  
		 * - 서브클래스의 생성자 내에 생성자 super() 코드가 생략될 경우
		 *   컴파일러에 의해 슈퍼클래스의 기본생성자를 호출하는 super() 가 자동으로 추가됨
		 * - 생성자 super()도 생성자 this()와 마찬가지로 생성자 내에서
		 *   반드시 첫번째로 실행되어야한다! (주석문 제외하고 첫줄에 코딩)
		 *   => 따라서, 생성자 this()와 생성자 super()는 하나의 생성자에서 기술 불가!
		 *   => 만약, 오버로딩 생성자 호출 this() 와 슈퍼클래스를 호출하는 super()가
		 *      함께 실행되어야 하는 경우 생성자 this()를 통해 다른 생성자를 먼저 호출 후
		 *      해당 오버로딩 생성자 내에서 생성자 super()를 통해 슈퍼클래스에 접근 해야함!  
		 * -** 주로, 슈퍼클래스의 기본생성자가 없는 상태에서 파라미터 생성자만 정의했을 경우
		 *   서브클래스에서 슈퍼클래스 기본생성자를 호출하게 되면 오류가 발생하므로
		 *   슈퍼클래스의 파라미터 생성자를 명시적으로 호출하는 용도로 사용
		 *   
		 * */
		
		Child2 c = new Child2();
	}

}

class Parent2 {
	public Parent2(String name) {
		System.out.println("Parent2 생성자 호출됨!");
	}
}

class Child2 extends Parent2 {
	
	// 생략된 생성자
//	public Child2() {
//		super();
//	}
	
	public Child2() {
		super("홍길동");
		System.out.println("Child2 생성자 호출됨!");
	}
}

// ------------------------------------------------------------------

class Person {
	String name;
	int age;
	
	public Person() {
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class SpiderMan extends Person {
	boolean isSpider;


	
//	public SpiderMan(String name, int age, boolean isSpider) {
//		this.name = name; // super.name = name 과 동일한 코드!
//		this.age = age; // super.age = age 와 동일한 코드!
//		
//		super(name, age);
//		this.isSpider = isSpider;
//	}
	
	// 1. alt + shift + S => V 단축키
	// super(name, age) 까지 알아서 만들어줌
	public SpiderMan(String name, int age, boolean isSpider) {
		super(name, age);
		this.isSpider = isSpider;
	}
	
	
	
//	2. alt + shift + S => C 단축키
//	슈퍼클래스의 생성자와 동일한 형태의 생성자가 자동으로 생성 됨
//	주로 서브클래스에 멤버변수가 따로 없을 때 생성자 정의 시 사용)
	
//	public SpiderMan() {
//		super();
//	}
//	
//	public SpiderMan(String name, int age) {
//		super(name, age);
//	}
	
	
}

