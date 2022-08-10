package practice;

public class Ex1 {
	/*
	 * 기본형(Primitive Type) 변수와 참조형(Reference Type) 변수의 차이
	 * - 기본형 변수는 실제값(리터럴)을 저장하며,
	 *   참조형 변수는 실제값이 저장된 인스턴스의 주소값(참조값 = 레퍼런스)을 저장
	 *   
	 * 기본형 변수와 참조형 변수의 값을 복사(전달)할 때 차이점
	 * 1. 기본형 변수의 값을 복사할 경우
	 * 		- 변수에 저장된 실제 값을 복사(전달) = Pass by value
	 * 		- 실제 값을 복사하게 되면 원본 값과 동일한 값이 별도로 생성되어 전달되므로
	 * 		  복사된 값을 변경하더라도 원본 값과 상관 없기 때문에 원본 값은 변경되지 않는다!
	 * 
	 * 2. 참조형 변수의 값을 복사할 경우
	 * 		- 변수에 저장된 인스턴스 주소값을 복사(전달) = Pass by reference
	 * 		- 주소값을 복사하게 되면 원본값에 저장된 주소와 동일한 주소가 전달되므로
	 * 		  한쪽에서 인스턴스에 접근하여 저장된 값을 변경할 경우
	 * 		  동일한 주소값을 참조하는 쪽에도 영향을 받게 된다.
	 * 		  => 즉, 한쪽에서 값을 변경하면 다른쪽의 값도 함께 변경되는 효과를 갖는다.
	 * */
	

	public static void main(String[] args) {
		// ---------- 기본형 변수에서의 값 변경 ----------
		int x = 10;
		int y = x; // 실제값(10)을 복사하여 변수 y에 전달
		System.out.println("x = " + x + ", y = " + y);
		
		// y값 변경 => x에는 영향 없음
		y = 99;
		System.out.println("x = " + x + ", y = " + y);
		
		System.out.println("------------------------------");
		
		Num n = new Num();
		n.x = 10;
		n.y = n.x; // 인스턴스 내의 기본형 변수도 값의 복사가 일어남
		System.out.println("n.x = " + n.x + ", n.y = " + n.y);
		
		n.y = 99; // n.x 에는 영향 없음
		System.out.println("n.x = " + n.x + ", n.y = " + n.y);
		
		System.out.println("------------------------------");
		
		// ---------- 참조형 변수에서의 값 변경 ----------
		Num n2 = new Num();
		n2.x = 10;
		n2.y = 10;
		
		Num n3 = n2; // 참조형 변수 n2의 주소 전달
		// n2와 n3가 가리키는(참조하는) 인스턴스가 동일함
		System.out.println("n2.x = " + n2.x + ", n2.y = " + n2.y);
		System.out.println("n3.x = " + n3.x + ", n3.y = " + n3.y);
		
		System.out.println("------------------------------");
		
		// n3의 인스턴스 내 변수 값 변경
		// 같은 주소 가리키고 있으므로 n2의 y도 값이 변경됨!
		n3.y = 99;
		System.out.println("n2.x = " + n2.x + ", n2.y = " + n2.y);
		System.out.println("n3.x = " + n3.x + ", n3.y = " + n3.y);
		
		System.out.println("------------------------------");
		
		System.out.println("변경 전");
		MyDate md = new MyDate(2022, 8, 9);
		// 원래 md 뒤에 .toString 이 생략되어있음!
		// 원래 toString은 주소를 출력해주지만
		// 출력문 출력 하도록 오버라이딩 했으므로 출력문 형식으로 출력이됨
		System.out.println(md);
		
		// 주소값 복사
		MyDate md2 = md;
		System.out.println(md2);
		
		System.out.println();
		
		System.out.println("변경 후");
		// md2 연도 변경 시 md 의 연도도 변경됨
		md2.year = 1999;
		
		System.out.println(md);
		System.out.println(md2);
		
		System.out.println("-------------------------------");
		
		PassValue pv = new PassValue();
		int xNum = 10;
		System.out.println("changeValue() 메소드 호출 전 xNum 값 : " + xNum);
		pv.changeValue(xNum); // 실제 값의 복사를 통해 값 전달
		// 실제 xNum 변수 자체에는 영향이 없음
		System.out.println("changeValue() 메소드 호출 후 xNum 값 : " + xNum);
		
		System.out.println("-------------------------------");
		
		Num num = new Num();
		num.x = 10;
		
		System.out.println("changeReferenceValue() 메소드 호출 전 num.x : " + num.x);
		pv.changeReferenceValue(num); // 참조변수 num 의 주소값 전달
		// 호출 후 num.x 자체가 변경됨
		System.out.println("changeReferenceValue() 메소드 호출 후 num.x : " + num.x);
		
		/*
		 * 결론!
		 * 변수 값을 변경하는 경우 '누가' 바꾸는지보다
		 * '무엇을' 바꾸는지가 중요하다!
		 * => 기본형 변수값을 변경하는 경우 값의 복사로 인해 원본은 영향 없음
		 * => 참조형 변수값을 변경하는 경우 주소값의 복사로 인해 원본도 영향 있음
		 * 
		 * */
	}

}

class Num {
	int x;
	int y;
}

class MyDate {
	int year;
	int month;
	int day;
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// Object 클래스에 있는 toString() 메소드 오버라이딩
	@Override
	public String toString() {
		return year + "년 " + month + "월 " + day + "일";
	}
}

class PassValue {
	public void changeValue(int x) {
		System.out.println("changeValue() 메소드 변경 전 x : " + x);
		x = 999;
		System.out.println("changeValue() 메소드 변경 후 x : " + x);
	}
	
	public void changeReferenceValue(Num num) {
		System.out.println("changeReferenceValue() 메소드의 변경 전 num.x : " + num.x);
		num.x = 999;
		System.out.println("changeReferenceValue() 메소드의 변경 후 num.x : " + num.x);
	}
}