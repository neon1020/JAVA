package interface_;

public class Ex2 {

	public static void main(String[] args) {
		
		/*
		 * 인터페이스 필요성(장점)
		 * 3. 상속 관계가 없는 객체끼리의 관계 부여하여 다형성 활용 가능
		 * 
		 * */
		
		// ------- 상속 관계가 아닐 경우 나쁜(불편한) 예 ---------
		/*
		 * HandPhone 클래스와 DigitalCamera는 특정 클래스와 상속 관계가 아니므로
		 * 두 클래스의 유일한 공통클래스는 Object 클래스 뿐이다.
		 * 따라서, 업캐스팅을 통해 다형성을 적용하려면 Object 타입으로 업캐스팅해야 하며
		 * 업캐스팅 후에는 두 객체의 고유멤버 접근이 불가능하므로
		 * 다시 다운캐스팅을 통해 각 객체의 고유 멤버에 접근해야한다!
		 * 
		 * */
		
		// 불편한 예
		Object ob1 = new HandPhone();
		Object ob2 = new DigitalCamera();
		
		// Object 타입 배열에 각 인스턴스 업캐스팅 하여 저장 => 반복문 
		Object[] obs = {ob1, ob2, new HandPhone(), new DigitalCamera()};
		
		for(Object o : obs) {
			if(o instanceof HandPhone) {
				HandPhone hp = (HandPhone)o;
				hp.charge();
			} else if(o instanceof Camera) {
				DigitalCamera dc = (DigitalCamera)o;
				dc.charge();
			}
		}
		
		System.out.println("----------------------------------------------------");
		
		// 인터페이스 통해 상속 관계 아닌 클래스끼리 상속 관계 구현
		
		/*
		 * HandPhone2 클래스와 DigitalCamera2는 특정 클래스와 상속관계가 아니지만
		 * 두 클래스와 유일한 공통클래스는 Object 클래스 외에
		 * Chargable 인터페이스를 정의하여 공통 부모로 정의하면
		 * 업캐스팅 후에도 두 객체의 고유 멤버인 charge() 메소드가
		 * 인터페이스 내의 추상메소드로 정의되어있기 때문에
		 * 타입 판별이나 다운캐스팅 없이도 공통 메소드 호출이 가능하다!!!
		 * */
		
		Chargable[] cg = {new HandPhone2(), new DigitalCamera2(), new HandPhone2(), new DigitalCamera2()};
		
		for(Chargable c : cg) {
			// 공통 부모인 Chargeable 인터페이스 타입으로 업캐스팅 한 뒤에도
			// 공통 메소드인 charge() 메소드에 직접 접근 가능 => instanceof 판별 필요없음
			c.charge();
		}
		
		
	} // main() 끝

}

// 불편한 예
class Phone {}

class HandPhone extends Phone {
	public void charge() {
		System.out.println("HandPhone 충전!");
	}
}

// -----------------------------------------------------

class Camera {}

class DigitalCamera extends Camera {
	public void charge() {
		System.out.println("Camera 충전!");
	}
}

// -----------------------------------------------------

// 인터페이스 통해 상속 관계 아닌 클래스끼리 상속 관계 구현
// 서로 상속관계가 없는 HandPhone과 DigitalCamera 클래스에
// 인터페이스를 통한 상속 관계를 부여하면 다형성을 확장하여 적용 가능!

interface Chargable {
	public void charge();
}

class Phone2 {}

class HandPhone2 extends Phone implements Chargable {
	@Override
	public void charge() {
		System.out.println("HandPhone 충전!");
	}
}

// -----------------------------------------------------

class Camera2 {}

class DigitalCamera2 extends Camera implements Chargable {
	@Override
	public void charge() {
		System.out.println("Camera 충전!");
	}
}
