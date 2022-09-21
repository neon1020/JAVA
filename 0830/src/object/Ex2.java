package object;

import java.util.Objects;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 3. equals() 메소드
		 * - 두 객체가 같은 객체인지를 판별하는 메소드
		 * - Object 클래스의 equals() 메소드는 두 객체의 주소값(참조값)을 비교하여
		 *   주소값이 같으면 true, 서로 다르면 false 리턴
		 *   
		 * - Object 클래스의 equals() 메소드는 기본적으로 주소값을 비교할 때
		 *   메소드 내부에서 동등비교연산(==)을 통해 비교하게 되므로
		 *   일반적인 동등비교 연산결과와 동일함   
		 *   
		 * - 문법 구조 : boolean equals(Object obj)
		 *   => 파라미터로 전달된 Object 타입 객체 obj의 주소값을 자신의 주소값과 비교하여
		 *      true 또는 false 리턴
		 *      
		 * - 일반적으로 객체의 동등 여부를 비교할 때는 Object 클래스의 equals() 메소드를
		 *   그대로 사용하지 않고, 비교 대상클래스 내에서 오버라이딩 한 후
		 *   해당 객체의 멤버변수 값을 1:1로 비교하여 모든 데이터가 같으면 true,
		 *   하나라도 다를 경우 false를 리턴하도록 오버라이딩 한다! 
		 *     
		 * - 대부분 자바에서 제공하는 API 들은 equals() 메소드가 이미 오버라이딩 되어 있으므로
		 *   해당 객체들의 값 비교 시 equals() 메소드 활용이 가능함
		 *   (ex. String, Wrapper 클래스 계열 등)      
		 * 
		 * < 결론 >
		 * 어떤 두 객체의 실제 값을 비교하고 싶을 때는
		 * 해당 객체의 equals() 메소드를 호출하여 객체 간의 비교를 수행하면 되고
		 * 자신이 직접 클래스를 정의할 때는 equals() 메서드를 오버라이딩하여
		 * 객체 내의 멤버변수 끼리 비교가 가능하도록 구현해야한다!
		 * 
		 * */
		
		int num1 = 10;
		int num2 = 10;
		
		if(num1 == num2) { // 같다
			System.out.println("num1, num2 같다!");
		} else {
			System.out.println("num1, num2 다르다!");
		}
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		// 참조변수명.equals(비교할 참조변수명) 형태로 사용
		// => 동등비교연산을 통한 비교 결과와 동일한 결과가 출력됨
		//    (내부적으로 동등비교연산자(==)를 통해 비교하게 되기 때문에)
		if(obj1.equals(obj2)) { // 다르다
			System.out.println("obj1, obj2 같다!");
		} else {
			System.out.println("obj1, obj2 다르다!");
		}
		
		Object obj3 = obj1;
		if(obj1 == obj3) { // 같다
			System.out.println("obj1, obj3 같다!");
		} else {
			System.out.println("obj1, obj3 다르다!");
		}
		
		System.out.println("--------------------------------");
		
		// 일반적으로 현실에서 두 객체가 같은가? 라는 질문은 두 객체의 주소값이 아닌
		// 객체 내에 저장된 실제 데이터가 같은지를 물어보는 것이 일반적이다.
		// 그러나, equals() 메소드는 두 객체의 주소값을 비교하므로
		// 두 객체에 저장된 데이터가 같더라도 false가 리턴되므로 적합하지 않다.
		
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		
		if(p1 == p2) { // 다르다
			System.out.println("p1과 p2가 같다!");
		} else {
			System.out.println("p1과 p2가 다르다!");
		}
		
		if(p1.equals(p2)) { // 다르다
			System.out.println("p1과 p2가 같다!");
		} else {
			System.out.println("p1과 p2가 다르다!");
		}
		
		System.out.println("=========================================");
		
		EqualsPerson2 p3 = new EqualsPerson2("홍길동", 20);
		EqualsPerson2 p4 = new EqualsPerson2("홍길동", 20);
		
		if(p3.equals(p4)) { // 같다
			System.out.println("p3와 p4는 실제값이 같다!");
		} else {
			System.out.println("p3와 p4는 실제값이 다르다!");
		}
		
		System.out.println("-----------------------------------------");
		if(p3.equals(p1)) { // 다르다
			System.out.println("p3와 p1은 실제값이 같다");
		} else {
			System.out.println("p3와 p1은 실제값이 다르다");
		}
		
		System.out.println("================================");
		
		p3.equals(p3);
		p3.equals(null);
		
		EqualsPerson2 p5 = null;
		p3.equals(p5);
		p3.equals(p1);
		
		System.out.println("======================================");
		
		// EqualsPerson2 p3 = new EqualsPerson2("홍길동", 20);
		// EqualsPerson2 p4 = new EqualsPerson2("홍길동", 20);
		// p3.age = 30;
		p3.name = "이순신";
		
		if(p3.equals(p4)) { // 다르다
			System.out.println("p3와 p4는 실제 값이 같다!");
		} else {
			System.out.println("p3와 p4는 실제 값이 다르다!");
		}
		
		
	}

}

class EqualsPerson2 {
	String name;
	int age;
	
	public EqualsPerson2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// equals() 메소드 내부에서 EqualsPerson2 클래스의 멤버변수를
	// 파라미터로 전달된 Object 타입 객체의 멤버변수와 비교하여
	// 모든 멤버변수가 같으면 true, 하나라도 다르면 false 리턴하도록 구현
	
	// equals() 메서드 자동 오버라이딩 단축키 : Alt + Shift + S -> H
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsPerson2 other = (EqualsPerson2) obj;
		return Objects.equals(name, other.name);
	}
}
