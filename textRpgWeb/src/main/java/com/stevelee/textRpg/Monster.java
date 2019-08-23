package com.stevelee.textRpg;

public class Monster extends Charactor {
	
	public Monster(String avatar, String name, int hp, int x, int y, int power, int weapon) {
		super(avatar, name, hp, x, y, power, weapon);
	}
	
	@Override
	public void move() {
		
		int flag = (int) (Math.random() * 3);
		int distance = (int) (Math.random() * 2) + 1;
		
		// TODO 일단 좌우로만... 스테이지 영역 안 벗어나게 하기..
		if(flag == 0) {
			this.setX(this.getX());
		}else if(flag == 1) {
			this.setX(this.getX() - (distance * 1));
		}else if(flag == 2) {
			this.setX(this.getX() + (distance * 1));
		}
		
	}
}
