package starcraft.ver01;

public class Marine {
	private String name;
	private int power;
	private int hp;
	private static int count;

	public static int getCount() {
		return count;
	}

	public static void setCount() {
		Marine.count++;
	}

	public Marine(String name) {
		this.name = name;
		power = 4;
		hp = 70;
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

	// 마린이 질럿을 공격 합니다.
	public void attackZealot(Zealot zlot) {
		System.out.println(this.name + "이" + zlot.getName() + " 을 공격 합니다.");
		zlot.beAttacked(this.power);
	}

	// 마린이 저글링을 공격 하빈다.
	public void attackZergling(Zergling zling) {
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
