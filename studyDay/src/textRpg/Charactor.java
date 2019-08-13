package textRpg;

public class Charactor {

	private String 	name;
	private int 	hp;
	private int 	x;
	private int 	y;
	private int 	power;

	public Charactor(String name, int hp, int x, int y, int power) {
		super();
		this.name = name;
		this.hp = hp;
		this.x = x;
		this.y = y;
		this.power = power;
	}
	
	/**
	 * 캐릭터 이동
	 */
	public void move() {
		
	}
	
	/**
	 * 공격
	 */
	public void attack() {
		
	}
	
	/**
	 * 거리확인
	 */
	public void distance() {
		
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

}
