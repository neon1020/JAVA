package oop;

public class Ex1 {

	public static void main(String[] args) {
		Bubble b1 = new Bubble();
		b1.x = 100;
		b1.y = 50;
		
		Bubble b2 = new Bubble();
		b2.x = 40;
		b2.y = 60;
		
		Bubble b3;
		b3 = b1; // b1과 b3은 같은 객체 주소 참조
		
		b3.x = 1000; // b1.x의 값도 변경됨
		
		System.out.println("b1.x: " + b1.x + ", b1.y: " + b1.y);
		System.out.println("b2.x: " + b2.x + ", b2.y: " + b2.y);
		System.out.println("b3.x: " + b3.x + ", b3.y: " + b3.y);
		
		
	}
}

class Bubble {
	int x;	// x좌표
	int y;	// y좌표
}








