package textRpg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class TextRpg {
	
	private static Hero hero;
	private static Monster monster;
	
	public static void main(String[] args) {
		
		// game
		Game game = new Game(42, 17);
		
		// Charactor
//		Hero hero = new Hero("●", "용사", 100, 21, 16, 10, 3);
//		Monster monster = new Monster("★", "몬스터", 100, 21, 1, 0, 0);
		
		// Frame
		JFrame jf = new JFrame();
		jf.setTitle("swing test");
		jf.setSize(500, 600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Pane
		JPanel jp = new JPanel();
		jp.setBounds(10, 10, 480, 580);
		jp.setLayout(null);
		
		// Input field
		JTextField event = new JTextField();
		event.setBounds(20, 510, 440, 30);

		// Stage
		JTextArea stage = new JTextArea();
		stage.setBackground(null);
		stage.setBounds(20, 20, 440, 300);
		stage.setBorder(new TitledBorder("MAP"));
		
		// Display
		JTextArea display = new JTextArea();
		display.setBounds(20, 330, 440, 110);

		// Start
		JButton startButton = new JButton("START");
		startButton.setBounds(20, 450, 440, 50);
		
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				hero = new Hero("●", "용사", 100, 21, 16, 10, 3);
				monster = new Monster("★", "몬스터", 100, 21, 1, 0, 0);
				
				game.updateMap(stage, hero, monster);
				
				event.requestFocus();
			}
		
		});
		
		
		event.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				display.setText("");
				
				if(monster.getHp() == 0) {
					display.setText("몬스터가 죽었습니다. 다시 시작하시려면 START 버튼을 눌러주세요.");
					return;
				}
				
				monster.move();
				
				switch (e.getKeyCode()) {
				case 37: // 왼쪽
					hero.setX(hero.getX() - 1);
					break;
				case 38: // 위
					hero.setY(hero.getY() - 1);
					break;
				case 39: // 오른쪽
					hero.setX(hero.getX() + 1);
					break;
				case 40: // 아래
					hero.setY(hero.getY() + 1);
					break;
				case 65: // 공격
					
					boolean attack = hero.attack(monster); 
					
					if (attack) {
						display.append("공격에 성공하였습니다." + "\n");
						display.append(monster.getName() + "의 남은 체력은 " + monster.getHp() + "입니다.");
					} else {
						display.setText("거리거 너무 멀거나, 몬스터가 피했습니다.");
					}
					
					break;
				default:
					display.setText("잘못된 키를 눌렀습니다." + "\n");
					break;
				}
				
				game.updateMap(stage, hero, monster);
				
				event.setText("");
			}
		});
		
		// add panel
		jp.add(startButton);
		jp.add(event);
		jp.add(stage);
		jp.add(display);
		
		// set frame
		jf.setContentPane(jp);
		jf.setVisible(true);
	}
}
