package oop;

public class Ex1 {
	
	// main() 메소드는 자바 프로그램의 시작점으로
	// 프로그램이 실행되면 main() 메소드를 자동으로 호출하게 됨
	// => 따라서, 거의 모든 작업은 main() 메소드에서부터 시작함
	public static void main(String[] args) {
		/*
		 * 클래스의 객체(인스턴스 = instance) 생성 = 인스턴스화 = 객체화
		 * - new 키워드를 사용하여 인스턴스 생성
		 *   => Heap 공간의 특정 위치에 클래스에 대한 인스턴스가 생성됨
		 *      또한, 생성된 공간의 주소값이 리턴됨
		 *      
		 * < 클래스 인스턴스 생성 기본 문법 >
		 * 클래스명 변수명; (Box b1; = int a;)
		 * 변수명 = new 클래스명(); (b1 = new Box(); = a = 10;)     
		 * => 위의 두문장을 한문장으로 결합할 경우
		 * 클래스명 변수명 = new 클래스명();
		 * => Box b1 = new Box();
		 * => int a  = 10;     
		 *      
		 * */
		
		// 1. Person 타입 변수 p를 선언
//		Person p;
//		System.out.println(p); // 초기화 안되어있으므로 출력 불가
		
		// 2. Person 클래스의 인스턴스를 생성하여 변수 p에 해당 인스턴스 주소 전달
//		p = new Person();	// Heap 공간에 생성된 인스턴스 주소가 리턴되어 p 에 저장됨
		
		// 위의 두문장을 한문장으로 결합
		Person p = new Person();
		
		// 참조변수를 통해 인스턴스에 접근하여 멤버변수 값을 출력하고, 메소드 호출
		// 1. 멤버변수값 출력
		//    => 인스턴스 생성 시 멤버변수들은 기본값으로 자동으로 초기화 수행됨
		System.out.println("이름(p.name): " + p.name); // null
		System.out.println("나이(p.age): " + p.age); // 0
		System.out.println("배고픔(p.isHungry): " + p.isHungry); // false
		
		// 2. 메소드 호출
		p.eat();
		p.talk();
		
		System.out.println("-------------------------");
		
		// 인스턴스의 멤버변수 초기화(값 저장)
		// 참조변수명.멤버변수명 = 값;
		p.name = "홍길동";
		p.age = 20;
		p.isHungry = true;
		System.out.println("이름(p.name): " + p.name);
		System.out.println("나이(p.age): " + p.age);
		System.out.println("배고픔(p.isHungry): " + p.isHungry);
		
		System.out.println("-------------------------------");
		
		// 인스턴스 p2 생성
		// p2의 이름을 자신의 이름, 나이, 배고픔유무를 설정 후 출력!
		Person p2 = new Person();
		p2.name = "정채연";
		p2.age = 28;
		p2.isHungry = true;
		System.out.println("이름(p2.name): " + p2.name);
		System.out.println("나이(p2.age): " + p2.age);
		System.out.println("배고픔(p2.isHungry): " + p2.isHungry);
	}

}
