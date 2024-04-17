package basic.ch09_2;

import java.util.Random;

public class Warrior {

	int health;
	int attackPower;
	boolean isDie;
	
	public static int count = 0;
	
	public Warrior(){
		
	}

	public Warrior(int he, int at) {
		health = he;
		attackPower = at;
		count++;
		this.isDie = false;
	}

	public void warriorGA(String name, int ap) {// GetAttak ,//attak power
		health -= ap;
		System.out.println("전사가 " + name + "에게" + ap + "데미지를 입었습니다.");
		System.out.println("전사 남은 체력 : " + health);
	}
	
	public int  warriorA() {
		
		return 1;
	}

	public boolean getIsDie() {
		return isDie;
	}
	public void warriorD() {
	}



}
