import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CustomerGUI {
	
	private JFrame f;
	
	// North 영역 : 조회 조건
	private JTextField sName, sAge, sJumin;
	private JButton btnSelect;
	
	// Center 영역
	private JTable table;
	
	// West 영역
	private JTextField tfIdx, tfName, tfAge, tfEmail, tfJumin;
	
	// South 영역
	private JButton btnInsert, btnDelete;
	
	public CustomerGUI() {
		showFrame();
	}
	
	public void showFrame() {
		f = new JFrame("고객 관리 프로그램");
		f.setBounds(500, 300, 900, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// -----------------------------------------------------------------
		
		// North 영역 : 조회 조건
		JPanel pNorth = new JPanel();
		f.add(pNorth, BorderLayout.NORTH);
		pNorth.setLayout(new GridLayout(0, 4, 0, 0));
		
		// 조회 조건 sName 입력 패널
		JPanel panelName = new JPanel();
		pNorth.add(panelName);
		
		panelName.add(new JLabel("이름"));
		sName = new JTextField();
		panelName.add(sName);
		sName.setColumns(10);
		
		// 조회 조건 sAge 입력 패널
		JPanel panelAge = new JPanel();
		pNorth.add(panelAge);
		
		panelAge.add(new JLabel("나이"));
		sAge = new JTextField();
		panelAge.add(sAge);
		sAge.setColumns(10);
		
		// 조회 조건 sJumin 입력 패널
		JPanel panelJumin = new JPanel();
		pNorth.add(panelJumin);
		
		panelJumin.add(new JLabel("주민번호"));
		sJumin = new JTextField();
		panelJumin.add(sJumin);
		sJumin.setColumns(10);
		
		// 조회 버튼
		btnSelect = new JButton("조회");
		pNorth.add(btnSelect);
		
		// -----------------------------------------------------------------
		
		// West 영역 : 회원 정보 입력 영역
		JPanel pWest = new JPanel(new GridLayout(5, 0, 0, 0));
		f.add(pWest, BorderLayout.WEST);
		
		// 번호(IDX) 패널
		JPanel pIdx = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pWest.add(pIdx);
		
		pIdx.add(new JLabel("번  호"));
		tfIdx = new JTextField(10);
		pIdx.add(tfIdx);
		
		// 이름(NAME) 패널
		JPanel pName = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pWest.add(pName);
		
		pName.add(new JLabel("이  름"));
		tfName = new JTextField(10);
		pName.add(tfName);
		
		// 나이(AGE) 패널
		JPanel pAge = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pWest.add(pAge);
		
		pAge.add(new JLabel("나  이"));
		tfAge = new JTextField(10);
		pAge.add(tfAge);
		
		// 이메일(EMAIL) 패널
		JPanel pEmail = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pWest.add(pEmail);
		
		pEmail.add(new JLabel("E-Mail"));
		tfEmail = new JTextField(10);
		pEmail.add(tfEmail);
		
		// 주민번호(JUMIN) 패널
		JPanel pJumin = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pWest.add(pJumin);
		
		pJumin.add(new JLabel("주민번호"));
		tfJumin = new JTextField(10);
		pJumin.add(tfJumin);
		
		// -----------------------------------------------------------------
		
		// Center 영역 : 회원 정보 표시 영역
		JScrollPane scrollPane = new JScrollPane();
		f.add(scrollPane);
		table = new JTable();
		scrollPane.setViewportView(table);
		
		// 테이블 옵션 설정 : 셀 위치 이동 불가능하도록 설정
		table.getTableHeader().setReorderingAllowed(false);
		
		// 컬럼 제목 표시 위해 DefaultTableModel 객체 생성
		// 배열 사용하여 제목 생성한 뒤 Model 객체에 추가
		String[] columnNames = {"번  호", "이  름", "나  이", "E-Mail", "주민번호"};
		DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
		table.setModel(dtm);
		
		// -----------------------------------------------------------------
		
		// South 영역 : 버튼 표시 영역
		JPanel pSouth = new JPanel();
		f.add(pSouth, BorderLayout.SOUTH);
		
		btnInsert = new JButton("회원 추가");
		btnDelete = new JButton("회원 삭제");
		
		pSouth.add(btnInsert);
		pSouth.add(btnDelete);
		
		// -----------------------------------------------------------------
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new CustomerGUI();
	}
}
