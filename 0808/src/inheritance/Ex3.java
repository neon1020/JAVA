package inheritance;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 메소드 오버라이딩 (Method Overriding)
		 * - 슈퍼클래스로 부터 상속받은 메소드를 서브클래스에서 새롭게 재정의 하는것
		 * - 반드시 상속 관계에서 상속받은 메소드에 대해서만 적용 가능
		 * - 서브클래스에서 오버라이딩 수행 후에는 슈퍼클래스의 메소드는 은닉됨 (super. 으로 접근 가능!)
		 * 
		 * < 메소드 오버라이딩 규칙 >
		 * 1. 슈퍼클래스의 메소드와 시그니처(리턴타입, 메서드명, 매개변수 타입과 갯수) 가 동일 해야함
		 * 2. 접근제한자는 범위가 좁아질 수 없다
		 *    (=> 부모가 public 이면 자식도 public만 선택 가능함)
		 *    (=> default -> protected -> public 순으로는 확장 가능)
		 * 
		 * */
		
		Child2 c = new Child2();
		
		c.parentPrn(); // 오버라이딩 된 메소드 호출
		System.out.println("--------------------------------------");
		
		c.childPrn();
		System.out.println("--------------------------------------");
		System.out.println();
		
		// ----------------------------------------------------------------
		
		Dog dog = new Dog();
		dog.cry();
		System.out.println();
		
		Cat cat = new Cat();
		cat.cry();
	}

}

class Parent2 {
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn");
	}
}

class Child2 extends Parent2 {
//	public void parentPrn() {
//		System.out.println("서브클래스에서 오버라이딩 된 parentPrn()");
//	}
	
	public void childPrn() {
		super.parentPrn();
		System.out.println("서브클래스의 childPrn()");
	}

	// 오버라이딩 단축키 : alt + shift + S => V
	@Override // => 어노테이션 기능! (자바 컴파일러를 위한 주석)
	public void parentPrn() {
//		super.parentPrn(); 오버라이딩 시 기본적으로 부모메소드 호출해줌
		System.out.println("서브클래스에서 오버라이딩 된 parentPrn()");
	}
}

// ------------------------------------------------------------------------------

class Animal {
	String name;
	int age;
	
	public void cry() {
		System.out.println("동물 울음 소리!");
	}
}

class Dog extends Animal {
	// 오버라이딩
	public void cry() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	// 오버라이딩
	public void cry() {
		System.out.println("야옹");
	}
}


