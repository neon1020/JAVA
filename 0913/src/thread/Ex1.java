package thread;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 프로그램(Program)
		 * - 디스크에 설치되어있는 "실행되기 전" 상태의 소프트웨어
		 * 
		 * 프로세스(Process)
		 * - 프로그램을 실행하여 메모리에 로딩된 상태 (= "실행 중"인 프로그램)
		 * - 멀티태스킹(Multi Tasking)
		 *   => 프로세스가 여러개일 때 해당 프로세스들이 동시에 수행되는 것
		 *      (정확히는 CPU가 빠른 속도로 프로세스들을 번갈아가면 처리함 = 진짜 동시 X)
		 *   ex) 동영상을 재생하면서 웹페이지를 표시하고, 자바 코드 실행하는 것
		 *      
		 * 쓰레드(Thread)
		 * - 프로세스 내에서 작업의 최소 단위
		 * - 하나의 프로세스 내에 쓰레드가 한개(= Single Thread)일 때
		 *   해당 프로세스 내에서 동시에 수행 가능한 작업은 단 하나 뿐이다.
		 * - 하나의 프로세스 내에서 동시에 수행 가능한 작업을 늘리려면
		 *   멀티 쓰레딩(= Multi Threading)을 구현해야한다!
		 *   ex) 메신저에서 파일 전송과 함께 메세지 송신, 수신을 동시에 수행하는 것
		 *    
		 * 일반적인 프로그래밍은 싱글 쓰레드(Single Thread)로 동작하므로
		 * 하나의 작업이 끝난 후에야 그 다음 작업이 수행될 수 있다!
		 * 
		 * */
		
		NoThread nt1 = new NoThread("★★ A작업 ★★", 10000);
		NoThread nt2 = new NoThread("☆☆ B작업 ☆☆", 10000);
		NoThread nt3 = new NoThread("♧♧ C작업 ♧♧", 10000);
		
		nt1.run();
		nt2.run();
		nt3.run();
		// => 기본적인 프로그램은 앞의 코드가 실행이 끝나야만 다음 코드가 실행된다!
	}

}


class NoThread {
	String str;
	int count;
	
	public NoThread(String str, int count) {
		this.str = str;
		this.count = count;
	}
	
	public void run() {
		for(int i = 0; i < count; i++) {
			System.out.println(i + " : " + str);
		}
	}
	
}
