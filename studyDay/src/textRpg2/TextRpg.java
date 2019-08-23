package textRpg2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class TextRpg extends JFrame implements KeyListener {
	
	JPanel 		jp;
	JTextArea 	map;
	JTextField 	inputKey;
	
	public TextRpg() {
		
		// JFrame
		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫을때 메모리 반환
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		
		map = new JTextArea();
		map.setBounds(10, 10, 300, 300);
		map.setBorder(new TitledBorder("MAP"));
		
		inputKey = new JTextField();
		inputKey.setBounds(10, 320, 100, 50);
		inputKey.setBorder(new TitledBorder("MAP"));
		inputKey.addKeyListener(this);

		jp.add(map);
		jp.add(inputKey);
		
		setContentPane(jp);
		
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
