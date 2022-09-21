package interface_;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 인터페이스 필요성 (장점)
		 * 
		 * 1. 구현의 강제성 부여 (=통일성)
		 * 		- 인터페이스를 상속받은 서브클래스는 반드시 추상메소드를 구현해야한다! (메소드 이름 통일)
		 * 
		 * 2. 묘듈 교체의 용이
		 * 		- 부모 타입인 인터페이스 타입을 변수로 사용하여 각 서브클래스를 다룰 경우
		 * 		  특정 서브클래스가 또 추가되더라도 공통 코드를 변경할 필요없이
		 * 		  새로운 클래스만 정의하게 되면 언제든 인스턴스 교체를 통해 서브클래스를 다룰 수 있음.
		 * 			- ex) JDBC 인터페이스 (Connection 등) 를 통해 MySql과 Oracle 드라이버 교체만으로
		 * 				  각 데이터베이스를 동일한 방법으로 다룰 수 있도록 해준다!
		 * 
		 * 3. *(중요) 상속 관계가 없는 객체끼리의 관계를 부여하여 다형성 활용 가능
		 * 
		 * 4. 모듈간 독립적 프로그래밍으로 인해 개발 기간 단축
		 * 
		 * */
		
		
		// 2. 모듈 교체의 용이
		PrintClient pc = new PrintClient();
		pc.setPrinter(new DotPrinter());
		pc.print("Ex1.java");
		
		// -----------------------------------------
		
		pc.setPrinter(new LaserPrinter());
		pc.print("Test1.java");
		
		// -----------------------------------------
		
		pc.setPrinter(new DotPrinter());
		pc.print("Ex2.java");
	}

}

// 모듈 교체
// 슈퍼클래스 타입인 Printer 인터페이스 정의, 추상메소드로 print() 정의
interface Printer {
	public void print(String fileName);
}

class DotPrinter implements Printer {
	@Override
	public void print(String fileName) {
		System.out.println("DotPrinter로 출력 : " + fileName);
	}
}

class InkjetPrinter implements Printer {
	@Override
	public void print(String fileName) {
		System.out.println("InkjetPrinter로 출력 : " + fileName);
	}
}

class LaserPrinter implements Printer {
	@Override
	public void print(String fileName) {
		System.out.println("LaserPrinter로 출력 : " + fileName);
	}
}

// -------------------------------------------------------------------------

// 사용자 (프린트 사용인)
class PrintClient {
	private Printer printer;
	
	// Setter 메소드
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public void print(String fileName) {
		// 자기 자신 호출
		printer.print(fileName);
	}
}
