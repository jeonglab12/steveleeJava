package com.stevelee.textRpg;

public class Charactor {

	private String	uuid;
	private String 	avatar;
	private String 	name;
	private int 	hp;
	private int 	x;
	private int 	y;
	private int 	power;
	private int 	weapon; // 사거리

	
	public Charactor(String uuid, String avatar, String name, int hp, int x, int y, int power, int weapon) {
		super();
		this.uuid = uuid;
		this.avatar = avatar;
		this.name = name;
		this.hp = hp;
		this.x = x;
		this.y = y;
		this.power = power;
		this.weapon = weapon;
	}

	/**
	 * 캐릭터 이동
	 */
	public void move() {

	}

	/**
	 * 공격
	 * @param charactor
	 * @return
	 */
	public boolean attack(Charactor charactor) {

		boolean flag = false;
		int dist = distance(charactor);

		if (dist <= weapon) {
			flag = true;
			charactor.setHp(charactor.getHp() - power);
		}else {
			flag = false;
		}
		
		return flag;
	}

	/**
	 * 거리확인
	 * @param charactor
	 * @return
	 */
	public int distance(Charactor charactor) {

		int distX = Math.abs(this.getX() - charactor.getX());
		int distY = Math.abs(this.getY() - charactor.getY());

		return distX + distY;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getWeapon() {
		return weapon;
	}

	public void setWeapon(int weapon) {
		this.weapon = weapon;
	}

}
