package thread;

public class Test1 {

	public static void main(String[] args) {
		SendMessageThread sm = new SendMessageThread("안녕", 100);
		FileTransferThread ft = new FileTransferThread("사진", 100);
		ReceiveMessageThread rm = new ReceiveMessageThread("반가워", 100);
		
		// 파일 전송 쓰레드가 시작되면 전송이 끝나지 않더라도
		// 메시지 전송이 시작되어 파일전송과 메시지 전송이 동시에 수행됨
		sm.start();
		ft.start();
		rm.start();
	}
}

// --------------------------------------------------------------------------------

// 메세지 전송 클래스
class SendMessageThread extends Thread {
	String str;
	int count;
	
	public SendMessageThread(String str, int count) {
		this.str = str;
		this.count = count;
	}

	@Override
	public void run() {
		for(int i = 0; i < count; i++) {
			System.out.println(i + " : " + str + " 메세지 전송");
		}
	}
}

//--------------------------------------------------------------------------------

// 파일 전송 클래스
class FileTransferThread extends Thread {
	String str;
	int count;
	
	public FileTransferThread(String str, int count) {
		this.str = str;
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < count; i++) {
			System.out.println(i + " : " + str + " 파일 전송");
		}
	}
}

//--------------------------------------------------------------------------------

// 메세지 수신 클래스
class ReceiveMessageThread extends Thread {
	String str;
	int count;
	
	public ReceiveMessageThread(String str, int count) {
		super();
		this.str = str;
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < count; i++) {
			System.out.println(i + " : " + str + " 메세지 수신");
		}
	}
}