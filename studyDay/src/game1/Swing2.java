package game1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Swing2 {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		jf.setTitle("swing test");
		jf.setSize(300, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jp = new JPanel();
		jp.setSize(280, 350);
		jp.setLocation(10, 10);
		
		jp.setLayout(null);
		
		JTextField jt1 = new JTextField();
		jt1.setSize(80, 50);
		jt1.setLocation(20, 20);

		JTextField jt2 = new JTextField();
		jt2.setSize(80, 50);
		jt2.setLocation(100, 20);
		
		JTextField jt3 = new JTextField();
		jt3.setSize(80, 50);
		jt3.setLocation(180, 20);
		
		JTextArea ja = new JTextArea();
		ja.setSize(240, 50);
		ja.setLocation(20,100);
		
		jt3.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
				int num1 = Integer.parseInt(jt1.getText());
				int num2 = Integer.parseInt(jt3.getText());
				String calc = jt2.getText(); 
				int result = 0;
				
				if(calc.equals("+")) {
					result = num1 + num2;
				}
				
				if(e.getKeyCode() == 10) {
					ja.setText(num1 + " " + calc + " " + num2 + " = " + result);
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		jp.add(jt1);
		jp.add(jt2);
		jp.add(jt3);
		jp.add(ja);
		
		jf.setContentPane(jp);
		
		jf.setVisible(true);
	}
}
