package if_;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * - 특정 조건에 따라 문장의 실행여부를 결정하는 문
		 * 
		 * if문
		 * - 조건에 따라 특정 문장 실행여부를 결정하는 가장 기본적인 조건문
		 * - 조건식 판별 결과가 true 이면 블록{} 문 내의 문장들을 실행하고
		 *   조건식 판별 결과가 false이면 블록문을 생략함
		 * 
		 * < 기본 문법 >
		 * 
		 * 문장1;
		 * if(조건식){
		 * 		문장2;
		 * }
		 * 문장3;
		 * 
		 * 조건식 true : 문장1 > 문장2 > 문장3
		 * 조건식 false: 문장1 > 문장3
		 * 
		 * */
		
		int num = 8;
		
		// 정수형 변수 num의 값이 5보다 크면 "num이 5보다 크다!" 라고 출력!
		if(num > 5) {
			System.out.println("num이 5보다 크다!"); // 참이므로 출력
		}
		
		System.out.println("num: " + num); // if문과 상관 없이 출력되는 문장
		
		
	}

}
