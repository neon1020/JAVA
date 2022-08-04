package practice_object;

public class Run {

	public static void main(String[] args) {
		// Student 객체 생성
		Student st1 = new Student("김감자", 4, 10000);
		Student st2 = new Student("최둘기", 2, 5000);
		
		// Bus 객체 생성
		Bus bus105 = new Bus(105);
		
		// Subway 객체 생성
		Subway subway2 = new Subway(2);
		
		// 메소드 호출
		st1.takeBus(bus105);
		st1.showInfo();
		bus105.showInfo();
		
		System.out.println("------------------------------------");
		
		st2.takeSubway(subway2);
		st2.showInfo();
		subway2.showInfo();
	}

}
