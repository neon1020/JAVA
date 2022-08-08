package inheritance;

public class Ex4 {

	public static void main(String[] args) {
		G g = new G();
		System.out.println("----------------------");
		
		// G 객체 생성 후 P가 생성됨
		P p = new P();
		System.out.println("----------------------");
		
		// G, P, C 세 객체가 차례로 생성됨 (생성자 상속과는 다른 개념!)
		// 생략된 super(); 로 부모 생성자가 호출됨!
		// 할아버지 전에 아버지가 생길 수 없고, 아버지가 생기기 전에 내가 생길 수 없음!
		// 상속 받으면 상속 받은 순서대로 각 객체가 먼저 생성되고 최종 객체("나")가 생성됨
		C c = new C();
	}
}

class G {
	public G() {
		System.out.println("G 생성됨");
	}
}

class P extends G {
	public P() {
		System.out.println("P 생성됨");
	}
}

class C extends P {
	public C() {
		System.out.println("C 생성됨");
	}
}