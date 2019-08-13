package textRpg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class TextRpg {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		jf.setTitle("swing test");
		jf.setSize(500, 600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jp = new JPanel();
		jp.setSize(480, 580);
		jp.setLocation(10, 10);
		
		jp.setLayout(null);
		
		JTextField jt = new JTextField();
		jt.setSize(240, 30);
		jt.setLocation(20, 510);
		
		JTextArea ja = new JTextArea();
		ja.setBackground(null);
		ja.setSize(440, 300);
		ja.setLocation(20, 30);
		ja.setBorder(new TitledBorder("MAP"));
		
		JTextArea ja2 = new JTextArea();
		ja2.setSize(250, 100);
		ja2.setLocation(20, 340);

		// Button 2
		JButton jb1 = new JButton("MAP");
		jb1.setSize(100, 50);
		jb1.setLocation(20, 450);
		
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("MAP CLICKED");
				
				for (int y = 0; y < 17; y++) {
					for (int x = 0; x < 20; x++) {
						ja.append("☆");
					}
					ja.append("\n");
				}
			}
		
		});
		
		
		// Button 2
		JButton jb2 = new JButton("save2");
		jb2.setSize(100, 50);
		jb2.setLocation(130, 450);
		
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("save2 clicked");
			}
		
		});
		
		
		// append panel
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jt);
		jp.add(ja);
		jp.add(ja2);
		
		// append frame
		jf.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				jt.requestFocus();
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		jf.setContentPane(jp);
		jf.setVisible(true);
	}
}
