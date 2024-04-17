package basic.ch09_2;

import java.util.Random;

public class Warrior {

	int health;
	int attackPower;
	boolean isDie;

	public static int count = 0;

	public Warrior() {

	}

	public Warrior(int he, int at) {
		health = he;
		attackPower = at;
		count++;
		this.isDie = false;
	}

	public void warriorGA(String name, int ap, int a, int b) {// GetAttak ,//attak power
		health -= ap;
		System.out.println(a + "," + b + " 전사가 " + name + "에게" + ap + "데미지를 입었습니다.");
		System.out.println("전사 남은 체력 : " + health);
		if (health <= 0) {
			this.isDie = true;// hp 0이하는 죽음으로 처리
			count--;// 생존자 수 -1
			Battlefiled.field[a][b] = "[x]";//죽은 객체 o->x로 표현 
			// System.out.println(count);	//현재 살아 있는 객체수
		}

	}

	public int warriorA() {

		return 1;
	}

	public boolean getIsDie() {
		return this.isDie;
	}



}
