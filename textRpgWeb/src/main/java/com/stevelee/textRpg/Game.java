package com.stevelee.textRpg;

public class Game {

	private String tile = "□";
	private int width = 0;
	private int height = 0;

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
					map += monster.getAvatar();
					continue;
				}
				
				if (hero.getY() == y && hero.getX() == x) {
					map += hero.getAvatar();
					continue;
				}
				
				map += tile;
				
			}

			map += "<br />";
		}

		return map;
	}
}
