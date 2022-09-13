package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * Matcher 클래스
		 * - 정규표현식에 해당하는 패턴 해석 및 문자열 일치 여부 파악
		 * - Pattern 클래스는 "문자열 전체"에 대한 검증만 수행하지만,
		 *   Matcher 클래스는 "부분 검증"도 가능
		 * - Pattern 클래스의 compile() 메소드를 통해 Pattern 객체를 생성하고
		 *   matcher() 메소드를 호출하여 Matcher 타입 객체 리턴 받아 사용 가능
		 */
		
		// < 메소드 >
		//	1) matches() : 원본 문자열이 정규표현식과 일치하는지 판별 (전체 일치 검사)
		//	2) lookingAt() : 원본 문자열 시작이 정규표현식과 일치하는지 판별 (시작 일치 검사)
		//	3) find() : 원본 문자열 내에 정규표현식이 포함되는지 판별 (부분 일치 검사)
		//	4) reset()
		//	5) replaceFirst()
		//	6) replaceAll() 
		
		String source = "Java and Javascript has no relation"; // 검사할 문자열
		String regex = "Java"; // 패턴 문자열
		
		// 1. 정규표현식 패턴 문자열을 Pattern 객체로 변환 (생성)
		Pattern pattern = Pattern.compile(regex);
		
		// 2. 정규표현식이 포함된 Pattern 객채의 matcher() 메소드를 호출하여
		//    원본 문자열을 파라미터로 전달한 뒤 Matcher 타입 객체 리턴 받음
		Matcher matcher = pattern.matcher(source);
		
		// 3. Matcher 객체의 다양한 메소드를 통해 정규표현식 검사 수행
		System.out.println("문자열이 정규표현식에 완전히 부합하는가? : " + matcher.matches());
		// => 정규표현식 "Java"는 원본 문자열과 완전히 일치하지 않으므로 false 리턴
		
		System.out.println("문자열이 정규표현식으로 시작되는가? : " + matcher.lookingAt());
		// => 정규표현식 "Java" 문자열이 원본 문자열 시작과 같으므로 true 리턴
		
		// -----------------------------------------------------------------------------------------
		System.out.println("문자열이 정규표현식을 포함하는가? : " + matcher.find()); // true
		System.out.println("문자열이 정규표현식을 포함하는가? : " + matcher.find()); // false
		// ------------------------------------------------------------------------------------------
		// => 주의! 만약 lookingAt() 메소드 등을 사용하여 부분 검색 수행 후에는
		//    시작 인덱스 번호가 변경되므로 인덱스 리셋이 필요함 = reset() 메소드 호출 필요
		
		matcher.reset();
		System.out.println("문자열이 정규표현식을 포함하는가? : " + matcher.find()); // true
			// => 0번 인덱스부터 검사하므로 "Java" 문자열이 포함되어 true 리턴
		System.out.println("문자열이 정규표현식을 포함하는가? : " + matcher.find()); // true
			// => 4번 인덱스부터 검사하므로 "Java" 문자열이 포함되어 true 리턴
		System.out.println("문자열이 정규표현식을 포함하는가? : " + matcher.find()); // false
			// => 이미 앞에서 "Java" 문자열을 검사했으므로 해당 위치 뒷부분부터 검사됨
			// 	  따라서, 뒷부분 문자열에 "Java" 가 존재하지 않으므로 false 리턴됨
		
		// 만약 reset() 메소드 호출하지 않을 경우는 find() 메소드 파라미터로 검색할 인덱스번호 (0번) 지정해줘도 됨
		System.out.println("문자열이 정규표현식을 포함하는가? : " + matcher.find(0)); // true
		
		System.out.println("-------------------------------------------------------------------");
		
		// 처음 일치하는 문자열만 치환 => 진짜로 원본 문자열이 바뀐 것이 아닌 치환된 결과가 리턴된 것임
		System.out.println("Java -> 자바 replaceFirst() : " + matcher.replaceFirst("자바"));
		
		// 일치하는 모든 문자열을 치환 => 진짜로 원본 문자열이 바뀐 것이 아닌 치환된 결과가 리턴된 것임
		System.out.println("Java -> 자바 replaceAll() : " + matcher.replaceAll("자바"));
		
		System.out.println("-------------------------------------------------------------------");
	}

}
