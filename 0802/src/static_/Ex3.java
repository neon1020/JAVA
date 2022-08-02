package static_;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * < 자바 프로그램 실행 과정 >
		 * 1. 소스 코드 작성 및 컴파일(번역) 후 클래스 실행 (Ctrl + F11)
		 * 2. 클래스 로딩 - 클래스(정적) 멤버 변수 및 메소드가 메모리에 로딩
		 * 3. main() 메소드 호출(실행)
		 * 4. 인스턴스 생성 - 인스턴스 멤버변수 및 메소드가 메모리에 로딩
		 * 5. 메소드 호출(실행) - 메소드 내의 로컬 변수가 메모리에 로딩
		 * 6. 결과 출력
		 * 
		 * < static 키워드 >
		 * - 정적(고정된)이라는 의미를 갖는 키워드
		 * - 클래스, 메소드, 변수의 지정자로 사용가능
		 * - 멤버 메소드 또는 변수에 static 키워드를 사용할 경우
		 *   인스턴스 생성과 관계없이 클래스가 로딩되는 시점에 함께 메모리에 로딩됨
		 *   => 인스턴스 생성 전에 메모리에 로딩됨
		 *      따라서, 인스턴스 생성 없이도 접근 가능(클래스명만으로 접근 가능)
		 *      
		 * < static 멤버 변수 >
		 * - 멤버변수 선언부 데이터 타입 앞에 static 키워드를 사용하여 선언함
		 * - 인스턴스 생성 전, 클래스가 메모리에 로딩될 때 static 변수도 함께 로딩됨
		 *   => Heap 공간이 아닌 Method Area (static 영역) 에 변수가 생성됨 (공유 영역)
		 * - 모든 인스턴스가 하나의 변수(메모리)를 공유함
		 *   (= 클래스 당 하나의 변수만 생성되며, 해당 변수를 모든 인스턴스가 공유)
		 * - 참조변수 없이 클래스명만으로 해당 멤버에 접근 가능         
		 * 
		 * < static 메소드 >
		 * - static 멤버변수와 마찬가지로 클래스 로딩 시 함께 메모리에 로딩되므로
		 *   클래스명만으로 호출 가능한 메소드
		 * */
		
		// 클래스 멤버변수는 인스턴스 생성과 상관 없이 접근 가능
		System.out.println("StaticMember.a = " + StaticMember.a);
		
		// 인스턴스 멤버변수는 인스턴스 생성하지 않으면 접근 불가!
//		System.out.println("StaticMember.b = " + StaticMember.b);	오류
		
		StaticMember s1 = new StaticMember();
		StaticMember s2 = new StaticMember();
		System.out.println("s1.a = " + s1.a + ", s2.a = " + s2.a);
		System.out.println("s1.b = " + s1.b + ", s2.b = " + s2.b);
		
		// static 변수이므로 모든 인스턴스가 해당 변수값 공유
		// s1 과 s2는 서로 다른 멤버변수가 아닌 하나의 멤버변수를 공유하고 있는 것!
//		s1.a = 99; 이렇게 해도 되지만 warning 뜬다!
		StaticMember.a = 99; // 보통 클래스 명으로 접근
		System.out.println("s1.a = " + s1.a + ", s2.a = " + s2.a);
		
		
		// 인스턴스 멤버변수는 각 변수마다 값을 가짐
		// s1 과 s2는 서로 다른 인스턴스 변수 b를 가짐 
		s2.b = 999; // (s1.b 에는 영향 x)
		System.out.println("s1.b = " + s1.b + ", s2.b = " + s2.b);
		
		System.out.println("----------------------------------------------");
		
		s1.normalMethod(); // 일반메소드 : 참조변수 통해서 접근
//		StaticMember.normalMethod(); 클래스명으로는 호출 불가능
		
		StaticMember.staticMethod(); // static 메소드 : 클래스명으로 접근
//		s1.staticMethod();
		
		
	}
}

class StaticMember {
	
	static int a = 10; // 클래스 멤버변수
	int b = 20; // 인스턴스 멤버변수
	
	public void normalMethod() {
		System.out.println("일반 메소드!");
	}
	
	// 인스턴스 생성 없이 클래스명만으로 호출 가능
	public static void staticMethod() {
		System.out.println("static 메소드!");
	}
}
