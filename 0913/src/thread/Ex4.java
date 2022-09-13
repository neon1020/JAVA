package thread;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 멀티쓰레딩 구현 코드의 변형
		 * - 실제 프로그래밍에서 더 많이 쓰는 형식
		 * - Runnable 인터페이스를 구현하는 구현체 클래스를 별도로 정의하지 않고
		 *   Thread 클래스의 생성자에 Runnable 인터페이스 객체 생성 코드를 바로 작성
		 *   => Runnable 인터페이스의 임시 객체 형태를 Thread 생성자에 전달
		 * - Runnable 객체를 담는 변수가 없으므로 Runnable 객체에는 접근 불가능
		 *   만약, Thread 객체의 변수도 제거하는 경우 Thread 객체도 접근 불가능
		 *   => 일회용 객체 (= 임시 객체) 라고 한다!
		 * 
		 * < 기본 문법 >
		 * Thread t = new Thread(new Runnable(){
		 * 		@Override
		 *		public void run() {
		 *			// 멀티 쓰레딩으로 구현할 코드...
		 *		}
		 * })
		 * t.start();
		 * 
		 * => 위의 두문장을 하나로 결합하여 Thread 객체도 임시 객체로 사용 가능
		 * new Thread(new Runnable(){ 멀티 쓰레딩으로 구현할 코드... }).start();
		 * 
		 * => 람다식 (Java 8)
		 * new Thread(() -> { 멀티 쓰레딩으로 구현할 코드... }).start();
		 * 
		 * */
		
		// Runnable 인터페이스를 상속 받는 객체를 바로 생성 => 일회용 객체(= 임시 객체)
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					System.out.println(i + " : A 작업");
				}
			}
		});
		
		// t1.start();
		
		// 위 작업을 하나의 문장으로 결합
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					System.out.println(i + " : A 작업");
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					System.out.println(i + " : B 작업");
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					System.out.println(i + " : C 작업");
				}
			}
		}).start();
		
		// ---------------------------------------------------------------------------
		
		// 람다식 : 추상메소드가 하나뿐인 인터페이스 구현 객체 생성하는 방법
		new Thread(() -> {
				for(int i = 0; i < 10000; i++) {
					System.out.println(i + " : 람다 작업");
				}
			}
		).start();
		
		// ---------------------------------------------------------------------------
		
		// Thread 클래스만으로 멀티쓰레딩 구현하는 방법 (위 방법들보다는 덜 쓰임)
		new Thread() {

			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					System.out.println(i + " : D 작업");
				}
			}
			
		}.start();
		
	}

}
