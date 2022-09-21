package abstract_method;

public class Ex2 {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.무기 = new 화이트소드(100);
		h.attack();
		h.무기 = new 제네시스(200);
		h.attack();
		
		전사 h2 = new 전사();
		h2.무기 = new 바이킹소드(500);
		h2.attack();
	}
}

class Hero {
	Hero무기 무기;
	public void attack() {
		무기.attack();
	}
}

class 전사 {
	한손검 무기;
	public void attack() {
		무기.attack();
	}
}

// 얘는 그냥 검종류를 묶어주는 '추상적인' 개념 => abstract로 선언
abstract class Hero무기 {
	int demage;
	public abstract void attack();
}
abstract class 한손검 extends Hero무기 {}
abstract class 두손검 extends Hero무기 {}

class 바이킹소드 extends 한손검 {
	public 바이킹소드(int demage) {
		this.demage = demage;
	}
	
	@Override
	public void attack() {
		System.out.println("바이킹소드 : " + demage + "로 공격!");
	}
}

class 화이트소드 extends 한손검 {
	public 화이트소드(int demage) {
		this.demage = demage;
	}
	
	@Override
	public void attack() {
		System.out.println("화이트소드 : " + demage + "로 공격!");
	}
}

// --------------------------------------------------------------------

class 카이세리움 extends 두손검 {
	public 카이세리움(int demage) {
		this.demage = demage;
	}
	
	@Override
	public void attack() {
		System.out.println("카이세리움 : " + demage + "로 공격!");
	}
}

class 제네시스 extends 두손검 {
	public 제네시스(int demage) {
		this.demage = demage;
	}
	
	@Override
	public void attack() {
		System.out.println("제네시스 : " + demage + "로 공격!");
	}	
}