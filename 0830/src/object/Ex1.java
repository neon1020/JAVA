package object;

import java.util.Objects;

public class Ex1 {
	
	/*
	 * java.lang.Object
	 * - 모든 클래스의 최상위 클래스
	 *   => 별도로 상속을 받지 않는 클래스는 묵시적으로 Object 클래스를 상속 받음
	 * */

	public static void main(String[] args) {
		
		// Object 인스턴스 생성 후 Object의 메소드 호출가능
		// 인스턴스 주소를 저장하는 참조변수의 내용을 그대로 출력하면 @~~~~ 형식으로 출력됨
		Object o = new Object();
		System.out.println(o);
		
		System.out.println("----------------------------------------------------");
		
		Person p1 = new Person();
		System.out.println(p1);
		
		Person p2 = new Person();
		System.out.println(p2);
		
		System.out.println("----------------------------------------------------");
		
		/*
		 * 1. getClass() 메소드
		 * - 현재 객체의 클래스 정보를 Class 타입 객체로 리턴
		 *   (ex. Person 클래스의 참조변수 p1의 getClass() 결과 출력 시 : class Person)
		 * - 해당 클래스의 클래스명을 얻으려면 getClass() 메소드 결과에 다시 .getName() 붙임
		 * */
		
		System.out.println("p1.getClass() : " + p1.getClass());
		System.out.println("p2.getClass() : " + p2.getClass());
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("p1.getClass().getName() : " + p1.getClass().getName());
		System.out.println("p2.getClass().getName() : " + p2.getClass().getName());
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("p1.getClass().getName() : " + p1.getClass().getSimpleName());
		System.out.println("p2.getClass().getName() : " + p2.getClass().getSimpleName());
		
		System.out.println("----------------------------------------------------");
		
		// 2. hashCode() 메소드
		
		System.out.println("p1.hashCode() : " + p1.hashCode());
		System.out.println("p2.hashCode() : " + p2.hashCode());
		
		System.out.println("----------------------------------------------------");
		
		Person pp1 = new Person("홍길동", 20);
		Person pp2 = new Person("홍길동", 20);
		
		if(pp1 == pp2) {
			System.out.println("pp1과 pp2는 같다!");
		} else {
			System.out.println("pp1과 pp2는 다르다!"); // 다르다! (주소값 비교하므로)
		}
		
		if(pp1.equals(pp2)) {
			System.out.println("pp1과 pp2는 같다!");
		} else {
			System.out.println("pp1과 pp2는 다르다!"); // 다르다!
		}
		
		System.out.println("----------------------------------------------------");
		
		EqualsPerson ep1 = new EqualsPerson("홍길동", 20);
		EqualsPerson ep2 = new EqualsPerson("홍길동", 20);
		
		if(ep1.equals(ep2)) {
			System.out.println("ep1과 ep2는 실제값이 같다!");
		} else {
			System.out.println("ep1과 ep2는 실제값이 다르다!");
		}
	}

}

// ------------------------------------------------------------------------------------

class Person {
	String name;
	int age;
	
	public Person() {}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

// -------------------------------------------------------------------

class EqualsPerson {
	String name;
	int age;
	
	public EqualsPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	@Override
//	public boolean equals(Object obj) {
//		EqualsPerson p;
//		
//		if(obj instanceof EqualsPerson) {
//			p = (EqualsPerson)obj;
//			if(this.age == p.age && this.name == p.name) {
//				return true;
//			}
//		}
//		return false;
//	}
		
	// Alt + Shift + S => H
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsPerson other = (EqualsPerson) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
}