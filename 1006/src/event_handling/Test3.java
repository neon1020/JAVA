package event_handling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test3 {
	
	public Test3() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame();
		f.setBounds(800, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		f.add(btn);
		
		MyMemberActionListener listener = new MyMemberActionListener();
		btn.addActionListener(listener);
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Test3();
	}
	
	// 이벤트 처리 3. 내부 클래스 형태로 정의 (멤버 레벨)
	// JButton 컴포넌트에 대한 이벤트 처리 담당 리스너 : ActionListener 인터페이스
	class MyMemberActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("라부");
		}
		
	}

}
