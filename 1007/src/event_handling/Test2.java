package event_handling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test2 {

	public Test2() {
		showFrame();
	}
	
	public void showFrame() {
		
		/*
		 * JFrame 생성 및 버튼 생성 후 부착
		 * JButton 컴포넌트에 대한 이벤트 처리를 5단계 방식으로 구현
		 * */
		
		JFrame f = new JFrame("Test2");
		f.setBounds(600, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		f.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭!");
			}
		});
		
		// 람다식
		btn.addActionListener(e -> System.out.println("람다식 버튼 클릭!"));
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test2();
	}

}
