package randomize;

import java.util.Random;

public class Ex {

	public static void main(String[] args) {
		
		// 난수 발생 방법 2가지
		// 1. Math.random() 메소드를 통해 double 타입 난수 발생시키는 방법
		// 2. Random 클래스 인스턴스 생성 후 nextXXX() 메소드를 통해
		//    각각의 타입에 대한 난수를 발생시키는 방법
		
		// --------------------------------------------------------------------------------------------------
		
		// SMS 인증번호 생성 (숫자)
		// => Random 객체의 nextInt(int) 메소드를 사용하여
		//    특정 범위에 해당하는 정수형 난수를 발생시키기
		
		Random r = new Random();
		
		// 4 자리 인증번호 (0000 ~ 9999) 생성
		// for(int i = 1; i <= 10; i++) {
			// int rNum = r.nextInt(10000);
		
			// 4자리보다 작은 자릿수를 갖는 정수를 4자리로 만드는 방법(부족한 앞자리 0으로 채우기)
			// (부족한 앞자리 숫자를 0으로 채우기 = 0으로 패딩)
			// => String 클래스의 format() 메소드를 활용
			// => format() 메소드 첫번째 파라미터로 형식 지정 패턴 문자열 지정
			//    %d 가 10진수이며, %4d 는 10진수 4자리로 표기,
			//    %04d 는 10진수 4자리로 표기할 때 부족한 앞자리는 0으로 채움 
		
			// String strNum = String.format("%04d", rNum);
			// System.out.println(strNum);
		// }
		
		// --------------------------------------------------------------------------------------------------
		
		// 6 자리 인증번호 (000000 ~ 999999) 생성
		// for(int i = 1; i <= 10; i++) {
		// 		int rNum = r.nextInt(1000000);
		//			 
		// 		String strNum = String.format("%06d", rNum);
		//      System.out.println(strNum);
		// }
		
		// ------------------------------------------------------------------------------------------------
		 
		// E-mail 인증코드 생성 (문자)
		// 1. 인증코드에 사용될 문자를 배열로 모두 저장하기
		char[] codeTable = {
			'A','B','C','D','E','F','G','H','I','J',
			'K','L','M','N','O','P','Q','R','S','T',
			'U','V','W','X','Y','Z','a','b','c','d',
			'e','f','g','h','i','j','k','l','m','n',
			'o','p','q','r','s','t','u','v','w','x',
			'y','z','0','1','2','3','4','5','6','7',
			'8','9','!','@','#','$'
		};
		
		String code = "";
		int codeLength = 20;
		
		// 원하는 코드 길이만큼 for문을 사용하여 반복문으로 처리
		for(int i = 1; i <= codeLength; i++) {
			// 배열 크기를 범위로 갖는 난수 생성
			int index = r.nextInt(codeTable.length);
			// 생성된 난수를 배열 인덱스로 활용하여 1개의 코드 가져와서 문자열 결합
			code += codeTable[index];
		}
		
		System.out.println("인증 코드 : " + code);
		
	}

}
