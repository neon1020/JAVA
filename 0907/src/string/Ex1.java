package string;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * String 클래스
		 * - 문자열 데이터를 처리하는 클래스
		 * - 리터럴을 사용하여 문자열을 직접 생성(추천!) 하거나, String str = "";
		 *   인스턴스 생성 시 파라미터로 문자열을 전달하여 생성 가능 (new String())
		 *   => 리터럴 사용 시 중복 문자열은 주소값을 공유하므로 메모리 공간이 절약되지만,
		 *      인스턴스 생성 시 중복 문자열도 모두 새로운 공간을 할당받아 사용함 (주소가 다름)
		 *   => 가급적 문자열 비교시 동등비교연산자(==) 보다 equals() 메소드 사용 추천!
		 * - 문자열 저장 시 실제로는 char[] 타입으로 관리됨
		 *   => 사용자가 사용하기 편하게 문자열 String 타입이라는 형태로 가공되어 제공되는 것     
		 * */
		
		
		// 리터럴을 사용하여 문자열을 생성하는 방법 (가장 많이 사용)
		// => 문자열을 상수 풀(Constant Pool)에서 검색하여 중복되는 문자열이 없으면 저장하고
		//    중복되는 문자열이 있을 경우 해당 문자열의 주소값을 리턴
		
		String s1 = "홍길동";	// 처음 상수 풀에 저장되므로 "홍길동" 문자열이 생성됨
		String s2 = "홍길동";	// 기존 상수 풀에 저장된 문자열이 존재하므로
								// s1이 가리키는 주소와 동일한 주소값을 리턴하여 s2에 저장
		
		// => 따라서, 두 문자열을 저장하는 변수 s1, s2가 가리키는 주소값이 같다!
		
		
		// 동등 비교 연산 => 인스턴스 주소값 비교
		if(s1 == s2) {
			System.out.println("s1과 s2는 주소값이 같다!");
		} else {
			System.out.println("s1과 s2는 주소값이 다르다!");
		}
		
		// Object 클래스로부터 상속받아 오버라이딩 된 String 클래스의 equals() 메소드 사용하여 비교
		// => 실제 데이터(문자열) 비교
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 주소값이 같다!");
		} else {
			System.out.println("s1과 s2는 주소값이 다르다!");
		}
		
		System.out.println("--------------------------------------------");
		
		// 객체 생성을 통해 문자열 생성
		// => 인스턴스 생성 위해 new 연산자 사용 시 무조건 Heap 공간에 새로운 메모리 할당
		//     따라서, 동일한 문자열이라도 서로 다른 공간에 저장됨
		String s3 = new String("홍길동");
		String s4 = new String("홍길동");
		
		// 동등 비교 연산 => 인스턴스 주소값 비교
		if(s3 == s4) {
			System.out.println("s3과 s4는 주소값이 같다!");
		} else {
			System.out.println("s3과 s4는 주소값이 다르다!");
		}
		
		// equals() 메소드 사용하여 비교 => 실제 데이터(문자열) 비교
		if(s3.equals(s4)) {
			System.out.println("s3과 s4는 주소값이 같다!");
		} else {
			System.out.println("s3과 s4는 주소값이 다르다!");
		}
	}

}
