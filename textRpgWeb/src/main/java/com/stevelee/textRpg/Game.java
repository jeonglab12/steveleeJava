package com.stevelee.textRpg;

public class Game {

	private String 	tile = "<span class=\"tile\"></span>";
	private int 	width = 0;
	private int 	height = 0;

	public Game(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	/**
	 * 캐릭터들의 위치를 파악하여 맵을 새로 그린다.
	 * @param hero
	 * @param monster
	 * @return
	 */
	public String updateMap(Charactor hero, Charactor monster) {

		String map = "";

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {

				if (monster.getY() == y && monster.getX() == x) {
					System.out.println("몬스터");
					map += "<span class=\"charactor\">" + monster.getAvatar() + "</span>";
//					map += monster.getAvatar();
					continue;
				}
				
				if (hero.getY() == y && hero.getX() == x) {
					System.out.println("영웅");
					map += "<span class=\"charactor\">" + hero.getAvatar() + "</span>";
//					map += hero.getAvatar();
					continue;
				}
				
				map += tile;
				
			}
		}

		return map;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
