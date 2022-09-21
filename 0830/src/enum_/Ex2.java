package enum_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * enum 객체의 메소드
		 * - enum 타입들은 모두 java.lang.Enum 클래스를 암묵적으로 상속받음
		 *   => 따라서, Enum 클래스에 정의된 메소드 활용 가능
		 * */
		
		Ex2 ex2 = new Ex2();
		ex2.compareEnum(Season.FALL);
	}

	// enum 타입 (Season타입) 객체 (seson)를 전달받음
	public void compareEnum(Season season) {
		// => season 객체의 ordinal 값 - 파라미터로 전달된 상수의 ordinal 값 결과 리턴
		System.out.println(season.compareTo(Season.WINTER));
		System.out.println(season.name());
		System.out.println(season.ordinal());
	}
}

// ----------------------------------------------------------------------------------------

//enum 타입 Season 정의
enum Season {
	// enum 타입 내의 상수는 자동으로 ordinal 값 (순서번호)이 부여됨 (0부터 자동 부여)
	
	SPRING, // ordinal : 0
	SUMMER, // ordinal : 1
	FALL,	// ordinal : 2
	WINTER  // ordinal : 3
}