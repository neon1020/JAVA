package variable;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * String 타입
		 * - 문자열을 표현하기 위한 데이터타입
		 * - 기본형이 아닌 참조형 (Reference Type)
		 * - 1개 이상의 문자열을 큰따움표("")로 묶어서 표현
		 * - 아무것도 포함하지 않는 문자열 ""을 널스트링(null String) 이라고 한다.
		 * - 덧셈 연산자(+)를 사용해서 문자열간 결합이 가능
		 * 
		 * */
		
		String s1 = "String 타입은	char 타입과 다르다!";
		System.out.println(s1);
		
		String s2 = "";   // 널스트링
		System.out.println(s2);
		
		String s3 = "안녕하세요. \n 제 이름은 \t '정채연' 입니다."; // \n 줄바꿈, \t 탭 띄우기
		System.out.println(s3);
		
		// 덧셈 연산자(+)를 사용해서 문자열 결합이 가능
		// => 어떤 데이터(X)와 문자열을 결합하면 결합된 결과가 새로운 문자열로 생성됨
		//    ex) X + "문자열" = "X문자열"
		//        "문자열" + X = "문자열X"
		System.out.println("1" + "2");
		System.out.println("3강의장 " + "정채연");
		System.out.println(1 + "문자열"); // 정수가 문자열로 변환된 후 결합되는 것
		System.out.println(1 + 2 + "문자열"); // 3문자열 (숫자 연산 먼저 수행)
		System.out.println("문자열" + 1 + 2); // 문자열12 (문자열 결합 먼저 수행)
		
		
		
	}

}
