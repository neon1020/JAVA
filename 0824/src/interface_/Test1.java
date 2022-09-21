package interface_;

public class Test1 {

	public static void main(String[] args) {
		SuperMan s = new SuperMan();
		s.takeOff();
		s.fly();
		s.land();
		
		System.out.println("------------------------");
		
		Bird b = new Bird();
		b.takeOff();
		b.fly();
		b.land();
		
		System.out.println("------------------------");
		
		Airplane a = new Airplane();
		a.takeOff();
		a.fly();
		a.land();
		
		System.out.println("------------------------");
		
		// for문으로 출력하기 (향상된 for문)
		Flyer[] fArr = new Flyer[] {s, b, a};
		for(Flyer f : fArr) {
			f.takeOff();
			f.fly();
			f.land();
		}
	}

}

// 인터페이스 Flyer 정의

interface Flyer {
	public void takeOff(); 	// 이륙
	public void fly();		// 비행
	public void land();		// 착륙
}

class SuperMan implements Flyer {
	@Override
	public void takeOff() {
		System.out.println("SuperMan 이륙!");
	}

	@Override
	public void fly() {
		System.out.println("SuperMan 비행!");
	}

	@Override
	public void land() {
		System.out.println("SuperMan 착륙!");
	}
}

class Bird implements Flyer {
	@Override
	public void takeOff() {
		System.out.println("Bird 이륙!");
	}

	@Override
	public void fly() {
		System.out.println("Bird 비행!");
	}

	@Override
	public void land() {
		System.out.println("Bird 착륙!");
	}
}

class Airplane implements Flyer {
	@Override
	public void takeOff() {
		System.out.println("Airplane 이륙!");
	}

	@Override
	public void fly() {
		System.out.println("Airplane 비행!");
	}

	@Override
	public void land() {
		System.out.println("Airplane 착륙!");
	}
}