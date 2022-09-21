package polymorphism;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 클래스들의 관계 (Has-a, Is-a)
		 * 1. Has-a (포함 관계)
		 * - 어떤 객체가 다른 객체에 포함되는 관계
		 * - 대부분의 클래들의 관계는 Has-a 관계가 적용됨
		 * - 자동차 has a 타이어, 스마트폰 has a 스피커, 영웅 has a 무기
		 * 		1) 집합관계
		 * 			- 객체가 다른 객체에 포함될 때 해당 객체가 없어도 "동작에 문제가 없는 관계"
		 * 			  => 객체 상호간의 라이프 사이클이 다른 관계
		 * 				ex) 자동차 has a 라디오 => 자동차는 라디오가 없어도 자동차
		 * 					컴퓨터 has a 스피커 -> 컴퓨터는 스피커가 없어도 컴퓨터
		 * 
		 * 		2) 구성관계
		 * 			- 객체가 다른 객체에 포함될 때 해당 객체 없이는 "동작이 불가능한 관계"
		 * 			  => 객체 상호간의 라이프 사이클이 동일한 관계
		 * 				ex) 자동차 has a 엔진, 컴퓨터 has a CPU
		 * 
		 * 
		 * 2. Is-a 관계 (상속 관계)
		 * - 비슷한 속성 및 동작을 갖는 객체 사이의 관계
		 *   ex) 초등학생, 중학생, 고등학생 객체들의 공통점은 학생
		 *   => 이때, 학생은 초등학생, 중학생, 고등학생의 상위 개념이므로 모두를 포함
		 * 	 => 초드학생 is a 학생 => 학생의 모든 구성요소는 초등학생이 갖고 있음
		 *      스마트폰 is a 핸드폰 => 핸드폰의 모든 구성요소는 스마트폰이 갖고 있음
		 * - Is-a 관계가 성립하는 경우 좌변의 객체는 우변의 객체를 상속받아 정의한 객체 성립
		 * - Is-a 관계를 판별하는데 사용하는 연산자 : instanceof 연산자
		 *      
		 * 3. instanceof 연산자
		 * - 좌변의 객체(참조변수)가 우변(클래스) 타입인지 판별하는 연산자
		 *   (=> is-a관계를 판별하는 연산자)
		 * - 판별 결과는 boolean 타입으로 리턴되며, 결과값이 true 이면 형변환 가능한 관계
		 *   (=> 업캐스팅 또는 다운캐스팅 모두 true 가 리턴됨)
		 * - 만약, false가 리턴될 경우 어떤 경우에도 형변환이 불가능!
		 *   
		 * "결론 : 형변환이 가능한지 판별하는 연산자"
		 * 
		 * < 기본 문법 >
		 * if(A instanceof B){ // => A는 참조변수, B는 클래스 또는 인터페이스
		 * 		// A is a B가 성립될때 실행될 코드들...(업캐스팅 또는 다운캐스팅 등)
		 * }
		 * */
		
		SmartPhone sp = new SmartPhone("010-1234-1234", "안드로이드");
		sp.call();
		sp.sms();
		sp.kakaoTalk();
		
		System.out.println("-------------------------------------------------");
		
		// true 리턴
		if(sp instanceof SmartPhone) {
			System.out.println("sp는 SmartPhone이다!");
		} else {
			System.out.println("sp는 SmartPhone이 아니다!");
		}
		
		System.out.println("-------------------------------------------------");
		
		// 업캐스팅 일어나서 true 리턴
		if(sp instanceof HandPhone) {
			System.out.println("sp는 HandPhone이다!");
		} else {
			System.out.println("sp는 HandPhone이 아니다!");
		}
		
		System.out.println("-------------------------------------------------");
		
		HandPhone hp = new HandPhone("010-1111-2222");
		
		// false 리턴 => SmartPhone으로 형변환 불가능!
		if(hp instanceof SmartPhone) {
			System.out.println("hp는 SmartPhone이다!");
		} else {
			System.out.println("hp는 SmartPhone이 아니다!");
		}
		
		System.out.println("-------------------------------------------------");
		
		HandPhone hp2 = new SmartPhone("010-8888-9999", "아이폰");
		hp2.call();
		hp2.sms();
		// hp2.kakaoTalk(); 불가능
		
		System.out.println("-------------------------------------------------");
		
		// true 리턴 => 형변환 가능!
		if(hp2 instanceof SmartPhone) {
			System.out.println("hp2는 SmartPhone 이다!");
			
			SmartPhone sp2 = (SmartPhone)hp2;
			sp2.call();
			sp2.sms();
			sp2.kakaoTalk();
			
		} else {
			System.out.println("hp2는 SmartPhone 이 아니다!");
		}
		
	} // main 메소드 끝

}

class Person {
	String name; // Person 클래스와 String 클래스는 has - a (포함) 관계!
	int age;
}

class HandPhone {
	String number;
	
	public HandPhone(String number) {
		this.number = number;
	}
	
	public void call() {
		System.out.println("전화 기능!");
	}
	
	public void sms() {
		System.out.println("문자 기능!");
	}
}

class SmartPhone extends HandPhone {
	String osName;

	// 슈퍼클래스(HandPhone) 생성자 중 기본 생성자가 없으므로
	// 반드시 파라미터 생성자를 명시적으로 호출 해야한다!
	public SmartPhone(String number, String osName) {
		super(number);
		this.osName = osName;
	}
	
	public void kakaoTalk() {
		System.out.println("카톡 기능!");
	}
	
}
