package starcraft.ver03;

/*
 * 접근제어지시자
 * public 
 * protected --상속관계 설정
 * default
 * private
 */

public class Unit {

	protected String name;
	protected int power;
	protected int hp;

	public Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	// 마린을 공격 합니다.
	public void attack(Marine m) {
		System.out.println(this.name + "이" + m.getName() + "을 공격합니다.");
		m.beAttacked(this.power);
	}
	
	// 질럿을 공격 합니다.
	public void attack(Zealot zlot) {
		System.out.println(this.name + "이" + zlot.getName() + " 을 공격 합니다.");
		zlot.beAttacked(this.power);
	}

	// 저글링을 공격 하빈다.
	public void attack(Zergling zling) {
		System.out.println(this.name + "이" + zling.getName() + "을 공격합니다.");
		zling.beAttacked(this.power);
	}

	
	public void beAttacked(int power) {
		if (hp <= 0) {
			System.out.println("[" + this.name + "]" + " 이미 사망하였습니다.");
			hp = 0;
			return;
		} else {
			hp -= power;
		}
	}

	public void showInfo() {
		System.out.println("=====상태창=====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}

}
