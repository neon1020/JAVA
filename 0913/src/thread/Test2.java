package thread;

public class Test2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new GugudanRunnable(3));
		Thread t2 = new Thread(new GugudanRunnable(5));
		Thread t3 = new Thread(new GugudanRunnable(8));
		
		t1.start();
		t2.start();
		t3.start();
	}
}


/*
 * GugudanRunnable 클래스 정의 - Runnable 인터페이스 구현
 * - 멤버변수 (int dan)
 * - 생성자 정의(int형 변수 dan을 초기화하는 생성자)
 * - run() 메소드 내부에서 dan에 해당하는 구구단을 100번 반복 출력 => 멀티쓰레드!
 * */

class GugudanRunnable implements Runnable {
	int dan;

	public GugudanRunnable(int dan) {
		this.dan = dan;
	}

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(dan + " * " + j + " = " + (dan * j));
			}
		}
	}
}
