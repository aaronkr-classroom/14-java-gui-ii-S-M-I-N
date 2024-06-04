import javax.swing.*;

public class Ex15_02 extends JFrame {
	public Ex15_02() {
		setTitle("메뉴 만들기");
		setSize(400, 200);
		
		// 메뉴바 생성
		JMenuBar menuBar = new JMenuBar();
		
		JMenu m1 = new JMenu("File");
		JMenu m2 = new JMenu("Edit");
		JMenu m3 = new JMenu("Help");
		menuBar.add(m1);
		menuBar.add(m2);
		menuBar.add(m3);
		
		JMenuItem mf1 = new JMenuItem("New");
		JMenuItem mf2 = new JMenuItem("Open");
		m1.add(mf1);
		m1.add(mf2);

		JMenuItem me1 = new JMenuItem("Copy");
		JMenuItem me2 = new JMenuItem("Paste");
		m2.add(me1);
		m2.add(me2);
		
		setJMenuBar(menuBar);
		
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex15_02();

	}

}
