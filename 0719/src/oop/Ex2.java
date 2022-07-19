package oop;

// 하나의 소스파일(.java) 내의 복수개의 클래스 정의 가능
// 단, 파일명과 동일한 클래스에만 public 접근제한자를 붙일 수 있다.

// Animal 클래스 정의
// - 멤버변수: 이름(name, 문자열), 나이(age, 정수)
// - 메소드: cry() - 파라미터와 리턴값은 없음. "동물 울음 소리!" 출력
class Animal {
	
	String name;
	int age;
	
	public void cry() {
		System.out.println("동물 울음 소리!");
	}
	
}

public class Ex2 {

	public static void main(String[] args) {

		// Animal 인스턴스 생성(ani)
		// 이름: 멍멍이, 나이: 3
		Animal ani = new Animal();
		ani.name = "멍멍이";
		ani.age = 3;
		System.out.println("이름: " + ani.name + ", 나이: " + ani.age);
		ani.cry();
		
		// Animal 인스턴스 생성(ani2)
		// 이름: 야옹이, 나이: 2
		Animal ani2 = new Animal();
		ani2.name = "야옹이";
		ani2.age = 2;
		System.out.println("이름: " + ani2.name + ", 나이: " + ani2.age);
		System.out.println("=======================");
		
		Student s1 = new Student();
		System.out.println("이름: " + s1.name);
		System.out.println("학번: " + s1.id);
		System.out.println("나이: " + s1.age);
		
		// 또 다른 Studnet 인스턴스 생성
		// => 서로 다른 공간에 생성되는 인스턴스 이지만, 이름과 학번이 지정된 값으로 동일함
		Student s2 = new Student();
		System.out.println("이름: " + s2.name);
		System.out.println("학번: " + s2.id);
		System.out.println("나이: " + s2.age);
		
		System.out.println("------------------------------------");
		
		s1.name = "정채연";
		s1.id = "a1234567";
		s1.age = 28;
		s1.kor = 100;
		s1.eng = 95;
		s1.mat = 90;
		
//		System.out.println("이름: " + s1.name);
//		System.out.println("학번: " + s1.id);
//		System.out.println("나이: " + s1.age);
//		System.out.println("국어점수: " + s1.kor);
//		System.out.println("영어점수: " + s1.eng);
//		System.out.println("수학점수: " + s1.mat);
		s1.showStudentInfo();
		System.out.println("-------------------------");
		s2.showStudentInfo();
		
		System.out.println("========================");
		System.out.println("합계: " + s1.getTotal());
//		System.out.println("합계: " + 230); 과 동일한 코드
		System.out.println("합계: " + s2.getTotal());
		
		System.out.println("평균: " + s1.getAverage());
		
	}

}

/*
 * Student 클래스 정의
 * - 멤버변수 : 이름(name, 문자열), 학번(id, 문자열), 나이(age, 정수)
 * 			  국어점수(kor, 정수), 영어점수(eng, 정수), 수학점수(mat, 정수)
 * */
class Student {
	// 멤버변수(인스턴스변수)는 초기값을 지정해도되고, 생략도 가능
	// => 만약, 초기값을 지정할 경우 인스턴스 생성할 때마다 해당 초기값으로 초기화
	//    초기값 지정을 생략하는 경우 기본값으로 자동 초기화
	String name = "홍길동";	
	String id = "a0000000";
	int age;
	int kor;
	int eng;
	int mat;
	
	// showStudentInfo() 메서드 정의
	// 파라미터, 리턴값 없음. 다음과 같이 출력
	// 이름: XXX
	// 학번: XXX
	// 나이: ...
	
	public void showStudentInfo() {
		// 자신의 클래스에서 선언된 멤버변수는 클래스 내의 모든 메소드에서 접근이 가능
		// => 이때, 별도의 주소 지정없이 변수명만으로 접근가능
		// => 각 인스턴스에서 동일한 메소드를 호출하더라도
		//    인스턴스마다 멤버변수가 다르므로 실행 시 실제 저장된 데이터들은 서로 다름
		System.out.println("이름: " + name);
		System.out.println("학번: " + id);
		System.out.println("나이: " + age);
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + mat);
	}
	
	public int getTotal() {
//		int sum = kor + eng + mat;
//		return sum;
		return kor + eng + mat;
	}
	
	public double getAverage() {
//		double avg = (kor + eng + mat) / 3.0;
//		return avg;
		
//		return (kor + eng + mat) / 3.0;
		
		// 합계 계산 코드를 직접 작성하지 않고, 기존의 getTotal() 메소드를 재사용
		// => 메소드 내에서 자신의 클래스 내에 있는 다른 메소드를 호출할 경우
		//    멤버변수 접근 방법과 동일하게 호출하면됨!
		return getTotal() / 3.0;
	}
	
	
}
