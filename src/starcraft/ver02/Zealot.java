package starcraft.ver02;

public class Zealot {

	private String name;
	private int power;
	private int hp;
	private static int count;

	public Zealot(String name) {
		this.name = name;
		power = 5;
		hp = 80;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount() {
		Zealot.count++;
	}

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	// 질럿이 저글링을 공격 합니다.
	public void attack(Zergling z) {
		System.out.println(this.name + "이" + z.getName() + "을 공격합니다.");
		z.beAttacked(this.power);
	}

	// 질럿이 마린을 공격 합니다.
	public void attack(Marine m) {
		System.out.println(this.name + "이" + m.getName() + "을 공격합니다.");
		m.beAttacked(this.power);
	}

	// 자신이 공격을 당합니다.
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
		System.out.println("이름 : "+this.name);
		System.out.println("공격력 : "+this.power);
		System.out.println("생명력 : "+this.hp);
	}
}
