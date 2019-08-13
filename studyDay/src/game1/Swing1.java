package game1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Swing1 {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		jf.setTitle("swing test");
		jf.setSize(300, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jp = new JPanel();
		jp.setSize(280, 350);
		jp.setLocation(10, 10);
		
		jp.setLayout(null);
		
		JTextField jt = new JTextField();
		jt.setSize(240, 50);
		jt.setLocation(20, 20);
		
		JTextArea ja = new JTextArea();
		ja.setSize(240, 50);
		ja.setLocation(20,100);

		jt.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				int keyN = e.getKeyCode();
				
				System.out.println("key down : " + keyN);
				
				if(keyN == 37) ja.setText(Integer.toString(keyN));
				if(keyN == 38) ja.setText(Integer.toString(keyN));
				if(keyN == 39) ja.setText(Integer.toString(keyN));
				if(keyN == 40) ja.setText(Integer.toString(keyN));
			}

		});
		
		
		jp.add(jt);
		jp.add(ja);
		
		jf.setContentPane(jp);
		
		jf.setVisible(true);
	}
}
