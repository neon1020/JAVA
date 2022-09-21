package abstract_method;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		Flyer[] fArr = new Flyer[3];
		fArr[0] = new Bird();
		fArr[1] = new SuperMan();
		fArr[2] = new Airplane();
		
		// for문
		for(int i = 0; i < fArr.length; i++) {
			fArr[i].fly();
		}
		
		System.out.println("----------------------------");
		
		// 향상된 for문
		for(Flyer f : fArr) {
			f.fly();
		}
		
		System.out.println("----------------------------");
		
		// ArrayList
		ArrayList<Flyer> fList = new ArrayList<Flyer>();
		fList.add(new Bird());
		fList.add(new SuperMan());
		fList.add(new Airplane());
		
		for(Flyer f : fList) {
			f.fly();
		}
		
	} // main()

} // Test1 클래스 끝

// ------------------------------------------------------------

abstract class Flyer {
	public abstract void fly();
}

class Bird extends Flyer {
	@Override
	public void fly() {
		System.out.println("Bird 비행!");
	}
}

class SuperMan extends Flyer {
	@Override
	public void fly() {
		System.out.println("SuperMan 비행!");
	}
}

class Airplane extends Flyer {
	@Override
	public void fly() {
		System.out.println("Airplane 비행!");
	}
}
