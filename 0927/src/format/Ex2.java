package format;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.StringTokenizer;

public class Ex2 {

	public static void main(String[] args) throws ParseException {
		/*
		 * 숫자 및 문자 등 기본적인 데이터에 대한 형식화 클래스
		 * 
		 * 1. DecimalFormat 클래스
		 * 	- 숫자 데이터에 대한 형식화 클래스
		 * 		ex) 실수 1234.5 를 1234.50000 형식으로 표현
		 * 			정수 1234 를 ￦1,234 형식으로 표현
		 * 
		 * 	- 숫자 데이터를 패턴에 의해 형식화 된 문자열로 변환 : Formatting
		 * 	  => format() 메소드 사용
		 * 
		 * 	- 문자열을 지정된 패턴에 의해 숫자 데이터로 변환 : Parsing
		 * 	  => parse() 메소드 사용
		 * 	  => 리턴타입이 Number 타입이며, 기본적인 형식이 long 또는 double 이므로 주의!
		 * 		 int형으로 변환하거나 float형으로 변환하면 예외 발생!
		 * 
		 * 	- 기존 패턴에 새로운 패턴으로 교체하여 적용
		 * 	  => applyPattern() 메소드 사용
		 * 
		 * 	- 패턴 기호 문자
		 * 		0 : 0 ~ 9 한자리 (값이 없으면 0으로 채움)
		 * 		# : 0 ~ 9 한자리 (값이 없으면 자리 제거)
		 * 		. : 소수점 기호
		 * 		, : 1000단위 자릿수 구분 (콤마 기호 뒤의 #또는 0의 갯수마다 자동으로 표시)
		 * 		- : 음수 표시
		 * 		E : 지수
		 * 
		 * 2. MessageFormat 클래스
		 * 	- 문자열과 다른 기본타입 데이터 또는 객체데이터를 연결하는 경우
		 * 	  일반적으로 연결연산자(+)를 사용하지만, 문자열 구조가 복잡해지는 문제 발생
		 * 
		 * 	- MessageFormat 클래스를 사용하면 결합될 데이터를 변수처럼 사용하여
		 *    패턴을 적용한 뒤 문자열 결합을 간편하게 수행할 수 있다.
		 *    => 마치 printf() 메소드를 통해 문자열 결합으로 출력하는 것과 유사함
		 * 
		 * */
		
		double dNum = 1234.5;
		
		// String pattern = "￦#,###.###"; // => ￦1,234.5
		// String pattern = "￦0,000.000"; // => ￦1,234.500
		String pattern = "￦#,###.000"; // => 제일 많이 사용하는 형식
		
		// 1. 기본 데이터타입 숫자데이터 -> 형식화된 문자열
		// => DecimalFormat 클래스의 format() 메소드 사용
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println(df.format(dNum));
		
		// 2. 문자열에 대한 형식 지정 -> 기본데이터타입 숫자데이터
		String strNum = df.format(dNum); // ￦1,234.500
		
		// String -> double 변환 방법을 사용하면 예외 발생!
		// double parsedNum = Double.parseDouble(strNum); => 사용 불가!
		
		// 반드시 DecimalFormat 클래스의 parse() 메소드를 활용해야한다!
		// => 리턴타입이 Number 타입이므로 서브클래스 타입인 Double, Long 등으로 변환 필수
		//    오토언박싱도 활용 가능
		double parsedNum = (double)df.parse(strNum);
		System.out.println(parsedNum);
		
		// -----------------------------------------------------------------------------
		
		// 데이터를 결합하려 출력할 포멧을 패턴 문자열로 지정
		// => 실제 데이터가 결합될 부분을 {순서번호} 형태로 표시
		String messagePattern = "이름 : {0}, 나이 : {1}, 주민번호 : {2} [{0}]";
		
		// 데이터로 사용할 변수 선언
		String name = "홍길동";
		int age = 20;
		String jumin = "202020-1234567";
		
		// 패턴 문자열과 데이터를 결합하기 위해 MessageFormat 클래스의 format() 메소드 호출
		// => MessageFormat.format(패턴문자열, 데이터1, 데이터2, ... 데이터n);
		// => 이때, 패턴데이터는 각각의 순서번호에 맞게 전달되며
		//    일반 변수가 아닌 데이터가 모두 포함된 배열도 전달 가능함 (비정형 인자 사용됨)
		String formatStr = MessageFormat.format(messagePattern, name, age, jumin);
		System.out.println(formatStr);
		
		// -----------------------------------------------------------------------------
		
		Person[] pArr = {
				new Person("김감자", 30, "101010-2020202"),
				new Person("박둘기", 12, "202020-1111111"),
				new Person("최사과", 20, "303030-2222222")
		};
		
		// 반복문을 사용하여 pArr[] 배열을 반복하면서
		// 각각의 Person 객체 내의 이름(name), 나이(age), 주민번호(jumin) 데이터를
		// MessageFormat 클래스의 format() 메소드에 전달하여 형식 지정 출력
		for(Person p : pArr) {
			String formatStr2 = MessageFormat.format(messagePattern, p.getName(), p.getAge(), p.getJumin());
			
			System.out.println(formatStr2);
		}
		
		// -----------------------------------------------------------------------------
		
		String originalData =
				"김감자:30:101010-2020202,박둘기:12:202020-1111111,최사과:20:303030-2222222";
		
		// String[] oArr = new String[originalData.split(",").length];
		String[] oArr = originalData.split(",");
		
		for(String s : oArr) {
			String[] oArr2 = s.split(":");
			
			String formatStr3 = MessageFormat.format(messagePattern, oArr2[0], oArr2[1], oArr2[2]);
			// String formatStr3 = MessageFormat.format(messagePattern, oArr2); => 배열 자체를 가변인자로 보내도 됨
			System.out.println(formatStr3);
		}
		
		// StringTokenizer
		StringTokenizer st = new StringTokenizer(originalData, ",:");
		// st.nextToken(); // 홍길동
		// st.nextToken(); // 20
		
		while(st.hasMoreTokens()) {
			Object[] objs = {st.nextToken(), st.nextToken(), st.nextToken()};
			String str = MessageFormat.format(messagePattern, objs);
			System.out.println(str);
		}
		
	}

}



class Person {
	private String name;
	private int age;
	private String jumin;
	
	// 생성자
	public Person(String name, int age, String jumin) {
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	// Getter 메소드
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getJumin() {
		return jumin;
	}
}
