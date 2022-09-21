package polymorphism;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 다형성(Polymorphism)
		 * - 하나의 클래스 타입 참조변수로 여러 인스턴스를 참조할 수 있는 특성
		 * - 서브클래스 타입 인스턴스들을 슈퍼클래스 타입으로 업캐스팅 하여
		 *   공통된 방법으로 여러 인스턴스의 멤버에 접근
		 *   ex) Employee 타입 변수로 Manager와 Engineer 인스턴스를 참조하여
		 *   	 각 객체내의 메소드 (getEmployee() 등)를 공통으로 다루는 것
		 * - 슈퍼클래스 타입 배열에 서브클래스 타입 인스턴스를 저장하거나
		 *   메소드 정의시 매개변수 하나에 여러 타입의 인스턴스를 파라미터로 전달할 때 활용  
		 * 
		 * < 주의사항! >
		 * 업캐스팅 후 슈퍼클래스 타입으로 서브클래스를 다룰 때
		 * 멤버변수는 참조변수 타입에 따라 결정되고,
		 * 메소드는 실제 인스턴스에 따라 결정 됨
		 * => 메소드 오버라이딩 시 업캐스팅 후에도 오버라이딩된 메소드만 호출되지만
		 *    변수에 대한 오버라이딩 시 업캐스팅 후에는 해당 변수에 접근하는
		 *    참조변수 타입에 따라 접근하는 변수가 달라진다.
		 * */
		
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		// 오버라이딩 없이 각 클래스의 메소드 호출 => 코드 통일성 x
		c.circleDraw();
		r.paint();
		
		System.out.println("--------------------------------");
		
		// 메소드 오버라이딩
		// 추상화를 통해 슈퍼클래스인 Shape 클래스를 정의하고
		// 상속을 통해 Shape 클래스의 draw() 메서드를 오버라이딩 하게 되면
		// 각 인스턴스에서 호출하는 메서드가 동일하므로 코드의 통일성이 향상됨
		c.draw();
		r.draw();
		t.draw();
		
		System.out.println("---------------------------------");
		
		// 업캐스팅
		Shape s = c;
		s.draw();
		
		s = r;
		s.draw();
		
		s = t;
		s.draw();
		
		System.out.println("---------------------------------");
		
		// 다형성을 배열에 적용시키는 경우
		Shape[] sArr = new Shape[3];
		
		// Shape 타입 배열 각 인덱스에 Circle, Rectangle, Triangle 인스턴스 생성하여 저장
		// => Shape 타입 배열은 Shape 클래스 타입에 해당하는 주소를 저장하는 배열이며
		//    Circle, Rectangle, Triangle 클래스의 인스턴스는 업캐스팅되어 주소가 저장됨
		sArr[0] = new Circle();
		sArr[1] = new Rectangle();
		sArr[2] = new Triangle();
		
		for(int i = 0; i < sArr.length; i++) {
			sArr[i].draw();
		}
		
		System.out.println("---------------------------------");
		
		// 향상된 for문
		for(Shape sp : sArr) {
			sp.draw();
		}
		
		System.out.println("---------------------------------");
		
		polymorphism(c);
		polymorphism(r);
		polymorphism(t);
		
	} // main 메소드 끝
	
	public static void polymorphism(Shape s) {
		// 각 도형에 따라 추가적인 작업 필요한 경우
		if(s instanceof Circle) {
			System.out.println("Circle 객체!");
			Circle c = (Circle)s;
			c.draw();
			c.circleDraw();
		} else if(s instanceof Rectangle) {
			System.out.println("Rectangle 객체!");
			Rectangle r = (Rectangle)s;
			r.draw();
			r.paint();
		} else if(s instanceof Triangle) {
			System.out.println("Triangle 객체!");
			Triangle t = (Triangle)s;
			t.draw();
		}
	}
	
} // Ex3 클래스 끝

class Shape {
	public void draw() {
		System.out.println("도형 그리기!");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("원 그리기!");
	}
	
	public void circleDraw() {
		System.out.println("원 그리기!");
	}
}

class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("사각형 그리기!");
	}
	
	public void paint() {
		System.out.println("사각형 그리기!");
	}
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("삼각형 그리기!");
	}
}
