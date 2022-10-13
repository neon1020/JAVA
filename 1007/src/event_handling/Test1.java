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
		 * JFrame 생성 및 버튼 부착 후
		 * 이벤트 처리 4단계 방식으로 JButton 컴포넌트에 대한
		 * ActionListener 이벤트 연결!!
		 * */
		
		JFrame f = new JFrame("Test1");
		f.setBounds(600, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("클릭");
		f.add(btn);
		
		// 멤버레벨
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("로컬 버튼 클릭!");
			}
		};
		
		// 멤버레벨 (람다식)
		ActionListener listener2 = e -> System.out.println("로컬(람다) 버튼 클릭");
		
		
		btn.addActionListener(this.listener2);
		
		f.setVisible(true);
	}
	
	// 멤버레벨
	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("멤버 버튼 클릭!");
		}
	};
	
	// 멤버레벨 (람다식)
	ActionListener listener2 = e -> System.out.println("멤버(람다) 버튼 클릭");
	
	
	public static void main(String[] args) {
		new Test1();
	}
}