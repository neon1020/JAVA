
public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 삼항 연산자의 중첩 사용
		 * - 경우의 수자 3가지 이상일 때 사용
		 * - 삼항연산자 내에서 true 또는 false 일때 실행할 부분에
		 *   또 다른 삼항연산자를 사용하여 그 다움 조건을 판별하는 방법
		 *   
		 * < 기본 문법 >
		 * 조건식1 ? 값1 : 조건식2 ? 값2 : 값3  
		 * 
		 * ex) 홀수, 짝수, 0의 3가지 경우의 수 판별
		 * */
		
		int num = 0;
		
		String result = (num == 0) 		? "0"	: 
						(num % 2 == 0)	? "짝수" : "홀수";
		
		
		
		System.out.println(result);
		
		
	}

}
