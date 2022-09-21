package wrapper;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스의 다양한 메소드
		 * - Wrapper 클래스 타입을 활용하면 기본 데이터타입들을 다양하게 처리 가능
		 * - 주로 Wrapper 클래스의 static 메소드를 직접 호출하여
		 *   기본 데이터타입 데이터를 처리하도록 작업을 수행하는 형태로 사용
		 * */
		
		int num1 = 10, num2 = 20;
		Integer n1 = 10;
		Integer n2 = 10;
		
		// Integer 클래스의 static 메소드 활용
		// 1. 두 정수에 대한 대소관계 비교
		System.out.println("n1과 n2중 큰값 : " + Integer.max(n1, n2)); // 오토언박싱
		System.out.println("num1과 num2중 큰값 : " + Integer.max(num1, num2));
		
		System.out.println("n1과 n2가 같은가 : " + n1.equals(n2));
		
		// 2. 어떤 정수에 대한 진법 변환
		// => 해당 진법의 문자열 형태로 리턴하는 메소드를 사용 : toXXXString()
		System.out.println("10진수 num1에 대한 2진수 변환 : " + Integer.toBinaryString(num1));
		System.out.println("10진수 num1에 대한 8진수 변환 : " + Integer.toOctalString(num1));
		System.out.println("10진수 num1에 대한 16진수 변환 : " + Integer.toHexString(num1));
		
		System.out.println("=====================================");
		
		// 2. Character 클래스의 isXXX() 메소드를 호출하여 판별
		char ch = ' ';
		System.out.println(ch + " 문자는 대문자인가? " + Character.isUpperCase(ch));
		System.out.println(ch + " 문자는 소문자인가? " + Character.isLowerCase(ch));
		System.out.println(ch + " 문자는 숫자(0~9)인가? " + Character.isDigit(ch));
		System.out.println(ch + " 문자는 공백문자인가? " + Character.isSpaceChar(ch));
		// System.out.println(ch + " 문자는 공백문자인가? " + Character.isSpace(ch));
		
		// => deprecated 처리된 메소드 : 사용은 가능하지만
		//    보안 상의 이유나 다른 메소드 제공 등으로 인해
		//    현재는 사용하는 것을 추천하지 않는 메소드
		//    @Deprecated 어노테이션을 사용
		
	}

}
