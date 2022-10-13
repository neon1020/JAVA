package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex2 {

	public Ex2() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame();
		f.setBounds(600, 400, 400, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 패널 하나 생성한 후 프레임에 부착
		JPanel p = new JPanel();
		f.add(p);
		
		JCheckBox cb1 = new JCheckBox("Java");
		JCheckBox cb2 = new JCheckBox("JSP");
		JCheckBox cb3 = new JCheckBox("Android");
		JCheckBox cb4 = new JCheckBox("전체 선택");
		
		p.add(cb1); p.add(cb2); p.add(cb3); p.add(cb4);
		
		/*
		 * 전체선택 체크박스에 대한 이벤트 처리
		 * => 전체선택 체크 시 cb1, cb2, cb3를 모두 체크하고 (cb4에 텍스트 "전체선택 해제")
		 *    전체선택 체크 해제 시 cb1, cb2, cb3를 모두 체크해제 (cb4에 텍스트 "전체선택")
		 * */
		
		cb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println(cb4.isSelected());
				
				cb1.setSelected(cb4.isSelected());
				cb2.setSelected(cb4.isSelected());
				cb3.setSelected(cb4.isSelected());
				cb4.setText(cb4.isSelected() ? "전체 선택 해제" : "전체 선택");
			}
		});
		
		System.out.println();
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex2();
	}

}
