package if_;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * if문
		 * 
		 * - 정수형 변수 num에 대한 절대값 계산하여 출력
		 * => ex) num이 5일때 -> "변수 num = 5"
		 *    ex2)num이 -10일때 -> "변수 num = 10"
		 * 
		 * */
		
		int num = 5;
		
		if(num < 0) {
			num = -num;
		}
		
		System.out.println("변수 num = " + num);
		
		
		// 문자 ch가 대문자일 때, 소문자로 변환하여 출력
		// char는 정수형 대문자 + 32 -> 소문자
		
		char ch = 'a';
		
//		if('A' <= ch && ch <= 'Z') {
//			ch += 32;
//		}
//		
//		System.out.println(ch);
		
//		ch = ('A' <= ch && ch <= 'Z') ? (char)(ch+32) : ch;
//		ch = ('A' <= ch && ch <= 'Z') ? ch += 32 : ch;
		ch += ('A' <= ch && ch <= 'Z') ? 32 : 0; //삼항연산자로 바로 더하기
		
		System.out.println(ch);
		
		
		
	}

}
