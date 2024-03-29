package thread;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * < 멀티 쓰레딩 구현 방법 >
		 * 2. Runnable 인터페이스를 구현하는 서브클래스를 정의하는 방법
		 * 		- 기존에 다른 클래스를 상속중인 서브클래스는 Thread 클래스 상속이 불가능하므로
		 * 		  Thread 클래스 상속 대신 Runnable 인터페이스를 구현하면 된다.
		 *        (Thread 클래스는 Runnable 인터페이스의 구현체이다.)
		 * 		- Runnable 인터페이스 내에는 start() 메소드가 존재하지 않으며
		 * 		  존재하더라도 추상메소드 형태이기 때문에 start() 메소드 호출이 불가능하다.
		 * 		  => 따라서, Thread 클래스를 통해 간접적으로 start() 메소드를 호출해야한다.
		 * 		1) 멀티쓰레딩 코드가 포함될 서브클래스에서 Runnable 인터페이스를 구현 (implements)
		 * 		2) 추상메소드인 run() 메소드를 구현(오버라이딩)하여 멀티쓰레딩 코드 기술
		 * 		3) 멀티쓰레딩 클래스 인스턴스 생성
		 * 		------------- 주의! Runnable 인터페이스 내에 start() 메소드가 존재하지 않음 --------------
		 * 		4) start() 메소드를 갖고있는 Thread 클래스의 인스턴스 생성
		 * 			=> 생성자 파라미터로 Runnable 구현체 객체 전달
		 * 		5) Thread 인스턴스 통해 간접적으로 start() 메소드 호출
		 * 
		 * */
		
		YourThread yt1 = new YourThread("@@ A작업 @@", 100);
		YourThread yt2 = new YourThread("&& B작업 &&", 100);
		YourThread yt3 = new YourThread("** C작업 **", 100);
		Runnable r = new YourThread("작업", 100); // 업캐스팅
		
		Thread t1 = new Thread(yt1); // Runnable 클래스로 업캐스팅
		Thread t2 = new Thread(yt2);
		Thread t3 = new Thread(yt3);
		Thread t4 = new Thread(new YourThread("작업", 100)); // 변수 선언 하지 않고 바로 전달도 가능
		new Thread(new YourThread("작업", 100)).start(); // 이런 식으로 바로 start() 메소드 호출하여 사용도 가능
		
		t1.start();
		t2.start();
		t3.start();
	}

}

class YourThread implements Runnable {
	String str;
	int count;
	
	public YourThread(String str, int count) {
		this.str = str;
		this.count = count;
	}
	
	// 인터페이스 구현이므로 run() 메소드 오버라이딩 필수!
	@Override
	public void run() {
		for(int i = 0; i < count; i++) {
			System.out.println(i + " : " + str);
		}
	}
}