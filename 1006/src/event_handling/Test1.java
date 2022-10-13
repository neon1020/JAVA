package event_handling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test1 {

	public Test1() {
		showFrame();
	}
	
	public void showFrame() {
		
		/*
		 * 1. 300, 200 프레임 생성
		 * 2. "버튼" 이라는 텍스트를 갖는 버튼 객체 생성 후 프레임에 부착
		 * 3. 클릭 이벤트 처리를 위해 ActionListener 인터페이스를 구현하는 핸들러(MyActionListener) 정의
		 * 4. 버튼 객체의 addXXXListener() 메소드 호출하여 MyActionListener 객체 전달
		 * */
		
		JFrame f = new JFrame("Test1");
		f.setBounds(800, 400, 300, 200);
		
		// JButton 객체 생성 및 JFrame 객체에 부착
		JButton btn = new JButton("버튼");
		f.add(btn);
		
		// 1. 리스너 구현체 객체 생성
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test1();
	}

}

class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 클릭!");
	}
	
}
