package enum_;

import java.time.LocalDate;
import java.time.Month;

public class Ex1 {

	public static void main(String[] args) {
		BadWeek badweek = new BadWeek();
		
		// Setter 호출하여 파라미터로 요일 전달 시 정확한 정수값을 몰라도
		// 상수 호출만으로 해당 정수 사용 및 전달이 가능
		badweek.setMyWeek(BadWeek.WEEK_FRIDAY);
		
		if(badweek.getMyWeek() == BadWeek.WEEK_FRIDAY) {
			System.out.println("오늘은 금요일입니다.");
		}
		
		// ------------------------------------------------------------------------
		
		// 요일 정보를 상수로 관리하는 경우의 문제점
		badweek.setMyWeek(10);
		
		// => 상수 데이터들이 정수일 경우 해당 정수를 전달받은 메소드(Setter) 호출 시
		//    상수 범위 값이 아닌 다른 값을 전달해도 컴파일 에러(문법적 오류)가 발생하지 않는다!
		// 10 이라는 정수값을 갖는 요일은 없으나
		// int 타입 파라미터 이므로 컴파일 시점에서는 아무런 문제가 발생하지 않는다!
		// 그러나, 해당 데이터를 사용하기 위한 시점에는 문제가 발생할수 있다.
		// => 따라서, 별도로 해당 범위 내의 데이터인지 판별하여 추가적인 작업을 수행해야함!
		
		// ------------------------------------------------------------------------
		
		// 열거타입 사용
		// EnumWeek myWeek = new EnumWeek(); // 열거타입도 인스턴스 생성 불가!
		EnumWeek myWeek = EnumWeek.TUESDAY;
		System.out.println("오늘은 " + myWeek + "입니다.");
		
		if(myWeek == EnumWeek.TUESDAY) { // 상수 비교 방법이 동일함
			System.out.println("오늘은 화요일입니다.");
		}
		
		System.out.println("----------------------------------");
		
		// 열거타입 활용하는 클래스 사용
		GoodWeek gw = new GoodWeek();
		gw.setMyWeek(EnumWeek.WENDSDAY);
		System.out.println("오늘의 요일 : " + gw.getMyWeek());
		gw.printWeek();
		
		// ------------------------------------------------------------------------
		
		// 열거타입 사용 시 장점
		// => 정의 시 지정된 상수 외의 다른 값은 절대 전달 불가능!
		// gw.setMyWeek(5);
		// gw.setMyWeek("MONDAY");
		// => 반드시 열거타입명.상수명 으로 지정된 값만 전달 해야한다!
		gw.setMyWeek(EnumWeek.SATURDAY);
		
		System.out.println("----------------------------------");
		
		LocalDate today = LocalDate.now();
		LocalDate today2 = LocalDate.now();
		System.out.println(today);
		System.out.println(today == today2);
		
		int monthValue = today.getMonthValue();
		System.out.println("오늘은 " + monthValue + "월 입니다!");
		
		Month month = today.getMonth();
		System.out.println("오늘은 " + month + "월 입니다!");
		
		// switch-case 문으로 월 판별
		switch (month) {
		case JANUARY:
			System.out.println("오늘은 1월입니다.");
			break;
		case FEBRUARY:
			System.out.println("오늘은 2월입니다.");
			break;
		case MARCH:
			System.out.println("오늘은 3월입니다.");
			break;
		case APRIL:
			System.out.println("오늘은 4월입니다.");
			break;
		case MAY:
			System.out.println("오늘은 5월입니다.");
			break;
		case JUNE:
			System.out.println("오늘은 6월입니다.");
			break;
		case JULY:
			System.out.println("오늘은 7월입니다.");
			break;
		case AUGUST:
			System.out.println("오늘은 8월입니다.");
			break;
		case SEPTEMBER:
			System.out.println("오늘은 9월입니다.");
			break;
		case OCTOBER:
			System.out.println("오늘은 10월입니다.");
			break;
		case NOVEMBER:
			System.out.println("오늘은 11월입니다.");
			break;
		case DECEMBER:
			System.out.println("오늘은 12월입니다.");
			break;

		default:
			break;
		}
	}

}

//------------------------------------------------------------------------

// 열거타입 정의
// 열거형 정의 시 중괄호 내에는 값을 갖는 상수 이름만 나열함 (별도의 값을 지정하지 않는다!)
enum EnumWeek {
	MONDAY, TUESDAY, WENDSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// 열거타입을 사용하는 클래스 (has - a)
class GoodWeek {
	
	// 클래스 내에서 열거타입 변수 선언 가능 (로컬변수로도 가능)
	EnumWeek myWeek;

	public EnumWeek getMyWeek() {
		return myWeek;
	}

	public void setMyWeek(EnumWeek myWeek) {
		this.myWeek = myWeek;
	}
	
	public void printWeek() {
		// 저장된 요일(myWeek)을 판별하여 월요일 ~ 일요일 까지 출력 => switch ~ case 사용
		// 주의사항! switch문에 enum 타입 변수를 전달할 경우
		// case 문에서 비교값으로 enum 타입 값을 지정할때 열거타입명 없이 상수 바로 사용!
		
		switch (myWeek) {
		case MONDAY:
			System.out.println("오늘은 월요일입니다!");
			break;
		case TUESDAY:
			System.out.println("오늘은 화요일입니다!");
			break;
		case WENDSDAY:
			System.out.println("오늘은 수요일입니다!");
			break;
		case THURSDAY:
			System.out.println("오늘은 목요일입니다!");
			break;
		case FRIDAY:
			System.out.println("오늘은 금요일입니다!");
			break;
		case SATURDAY:
			System.out.println("오늘은 토요일입니다!");
			break;
		case SUNDAY:
			System.out.println("오늘은 일요일입니다!");
			break;
		

		default:
			break;
		}
	}
}

//------------------------------------------------------------------------

// 열거타입 아닌 일반 상수로 선언하는 클래스
class BadWeek {
	// 요일 정보를 상수로 관리하는 경우의 장점
	// => 외부에서 실제 데이터를 정확하게 알지 못해도 상수명(변수명)만으로 값을 사용 가능하며
	//    클래스명만으로 접근 가능하여 접근이 쉬움.
	//    또한, 값 변경이 불가능하여 안전함
	
	public static final int WEEK_MONDAY = 0;
	public static final int WEEK_TUESDAY = 1;
	public static final int WEEK_WENSDAY = 2;
	public static final int WEEK_THURSDAY = 3;
	public static final int WEEK_FRIDAY = 4;
	public static final int WEEK_SATURDAY = 5;
	public static final int WEEK_SUNDAY = 6;
	
	private int myWeek;

	public int getMyWeek() {
		return myWeek;
	}

	public void setMyWeek(int myWeek) {
		// this.myWeek = myWeek;
		
		// 요일에 대한 정상 범위 판별 없이 저장 작업을 수행할 경우
		// 실제 저장된 요일을 꺼내서 사용하는 시점에는 문제가 발생할 수 있다!
		// 따라서, 조건문등을 사용하여 전달받은 파라미터에 대한 검증이 추가적으로 필요함
		if(myWeek >= WEEK_MONDAY && myWeek <= WEEK_SUNDAY) {
			this.myWeek = myWeek;
		} else {
			System.out.println("요일 입력 에러");
		}
	}
}