package variable;

public class Constant {

	public static void main(String[] args) {
		/*
		 * 상수 (Constant)
		 * - 변수의 반대 개념으로, 항상 고정된 데이터 (변하지 않는 데이터)
		 * - 실제 사용하는 데이터(상수)를 리터럴(Literal) 이라고도 한다.
		 *   ex) 정수형 리터럴 1, 실수형 리터럴 3.14 등
		 * 
		 * */
		
		System.out.println(1);	// 정수형(기본형 = int형) 리터럴
		System.out.println(3.14); // 실수형(기본형 = double) 리터럴
		
		System.out.println('A'); // 문자형 리터럴(작은따옴표로 둘러싼 1개의 문자)
//		System.out.println('AB'); // 오류! 문자형은 1개의 문자만 입력할 수 있다!
		
		System.out.println(true); // 논리형(boolean형) 리터럴(true 또는 false)
//		System.out.println(TRUE); // 오류! 예약어. true는 무조건 소문자로 써야함!
		
		System.out.println(100L); // 정수형(long형) 리터럴(접미사 L(구분하기 위함) 붙는다.)
		System.out.println(1.5f); // 실수형(float형) 리터럴 (접미사 f 또는 F 붙는다.)
		System.out.println("Hello, World!"); // 문자열형 리터럴 (큰 따옴표로 둘러싼 문자들)
		System.out.println("");
//		System.out.println(''); // 오류! 문자형에는 "무조건" 1개의 문자를 적어줘야함!!
		

	}

}
