package textRpg;

import javax.swing.JTextArea;

public class Game {
	
	private int width = 0;
	private int height = 0;
	
	public Game(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void updateMap(JTextArea stage, Charactor hero, Charactor monster) {
		
		stage.setText(""); // 스테이지 초기화
		
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				
				if (monster.getY() == y && monster.getX() == x) {
					stage.append(monster.getAvatar());
					continue;
				}
				
				if (hero.getY() == y && hero.getX() == x) {
					stage.append(hero.getAvatar());
					continue;
				}
				
				stage.append("☆");
			}
			stage.append("\n");
		}
		
	}
}
