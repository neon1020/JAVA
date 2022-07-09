package operator;

public class Op7 {

	public static void main(String[] args) {
		/*
		 * 삼항 연산자 (조건연산자)
		 * - 연산에 참여하는 항이 3개인 연산자
		 * - 특정 조건에 따라 다른 값을 실행하는 연산자
		 *   => if ~ else 문과 동일한 기능을 수행
		 * - 2가지 경의 수 (true 또는 false)에 대한 결과를 수행
		 * 
		 * < 기본 문법 >
		 * 조건식 ? 값1 : 값2;
		 * => 조건식에는 결과값이 boolean 타입 (true 또는 false)인 식만 올수 있다.
		 * => 연산식 판별 결과가 true 일 경우 값1 부분을 반환, false일 경우 값2 부분을 반환  
		 * */
		
		int a = 10;
		String result = a%2 == 0 ? "짝수" : "홀수";
		System.out.println(result); // 짝수
		
		a = 11;
		result = a%2 == 0 ? "짝수" : "홀수";
		System.out.println(result); // 홀수
		
		a = 10000;
		int b = 40;
		
		int max = a > b ? a : b;
		int min = a > b ? b : a;
		
		String strMax = a > b ? "a" : "b";
		String strMin = a > b ? "b" : "a";
		
		System.out.println(max); // 10000
		System.out.println(min); // 40
		System.out.println(strMax); // a
		System.out.println(strMin); // b
		
		// ======================================
		// 반올림 수행
		double d = 97.5;
		int i = ((d * 10) % 10) >= 5 ? (int)(d + 1) : (int)(d);
		System.out.println("반올림 수행 : " + i); // 98
		
		// 반올림 수행 (두자리에서 반올림)
		double dd = 97.53;
		double ii = ((dd * 100) % 10) >= 5 ? ((int)((dd * 10) + 1) / 10.0) : (int)(dd * 10) / 10.0;
		System.out.println("반올림 수행 : " + ii); // 97.5

	}

}
