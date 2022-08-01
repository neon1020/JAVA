package method;

public class Ex2 {

	public static void main(String[] args) {
		// 메소드 오버로딩 = 메소드 다중 정의
		// 동일한 이름의 매개변수가 다른 메소드를 여러개 정의하는 것
		// 메소드간 자동형변환 일어남! (오버로딩이 없을 경우)
		// 규칙 1. 메소드명 동일!
		// 규칙 2. 매개변수 타입 또는 갯수가 달라야 함
		// 규칙 3. 매개변수 타입과 리턴 타입이 달라야 함
		// 규칙 4. 매개변수의 변수명만 다른 것은 오버로딩 x
		
		AbsNum absNum = new AbsNum();
		int num = absNum.abs(-5);
		System.out.println("-5의 절대값 : " + num);
		System.out.println("-3.14의 절대값 : " + absNum.dAbs(-3.14));
		System.out.println("-100L의 절대값 : " + absNum.lAbs(100L));
		
		System.out.println("--------------------------------------------");
		
		OverloadingAbsNum oan = new OverloadingAbsNum();
		System.out.println("정수 10의 절대값 : " + oan.abs(10));
		System.out.println("실수 3.14의 절대값 : " + oan.abs(3.14));
		System.out.println("정수 100L의 절대값 : " + oan.abs(100L));
	}

}

// 메소드 오버로딩 사용하여 클래스 정의
// 매개변수의 데이터 타입 다른 오버로딩 메소드 정의
class OverloadingAbsNum {
	public int abs (int num) {
		System.out.println("int가 호출됨!");
		return num < 0 ? -num : num;
	}
	
//	public int abs (int num2) { 매개변수명만 다르므로 오버로딩이 아님!
//		return num < 0 ? -num : num;
//	}
	
	public double abs(double num) {
		System.out.println("double이 호출됨!");
		return num < 0 ? -num : num;
	}
	
	public long abs(long num) {
		System.out.println("long이 호출됨!");
		return num < 0 ? -num : num;
	}
}

// ------------------------------------------------------------------------------

// 오버로딩 적용 x
class AbsNum {
	
	// 수치 데이터를 전달 받아 절대값을 리턴하는 메소드 정의
	// 1. int형 정수
	public int abs(int num) {
		return num < 0 ? -num : num;
	}
	
	// 2. double형 실수
	public double dAbs (double num) {
		return num < 0 ? -num : num;
	}
	
	// 2. long형 정수
	public long lAbs(long num) {
		return num < 0 ? -num : num;
	}
	
	
}