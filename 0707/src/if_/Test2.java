package if_;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 정수형 변수 num에 대한 양수, 음수 판별 (0은 양수로 간주)
		 * 양수라면 "X : 양수!" 라고 출력
		 * 음수라면 "X : 음수!" 라고 출력
		 * 
		 * */
//		int num = -10;
//		String result = num + " : ";
		
//		if(num >= 0) {	// 양수
//			result += "양수!";
//		} else {	// 음수
//			result += "음수!";
//		}
//		
//		System.out.println(result);
		
		// 삼항연산자
		int num = 10;
		String result = (num >= 0) ? " : 양수!" : " : 음수!";
		System.out.println(num + result);
		
		/*
		 * 문자 ch가 대문자 -> 소문자로 변환
		 *     ch가 소문자 -> 대문자로 변환
		 * "ch = X" 라고 출력    
		 * 
		 * */
		char ch = 'a';
		
		// if - else 문
//		if('A' <= ch && ch <= 'Z') {	// 대문자
//			ch += 32;
//		} else {	// 소문자
//			ch -= 32;
//		}
		
		// 삼항연산자
		
		ch += ('A' <= ch && ch <= 'Z') ? 32 : -32; // 바로 더하거나 빼기
		
		System.out.println("ch = " + ch);
		
		
		
		
		
		
	}

}
