package method;

public class Ex1 {

	public static void main(String[] args) {
		// 캡슐화(Encapsulation)
		// 객체 내부 구조를 외부로부터 숨기고 메세지만으로 객체와 통신하도록 하는 것
		// 클래스 정의 시 멤버변수를 private 접근 제한자 사용하여 외부 접근 차단하고
		// public 접근제한자 선언된 Getter / Setter 메소드 정의하여
		// 간접적으로 객체 내의 멤버변수에 접근하도록 함
		
		Student s = new Student();
		s.setName("정채연");
		s.setAge(20);
		s.setScore(90);
		
		System.out.println("이름 : " + s.getName());
		System.out.println("나이 : " + s.getAge());
		System.out.println("점수 : " + s.getScore());
		
		s.setScore(2183921);
		System.out.println(s.getScore());
		s.setScore(-100);
		System.out.println(s.getScore());
	}

}

class Student {
	private String name;
	private int age;
	private int score;
	
	// name 을 외부에서 전달 받아 내부 멤버변수 name에 저장하는 Setter 메소드 정의
	// 파라미터 o , 리턴값 x
	public void setName(String name) {
		this.name = name;
	}
	
	// name 을 외부로 리턴하는 Getter 메소드 정의
	// 파라미터 x , 리턴값 o (리턴할 값의 데이터타입 지정)
	public String getName() {
		return name;
	}

	// Getter / Setter 자동 생성 단축키
	// Alt + Shift + S -> R
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if(score < 0) {
			score = 0;
		}
		
		if (score > 100) {
			score = 100;
		}
		
		this.score = score;
	}
	
	
	
}
