package string;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * String 클래스의 메소드
		 * - 문자열 수정, 검색, 치환 등 다양한 작업을 수행하는 메소드를 제공
		 * 
		 * - String 객체는 불변 객체이므로 원본 문자열에 대한 수정이 불가능하며
		 *   수정, 치환 등 변경 작업 수행 시 원본 데이터가 아닌 변경된 문자열에 대한
		 *   새로운 문자열을 생성하여 관리함
		 *   => 따라서, 문자열 수정이 빈번할 경우 메모리 낭비가 심하므로
		 *      StringBuilder 또는 StringBuffer 객체를 활용 해야한다.
		 * */
		
		String s1 = "Java Programming";
		String s2 = "     아이티윌    부산    교육센터    ";
		String s3 = "자바/JSP/안드로이드";
		
		// length() : 문자열 길이 리턴
		System.out.println("s1.length() : " + s1.length());
		
		// equals() : 문자열 비교 (대소문자 비교)
		System.out.println("s1.equals(JAVA PROGRAMMING) : " + s1.equals("JAVA PROGRAMMING"));
		
		// equalsIgnoreCase() : 대소문자 상관 없이 문자열 비교
		System.out.println("s1.equalsIgnoreCase(JAVA PROGRAMMING) : " + s1.equalsIgnoreCase("JAVA PROGRAMMING"));
		
		// charAt() : 특정 인덱스에 위치한 문자 리턴 (리턴타입 : char)
		System.out.println("s1.charAt(5) : " + s1.charAt(5));
		
		// subString() : 특정 범위 문자열(부분 문자열) 추출
		// 1) subString(int befinIndex) : 시작 인덱스부터 모든 문자열 추출
		System.out.println("s1.subString(5) : " + s1.substring(5));
		
		// 2) subString(int befinIndex, int endIndex) : 시작 인덱스부터 끝인덱스 - 1 까지 문자열 추출
		System.out.println("s1.subString(5, 12) : " + s1.substring(5, 12));
		
		// concat() : 문자열 결합 (결합연산자(+) 보다 연산 속도가 빠르다!)
		System.out.println("s1.concat(!) : " + s1.concat("!"));
		
		// indexOf() : 문자열의 앞쪽(첫 인덱스)부터 찾고자 하는 문자 또는 문자열의 인덱스 리턴
		System.out.println("s1.indexOf(a) : " + s1.indexOf('a')); // 앞에서부터 문자 'a'를 찾아 인덱스(1) 리턴
		System.out.println("s1.indexOf(a) : " + s1.indexOf("a")); // 앞에서부터 문자열 "a"를 찾아 인덱스(1) 리턴
		System.out.println("s1.indexOf(x) : " + s1.indexOf('x')); // 없는 문자는 -1 리턴!
		System.out.println("s1.indexOf(Program) : " + s1.indexOf("Program")); // 문자열의 시작위치 인덱스(5) 리턴
		
		// lastIndexOf() : 문자열의 뒤쪽(끝 인덱스)부터 찾고자 하는 문자 또는 문자열의 인덱스 리턴
		// => 탐색을 뒤에서 부터 할 뿐 인덱스 번호 자체가 거꾸로 바뀌는 것은 아님!
		System.out.println(s1.lastIndexOf("a"));
		
		// replace() : 특정 문자 또는 문자열에 대한 치환 기능을 제공
		// => 동일한 문자 또는 문자열이 여러개 있을 경우 모두 치환함
		System.out.println(s1.replace('a', '@'));
		System.out.println(s1.replace("a", "@")); // 파라미터의 Character Sequence = Char 타입 배열 = String
		System.out.println(s1.replace("Java", "Android"));
		
		// toUpperCase(), toLowerCase() : 알파벳(영문자) 대소문자 변환 기능
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		// trim() : 문자열 앞 뒤(좌 우) 공백 제거 => 주의! 문자열 사이의 공백은 제거하지 않음
		// => 문자열 입력 시 의도치 않은 불필요한 공백이 삽입되는 것을 방지할 때 사용
		System.out.println("교육 기관은 " + s2.trim() + "입니다.");
		System.out.println("교육 기관은 " + s2.replace(" ", "").replace("\t", "").trim() + "입니다.");
		// => 사이 공백, 탭으로 띄운 공백, 앞뒤공백 제거
		
		// split() : 문자열을 특정 기준으로 분리하여 분리된 문자열을 "배열"로 리턴
		String[] subject =  s3.split("/"); // 이 문자열은 포함 안 됨
		
		for(String s : subject) {
			System.out.println(s);
		}
		
		// Arrays 클래스의 toString() 메소드 활용하여 데이터 꺼내는 경우
		// => 문자열을 각각 접근할 수 없고, 하나의 문자열로 다룸
		System.out.println(Arrays.toString(subject));
		
		// split() 메소드 사용 시 주의사항!!
		// => 문자열 구분자로 마침표(.) 사용 시 "\\." 형태로 사용해야 함
		String s4 = "안녕하세요. 자바 프로그래밍 수업입니다.";
		String[] strArr = s4.split("."); // 정규표현식 .(모든 문자) 로 인식되어 전부 다 잘려나옴!
		System.out.println(Arrays.toString(strArr));
		
		String[] strArr2 = s4.split("\\.");
		System.out.println(Arrays.toString(strArr2));
		
		// contains() : 특정 문자열 포함 여부 확인 (리턴타입 : boolean)
		System.out.println("문자열 자바가 포함되어 있는가? : " + s1.contains("자바"));
		System.out.println("문자열 자바가 포함되어 있는가? : " + s1.contains("Java"));
		
		// format() : 특정 문자열을 형식 지정 문자와 결합하여 형식을 부여
		// => System.out.printf() 메소드와 동일하나 출력을 위한 것이 아닌 문자열 생성 시 형식 지정하기 위한 것!
		String name = "홍길동";
		int age = 29;
		double height = 187.56;
		
		// printf 사용 시
		System.out.printf("이름 : %s, 나이 : %d, 키 : %.1f \n", name, age, height); // %.1f 소숫점 1자리까지 반올림
		
		// format() 사용 시
		String total = String.format("이름 : %s, 나이 : %d, 키 : %.1f \n", name, age, height);
		System.out.println(total);
		
		// String 클래스는 불변 객체(final)이므로 원본 문자열은 변경되지 않는다!
		// => 항상 변경 결과가 새로운 문자열로 생성되기 때문!
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
