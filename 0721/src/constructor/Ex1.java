package constructor;

class DefaultPerson {
	
	String name;
	
	// 기본 생성자 (아무것도 정의하지 않으면 컴파일러에 의해 이 기본생성자가 생성됨)
	public DefaultPerson() {}
	
}

class DefaultPerson2 {
	String name;
	
	public DefaultPerson2() {
		System.out.println("DefaultPerson2() 생성자 호출됨!!");
		name = "홍길동";
	}
}

class ParameterPerson {
	String name;
	
	public ParameterPerson(String newName) { // 생성자 명시하면 기본생성자는 사라짐!
		System.out.println("ParameterPerson(String) 생성자 호출됨!!");
		name = newName;
	}
	
}

class ParameterPerson2 {
	String name;
	int age;
	boolean isHungry;
	
	public ParameterPerson2(String newName, int newAge, boolean newIsHungry) {
		System.out.println("ParameterPerson2(String, int, boolean) 생성자 호출됨!!");
		name = newName;
		age = newAge;
		isHungry = newIsHungry;
	}
}

public class Ex1 {

	public static void main(String[] args) {
		DefaultPerson dp = new DefaultPerson();
		System.out.println("dp의 name : " + dp.name);
		System.out.println("--------------------");
		
		DefaultPerson2 dp2 = new DefaultPerson2();
		System.out.println("dp2의 name : " + dp2.name);
		System.out.println("--------------------");
		
		ParameterPerson pr = new ParameterPerson("이순신");
		System.out.println("pr의 name : " + pr.name);
		System.out.println("--------------------");
		
		ParameterPerson2 pr2 = new ParameterPerson2("강감찬", 20, true);
		System.out.println("pr2의 name : " + pr2.name);
		System.out.println("pr2의 age : " + pr2.age);
		System.out.println("pr2의 isHungry : " + pr2.isHungry);

	}

}
