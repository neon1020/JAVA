package polymorphism;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 동적 바인딩
		 * - 컴파일(번역) 시점에서 실행될 것으로 예상되는 코드와
		 *   실제 실행 시점에서 해당 객체의 타입 기준으로 메소드가 달라지는 것
		 * 
		 * */
		
		// 슈퍼클래스(Employee) 인스턴스 생성
		Employee e = new Employee("홍길동", 1000);
		System.out.println(e.getEmployee());
		
		// 서브클래스(Manager) 인스턴스 생성
		Manager m = new Manager("김감자", 2000, "Account");
		System.out.println(m.getEmployee());
		
		// 업캐스팅
		e = m;
		// 업캐스팅 후에는 참조영역에 대한 축소가 발생함
		// 단, 현재 Manager 클래스에는 별도의 추가 메소드가 없으므로 기능 동일함
		System.out.println(e.getEmployee()); // 오버라이딩된 메소드가 호출됨
		
		// => 코드상(컴파일시점)으로는 Employee 클래스의 getEmployee() 메소드가 호출될것으로 보이지만
		//    실제 e 변수에 저장된 인스턴스(객체) Manager 클래스의 인스턴스 이므로
		//    실행 시점에는 Maneger 클래스에 오버라이딩 된 getEmployee() 메소드가 실행됨!
		
		// ---------------------------------------------------------------------
		
		// 서브클래스(Engineer) 인스턴스 생성
		Engineer g = new Engineer("이당근", 3000, "Develope");
		System.out.println(g.getEmployee());
		
		// 업캐스팅
		// 출력문에서 실행되는 메서드는 문법적으로 차이가 없지만
		// 실제 참조하는 인스턴스가 달라지므로 결과값이 다르다!
		e = g;
		System.out.println(e.getEmployee());
	}

}

class Employee {
	String name;
	int salary;
	
	public Employee() {}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getEmployee() {
		return this.name + ", " + this.salary;
	}
}

// ----------------------------------------------------------------------

class Manager extends Employee {
	String depart;

	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	@Override
	public String getEmployee() {
		return super.getEmployee() + ", " + this.depart;
	}
}

//----------------------------------------------------------------------

class Engineer extends Employee {
	String skill;

	public Engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}

	@Override
	public String getEmployee() {
		return super.getEmployee() + ", " + this.skill;
	}
}


