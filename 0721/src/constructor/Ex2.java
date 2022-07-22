package constructor;

class OverloadingPerson {
	String name;
	int age;
	boolean isHungry;
	
	public void print() {
		System.out.println("이름 : " + this.name); // this가 필수는 아니지만 명시해주면 좋다!
		System.out.println("나이 : " + this.age);
		System.out.println("배고픔 : " + this.isHungry);
	}
	
	public OverloadingPerson() {
		System.out.println("OverloadingPerson() 생성자 호출됨!");
		this.name = "홍길동";
		this.age = 20;
		this.isHungry = true;
	}

	// 생성자 오버로딩 : 파라미터가 다른 생성자를 여러번 정의하는 것
	// 생성자 만들기 : Alt + Shift + S => O
	public OverloadingPerson(String name, int age, boolean isHungry) {
		System.out.println("OverloadingPerson(String, int, boolean) 생성자 호출됨!");
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
	}

	public OverloadingPerson(String name) {
		this.name = name;
	}

	public OverloadingPerson(int age, String name) { // 파라미터 순서 바꿔도 가능! (다른 생성자로 인식)
		this.name = name;
		this.age = age;
	}

	public OverloadingPerson(int age) {
		this.age = age;
	}

	public OverloadingPerson(boolean isHungry) {
		super();
		this.isHungry = isHungry;
	}
}



public class Ex2 {

	public static void main(String[] args) {
		OverloadingPerson op = new OverloadingPerson();
		op.print();
		System.out.println("----------------------------");
		
		OverloadingPerson op2 = new OverloadingPerson("이순신", 40, false);
		op2.print();
	}

}
