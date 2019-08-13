package game1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Swing3 {

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
		
		
		JButton jb1 = new JButton("save1");
		jb1.setSize(100, 50);
		jb1.setLocation(20, 180);

		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("save1 clicked");
				
				try {
					FileWriter fw = new FileWriter("C:\\stevelee\\steveleeJava\\studyDay\\src\\game1\\jbText1.txt", true);
					
					fw.write("\n" + jt.getText());
					fw.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				// clear
				jt.setText("");
			}
		});

		JButton jb2 = new JButton("save2");
		jb2.setSize(100, 50);
		jb2.setLocation(130, 180);
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("save2 clicked");
				
				try {
					FileWriter fw = new FileWriter("C:\\stevelee\\steveleeJava\\studyDay\\src\\game1\\jbText2.txt", true);
					
					fw.write("\n" + ja.getText());
					fw.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				// clear
				ja.setText("");
			}
		});
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jt);
		jp.add(ja);
		
		jf.setContentPane(jp);
		
		jf.setVisible(true);
	}
}
