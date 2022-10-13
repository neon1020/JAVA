package event_handling;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Ex2 {
	
	/*
	 * 이벤트 처리 2단계 (리스너 인터페이스 대신 어댑터 클래스 사용)
	 * 		- 추상메소드가 2개 이상인 인터페이스를 구현할 경우
	 * 		  불필요한 메소드까지 구현해야하므로 코드가 길어짐
	 * 
	 * 		- 리스너 인터페이스를 미리 구현해놓은 어댑터 클래스를 상속받는 핸들러에서
	 * 		  원하는 메소드만 선택하여 오버라이딩이 가능하므로 코드가 간결해짐
	 * 
	 * 		- XXXListener 인터페이스에 대응하는 XXXAdapter 클래스가 제공됨
	 * 		  단, 추상메소드가 하나뿐인 인터페이스는 어댑터클래스가 제공되지 않음
	 * 		  ex) ActionListener 인터페이스의 추상메소드가 1개 이므로 ActionAdapter 제공 X
	 * */

	public Ex2() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("이벤트 처리 - 2");
		f.setBounds(600, 400, 300, 200);
		
		MyWindowAdapter adapter = new MyWindowAdapter();
		f.addWindowListener(adapter); // 업캐스팅
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex2();
	}

}

// 이벤트 처리 2단계
class MyWindowAdapter extends WindowAdapter {

	// 상속받은 슈퍼클래스의 메소드 중 필요한 메소드만 선택적 오버라이딩
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		System.exit(0);
	}
	
}
